package com.dishesMS.controller;

import com.dishesMS.model.OrderMain;
import com.dishesMS.model.Table;
import com.dishesMS.service.IOrderMainService;
import com.dishesMS.service.ITableService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by aa123 on 2018/3/28.
 */
@Controller
@RequestMapping("/table")
public class TableController {
    @Resource
    private ITableService tableService;
    @Resource
    private IOrderMainService orderMainService;

    @RequestMapping("/lockTable/{tableId}")
    public String lockTable(@PathVariable Integer tableId, @CookieValue String id) {
        OrderMain orderMain = orderMainService.getRunOrderMain(Integer.valueOf(id));
        if (orderMain==null) {
            Table table = tableService.findTableById(tableId);
            if (table.getStatus() != Integer.valueOf(id)) {
                table.setStatus(Integer.valueOf(id));
                tableService.updateTableLit(table);
                table = tableService.findTableById(tableId);
            }
            //得到当前时间start
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            Date date = new Date();
            try {
                date = simpleDateFormat.parse(simpleDateFormat.format(date));
            } catch (ParseException e) {
                System.out.println("结账日期格式转换出错！");
                e.printStackTrace();
            }
            //得到当前时间end
            orderMain = new OrderMain();
            //赋值start
            orderMain.setOrderDate(date);
            orderMain.setId(Integer.valueOf(date.getYear() + (date.getMonth() + 1) + date.getDay() + date.getHours() + id));
            orderMain.setOrderStatus(0);
            orderMain.setMoney(0);
            orderMain.setTableId(table.getId());
            orderMain.setCustomerId(Integer.valueOf(id));
            orderMainService.addOrderMain(orderMain);
        }

        return "redirect:/customerJump/viewDishes";
    }

    @RequestMapping("jumpTable")
    public ModelAndView jumpTablePage() {
        ModelAndView modelAndView = new ModelAndView();
        List<Table> tables = tableService.findAllTable();
        modelAndView.addObject("tables", tables);
        modelAndView.setViewName("system/tableMng/tablePage");
        return modelAndView;
    }

    @RequestMapping("jumpAdd")
    public String jumpAdd() {
        return "system/tableMng/addTable";
    }

    @RequestMapping("add")   //新增桌台
    public String addTable(Table table) {
        if (null == tableService.findTableByAN(table)) {
            tableService.addTable(table);
        } else {
            return "error";
        }
        return "success";
    }

    @RequestMapping("jumpBatchAdd")
    public String jumpBatchAdd() {
        return "system/tableMng/batchAddTable";
    }

    @RequestMapping("batchAdd")  // 批量新增桌台
    public String batchAddTable(@Param("areaName") String areaName, @Param("startNum") int startNum, @Param("endNum") int endNum,
                                @Param("peopleNum") int peopleNum, @Param("describe") String describe) {
        Table table = new Table(areaName, Integer.toString(startNum), peopleNum, describe);
        int start = startNum;
        do {
            if (null == tableService.findTableByAN(table)) //判断桌台号是否已经存在
            {
                tableService.addTable(table);  //新增桌台
                start++;
                table.setNumber(Integer.toString(start));
            } else
                return "error";
        } while (start <= endNum);
        return "success";
    }

    @RequestMapping("jumpEdit")
    public ModelAndView jumpEditPage(int id) {
        Table table = tableService.findTableById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("table", table);
        modelAndView.setViewName("system/tableMng/editTable");
        return modelAndView;
    }

    @RequestMapping("edit")
    public String editTable(Table table) {
        if (tableService.reviseTable(table)) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("drop")
    public String dropTable(int id) {
        if (tableService.removeTable(id))
            return "success";
        else
            return "error";
    }

    @RequestMapping("makeQRCode")
    public String jumpMakeQRCode() {
        return "system/tableMng/QRCodeConfig";
    }
}

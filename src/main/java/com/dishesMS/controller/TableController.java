package com.dishesMS.controller;

import com.dishesMS.model.Table;
import com.dishesMS.service.ITableService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/3/28.
 */
@Controller
@RequestMapping("/table")
public class TableController {
    @Resource
    private ITableService tableService;

    @RequestMapping("jumpTable")
    public ModelAndView jumpTablePage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Table> tables = tableService.findAllTable();
        modelAndView.addObject("tables",tables);
        modelAndView.setViewName("system/tableMng/tablePage");
        return modelAndView;
    }

    @RequestMapping("jumpAdd")
    public String jumpAdd(){
        return "system/tableMng/addTable";
    }

    @RequestMapping("add")   //新增桌台
    public String addTable(Table table)
    {
        if(null != tableService.findTableByAN(table))
        {
            tableService.addTable(table);
        }else{
            return "error";
        }
        return "success";
    }

    @RequestMapping("jumpBatchAdd")
    public String jumpBatchAdd()
    {
        return "system/tableMng/batchAddTable";
    }
    @RequestMapping("batchAdd")  // 批量新增桌台
    public String batchAddTable(@Param("areaName") String areaName,@Param("startNum") int startNum,@Param("endNum") int endNum,
                                @Param("peopleNum") int peopleNum,@Param("describe") String describe){
        Table table = new Table(areaName,Integer.toString(startNum),peopleNum,describe);
        int start = startNum;
        do{
            if(null != tableService.findTableByAN(table)) //判断桌台号是否已经存在
            {
                tableService.addTable(table);  //新增桌台
                start++;
                table.setNumber(Integer.toString(start));
            }else
                return "error";
        }while(start <= endNum);
        return "success";
    }

    @RequestMapping("jumpEdit")
    public ModelAndView jumpEditPage(int id)
    {
        Table table = tableService.findTableById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("table",table);
        modelAndView.setViewName("system/tableMng/editTable");
        return modelAndView;
    }

    @RequestMapping("edit")
    public String editTable(Table table)
    {
        if(tableService.reviseTable(table))
        {
            return "success";
        }else
        {
            return "error";
        }
    }

    @RequestMapping("drop")
    public String dropTable(int id)
    {
        if(tableService.removeTable(id))
            return "success";
        else
            return "error";
    }

    @RequestMapping("makeQRCode")
    public String jumpMakeQRCode()
    {
        return "system/tableMng/QRCodeConfig";
    }
}

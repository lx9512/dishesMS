package com.dishesMS.controller;

import com.dishesMS.model.Role;
import com.dishesMS.model.Staff;
import com.dishesMS.service.IRoleService;
import com.dishesMS.service.IStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/24.
 */

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Resource
    private IStaffService staffService;
    @Resource
    private IRoleService roleService;

    @RequestMapping("add")
    public String addStaff(Staff staff,int roleId)
    {
        staff.setRole(new Role(roleId));
        staffService.saveStaff(staff);
        return "redirect:/staff/getAllStaff";
    }

    @RequestMapping("jumpAdd")
    public ModelAndView jumpAdd()
    {
        List<Role> roleList = roleService.findAllRole();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("roles",roleList);
        modelAndView.setViewName("system/peopleMng/addStaff");
        return modelAndView;
    }

    @RequestMapping("/getAllStaff")
    public void getAllStaff()
    {
        List<Staff> staffList = staffService.findAllStaff();
        for(Staff staff:staffList)
        {
            System.out.println(staff.getRole().getTitle());
        }
    }
}

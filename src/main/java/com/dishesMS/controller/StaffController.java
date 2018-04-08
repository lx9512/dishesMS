package com.dishesMS.controller;

import com.dishesMS.common.EncryptionByMD5;
import com.dishesMS.model.Role;
import com.dishesMS.model.Staff;
import com.dishesMS.service.IRoleService;
import com.dishesMS.service.IStaffService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.WebParam;
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

    @RequestMapping("login")
    public String login(@RequestParam("userName") String userName,@RequestParam("password") String password)
    {
        Subject currentUser = SecurityUtils.getSubject();

        if(!currentUser.isAuthenticated()){
            // 把用户名和密码封装为UsernamePasswordToken类
            UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
            //rememberme
            token.setRememberMe(true);
            try{
                currentUser.login(token);
            }
            //所有认证时异常的父类
            catch (AuthenticationException ae)
            {
                System.out.println("登录错误" + ae.getMessage());
                return "redirect:/login.jsp";
            }
        }
        return "/system/main";
    }

    @RequestMapping("add")
    public String addStaff(Staff staff,int roleId)
    {
        staff.setRole(new Role(roleId));
        // 对密码进行MD5，1024次加密
        String newPassword = EncryptionByMD5.encryptionPassword(staff.getPassword(),staff.getAccount()).toString();
        staff.setPassword(newPassword);
        if(true == staffService.saveStaff(staff))
            return "redirect:/staff/getAll";
        else
            return "用户已存在";
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

    @RequestMapping("jumpEditStaff")
    public String jumpEditStaffJSP()
    {
        return "/system/peopleMng/editStaff";
    }

    @RequestMapping("/getAll")
    public void getAllStaff()
    {
        List<Staff> staffList = staffService.findAllStaff();
        for(Staff staff:staffList)
        {
            System.out.println(staff.getRole().getTitle());
        }
    }

    @RequestMapping("jumpStaff")
    public ModelAndView jumpStaffPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Staff> staffList = staffService.findAllStaff();
        modelAndView.addObject("staffs",staffList);
        modelAndView.setViewName("/system/peopleMng/staffPage");
        return modelAndView;
    }

    @RequestMapping("edit")
    public String editStaff(Staff staff,int roleId)
    {

        staff.setRole(new Role(roleId));
        if(true == staffService.reviseStaff(staff))
            return "success";
        return "error";
    }

    @RequestMapping("jumpEdit")
    public ModelAndView jumpEdit(int id)
    {
        ModelAndView modelAndView = new ModelAndView();
        Staff staff = staffService.findStaffById(id);
        List<Role> roleList = roleService.findAllRole();
        modelAndView.addObject("staff",staff);
        modelAndView.addObject("roles",roleList);
        modelAndView.setViewName("/system/peopleMng/editStaff");
        return modelAndView;
    }

    @RequestMapping("drop")
    public String dropStaff(int id)
    {
        if(true == staffService.removeStaff(id))
            return "success";
        return "error";
    }


}

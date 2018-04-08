package com.dishesMS.controller;

import com.dishesMS.model.Role;
import com.dishesMS.service.IRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */
@Controller
@RequestMapping("role")
public class RoleController {
    @Resource
    private IRoleService roleService;

    @RequestMapping("add")
    public String addRole(Role role)
    {
        //System.out.println(role.getDiscribe());
        if(true == roleService.createRole(role))
        {
            System.out.println("create role successful");
            List<Role> roles = roleService.findAllRole();
            return "system/peopleMng/addRole";
        }
        else
            return "角色已存在";
    }
    @RequestMapping("edit")
    public String editRole(Role role)
    {
        if(true == roleService.reviseRole(role))
        {
            System.out.println("role 修改成功");
            return "redirect:/role/jumpRolePage";
        }
        System.out.println("role 修改失败");
        return "error";
    }

    @RequestMapping("drop")
    public String dropRole(int id)
    {
        roleService.removeRole(id);
        return null;
    }

    @RequestMapping("jumpRolePage")
    public ModelAndView jumpRolePage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Role> roles = roleService.findAllRole();
        modelAndView.addObject("roles",roles);
        modelAndView.setViewName("system/peopleMng/rolePage");
        return modelAndView;
    }

    @RequestMapping("jumpEditPage")
    public ModelAndView jumpEditPage(@RequestParam int id)
    {
        ModelAndView modelAndView = new ModelAndView();
        Role role = roleService.findRoleById(id);
        modelAndView.addObject("role",role);
        modelAndView.setViewName("/system/peopleMng/editRole");
        return modelAndView;
    }

    @RequestMapping("jumpAddPage")
    public String jumpAddPage()
    {
       return "/system/peopleMng/addRole";
    }
}

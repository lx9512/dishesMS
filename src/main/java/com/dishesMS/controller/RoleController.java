package com.dishesMS.controller;

import com.dishesMS.model.Role;
import com.dishesMS.service.IRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */
@Controller
@RequestMapping("role")
public class RoleController {
    @Resource
    private IRoleService iRoleService;

    @RequestMapping("add")
    public String addRole(Role role)
    {
        //System.out.println(role.getDiscribe());
        iRoleService.createRole(role);
        System.out.println("create role successful");
        List<Role> roles = iRoleService.findAllRole();
        return "system/peopleMng/addRole";

    }
}

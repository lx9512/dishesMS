package com.dishesMS.service.imp;

import com.dishesMS.dao.IRoleDAO;
import com.dishesMS.model.Role;
import com.dishesMS.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */

@Service("roleService")
public class RoleServiceImp implements IRoleService {
    @Resource
    private IRoleDAO roleDAO;
    public void createRole(Role role) {
        this.roleDAO.saveRole(role);
    }

    public List<Role> findAllRole()
    {
        return this.roleDAO.selectAll();
    }
}

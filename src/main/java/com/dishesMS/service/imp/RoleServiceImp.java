package com.dishesMS.service.imp;

import com.dishesMS.dao.IRoleDAO;
import com.dishesMS.model.Role;
import com.dishesMS.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */

@Service("roleService")
public class RoleServiceImp implements IRoleService {

    @Resource
    private IRoleDAO roleDAO;
    public boolean createRole(Role role) {
        Role roleDB = roleDAO.selectRoleByTitle(role.getTitle());
        if (null == roleDB)
        {
            this.roleDAO.saveRole(role);
            return true;
        }else
            return false;
    }

    public List<Role> findAllRole()
    {
        return this.roleDAO.selectAll();
    }

    public boolean reviseRole(Role role)
    {
        try{
            roleDAO.updateRole(role);

        }catch(Exception e)
        {
            System.out.println("role update error" + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean removeRole(int id) {
        try{
            roleDAO.deleteRole(id);
        }catch (Exception e){
            System.out.println("role delete error" + e.getMessage());
            return false;
        }
        return true;
    }

    public Role findRoleById(int id) {
        return roleDAO.selectRoleById(id);
    }


}

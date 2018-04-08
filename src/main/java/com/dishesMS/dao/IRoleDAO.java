package com.dishesMS.dao;

import com.dishesMS.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */

@Repository("roleDAO")
public interface IRoleDAO {

    public int saveRole(Role role);
    public List selectAll();
    public Role selectRoleByTitle(String title);
    public void updateRole(Role role);
    public void deleteRole(int id);
    public Role selectRoleById(int id);
}

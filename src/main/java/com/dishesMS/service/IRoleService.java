package com.dishesMS.service;

import com.dishesMS.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */

public interface IRoleService {
    public boolean createRole(Role role);
    public List<Role> findAllRole();
    public boolean reviseRole(Role role);
    public boolean removeRole(int id);
    public Role findRoleById(int id);
}

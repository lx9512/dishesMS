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
}

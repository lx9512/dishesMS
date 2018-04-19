package com.dishesMS.common;

import com.dishesMS.model.Staff;
import org.apache.shiro.SecurityUtils;

/**
 * Created by aa123 on 2018/4/18.
 */
public class LoginUtil {
    public static Staff getLoginStaff()
    {
        Object object = SecurityUtils.getSubject().getPrincipal();
        Staff staff = null;
        if(object instanceof Staff)
        {
            staff = (Staff) object;
        }
        return staff;
    }
}

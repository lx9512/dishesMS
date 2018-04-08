package com.dishesMS.shiro;

import com.dishesMS.model.Staff;
import com.dishesMS.service.IStaffService;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * Created by aa123 on 2018/3/1.
 */
public class ShiroRealm extends AuthenticatingRealm {

    @Resource
    private IStaffService staffService;

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // AuthenticationToken 强制转换为 UsernamePasswordToken 并获取用户名
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        String userName = usernamePasswordToken.getUsername();
        //从数据库中获取username 对应的用户记录
        Staff staff = staffService.findStaffByAccount(userName);
        if(staff == null)
        {
            throw new UnknownAccountException("用户不存在!");
        }

        //构建AuthenticationInfo 对象并返回，通常使用实例是simpleAuthenticationInfo

        //principal:认证的实体信息，可以是username，也可以是用户的数据表实体
        Staff principal = staff;
        //credential:密码
        Object credential = staff.getPassword();
        //realmname: 当前realm 对象的name，调用父类的getName() 方法即可
        String realmname = getName();
        //增加盐值加密，一般使用唯一字符串，此处用用户名作为盐值
        ByteSource credentialsSalt = ByteSource.Util.bytes(userName);
        SimpleAuthenticationInfo info;// = new SimpleAuthenticationInfo(principal,credential,realmname);
        info = new SimpleAuthenticationInfo(principal,credential,credentialsSalt,realmname);

        return info;
    }

    /*
    public static void main(String[] args)
    {
        String hashAlgorithmName = "MD5";
        Object credentials = "admin";
        Object salt = ByteSource.Util.bytes("admin");
        int hashIterations = 1024;

        Object result = new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations);
        System.out.println(result);
    }

    */
}

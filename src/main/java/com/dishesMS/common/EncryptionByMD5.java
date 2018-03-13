package com.dishesMS.common;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * Created by aa123 on 2018/3/5.
 */
public class EncryptionByMD5 {
    private static String hashAlgorithmName = "MD5";  //加密算法
    private static int hashIterations = 1024;       //加密次数

    // credentials 明文密码，saltString 加密盐值字符串一般为用户名
    public static Object encryptionPassword(Object credentials,String saltString)
    {
        Object salt = ByteSource.Util.bytes(saltString);  //加密盐值生成
        Object result = new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations);
        return result;
    }

    public String getHashAlgorithmName() {
        return hashAlgorithmName;
    }

    public void setHashAlgorithmName(String hashAlgorithmName) {
        this.hashAlgorithmName = hashAlgorithmName;
    }

    public int getHashIterations() {
        return hashIterations;
    }

    public void setHashIterations(int hashIterations) {
        this.hashIterations = hashIterations;
    }
}

package com.zzh.common.util.md5;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.DigestUtils;

public class PasswordEncodeAndMatchUtil {
     private   static String secret = "iamyoudaddy";
    public static void main(String[] args) {
//        test1();
        bCrypt();
    }

    /**
     * md5加密  缺点存在彩虹表攻击
     */
    public static void test1(){
        byte[] bytes = DigestUtils.md5Digest(secret.getBytes()); //这个加密处理显示乱码
        String s = DigestUtils.md5DigestAsHex(secret.getBytes());
        System.out.println("第一次加密：" + new String(bytes));
        System.out.println("第一次加密：" + s);
        s = DigestUtils.md5DigestAsHex(secret.getBytes());
        System.out.println("第二次加密：" + s);
    }

    /**
     * 避免彩虹表攻击的加密
     *
     */
    public static void bCrypt(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode(secret);
        System.out.println(encode);
        boolean matches = passwordEncoder.matches(secret, encode);//验证
        System.out.println("第一次验证：" + matches);
        String encode2 = passwordEncoder.encode(secret);
        System.out.println(encode2);
        boolean matches1 = passwordEncoder.matches(secret, encode2);
        System.out.println("第一次验证：" + matches1);
    }

    public static String encode(String pwd){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(pwd);
    }

    public static boolean parseAndMatch(String pwd,String pwdEncode){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
       return passwordEncoder.matches(pwd,pwdEncode);
    }
}

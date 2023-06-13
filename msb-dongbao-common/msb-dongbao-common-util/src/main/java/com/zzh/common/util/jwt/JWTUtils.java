package com.zzh.common.util.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JWTUtils {
    private static final String  secrit = "whoisyoudaddy";
    public static String createToken(String subject){
        String token = Jwts.builder()
                //设置token的过期时间
                .setExpiration(new Date(System.currentTimeMillis() + 5000))
                //设置主题对应第二个逗号的base64编码内容
                .setSubject(subject)
                //用加密算法和盐值加密成第三段token的内容
                .signWith(SignatureAlgorithm.HS256, secrit)
                .compact();
        return token;
    }

    public static String parseToken(String token){
        Claims body = Jwts.parser()
                .setSigningKey(secrit)
                .parseClaimsJws(token)
                .getBody();
        return body.getSubject();
    }

    public static void main(String[] args) throws InterruptedException {
        String zhangsan = createToken("zhangsan");
        System.out.println(zhangsan);
        String parseToken = parseToken(zhangsan);
        System.out.println(parseToken);
        Thread.sleep(6000);
         parseToken = parseToken(zhangsan);
        System.out.println(parseToken);
    }
}

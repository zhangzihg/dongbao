package com.zzh.dongbao.protal.web.vo;

import java.util.Date;

public class UmsMemberVO {
    private Long id;

    private String username;

    private String password;

    /**
     * 头像
     */
    private String icon;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 备注信息
     */
    private String note;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    private Integer status;
}

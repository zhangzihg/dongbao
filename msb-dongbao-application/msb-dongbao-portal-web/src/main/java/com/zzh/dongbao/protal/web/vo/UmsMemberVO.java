package com.zzh.dongbao.protal.web.vo;

import com.zzh.common.base.enums.SexEnum;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;
@Data
public class UmsMemberVO {
    private Long id;

    @NotBlank(message = "用户名不能为空")
    @Size(min = 1,max = 8,message = "长度在1-8")
    private String username;

    @NotNull
    private SexEnum sex;
    @NotBlank
    private String password;

    /**
     * 头像
     */
    private String icon;

    /**
     * 邮箱
     */
    @Email
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

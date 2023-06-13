package com.zzh.dongbao.protal.web.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@ToString
@Builder
public class UmsMemberLoginVO {

    @NotBlank(message = "用户名不能为空")
    @Size(min = 1,max = 8,message = "长度在1-8")
    private String username;

    @NotBlank
    private String password;

    private String token;
}

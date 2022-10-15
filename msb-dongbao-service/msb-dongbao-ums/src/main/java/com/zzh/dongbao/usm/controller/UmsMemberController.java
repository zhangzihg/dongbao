package com.zzh.dongbao.usm.controller;


import com.zzh.dongbao.usm.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author zzh
 * @since 2022-10-15
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;
}


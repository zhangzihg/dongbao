package com.zzh.dongbao.protal.web.controller;

import com.zzh.dongbao.protal.web.vo.UmsMemberVO;
import com.zzh.ums.api.dto.UmsMemberDTO;
import com.zzh.ums.api.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户接口
 */
@RestController
@RequestMapping("/user")
public class UmsController {
    @Autowired
    private UmsMemberService umsMemberService;

    @GetMapping("test")
    public String test(){
        return "hello";
    }

    @PostMapping("register")
    public String registerUser(@RequestBody UmsMemberVO umsMemberVO){
        UmsMemberDTO umsMemberDTO = new UmsMemberDTO();
        BeanUtils.copyProperties(umsMemberVO,umsMemberDTO);
        int i = this.umsMemberService.registerUer(umsMemberDTO);
        return String.valueOf(i);
    }
}

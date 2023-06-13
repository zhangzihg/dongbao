package com.zzh.dongbao.protal.web.controller;

import com.zzh.common.base.result.ResultWarpper;
import com.zzh.common.util.md5.PasswordEncodeAndMatchUtil;
import com.zzh.dongbao.protal.web.vo.UmsMemberVO;
import com.zzh.ums.api.dto.UmsMemberDTO;
import com.zzh.ums.api.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
    public String test(@RequestBody @Validated UmsMemberVO umsMemberVO){
//        int i = 1/0;
//        Integer i = null;
//        if(i.equals("1")){
//            return "wda";
//        }

        return "hello";
    }

    @GetMapping("testEnum")
    public UmsMemberVO testEnum(@RequestBody  UmsMemberVO umsMemberVO){
        String username = umsMemberVO.getUsername();
        UmsMemberDTO userByName = umsMemberService.getUserByName(username);
        UmsMemberVO tmp = new UmsMemberVO();
        BeanUtils.copyProperties(userByName,tmp);
        return tmp;
    }


    @PostMapping("register")
    public ResultWarpper<String> registerUser(@RequestBody @Validated UmsMemberVO umsMemberVO){
        UmsMemberDTO umsMemberDTO = new UmsMemberDTO();
        BeanUtils.copyProperties(umsMemberVO,umsMemberDTO);
        //密码脱敏
        umsMemberDTO.setPassword(PasswordEncodeAndMatchUtil.encode(umsMemberDTO.getPassword()));
        int i = this.umsMemberService.registerUer(umsMemberDTO);
        if(i > 0){
            return ResultWarpper.setSuccessResult().build();
        } else {
          return ResultWarpper.setFailedResult().build();
        }
    }
}

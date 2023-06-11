package com.zzh.ums.api;

import com.zzh.ums.api.dto.UmsMemberDTO;
import com.zzh.ums.api.service.UmsMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UmsMemberServiceTest {
    @Autowired
    private UmsMemberService umsMemberService;

    @Test
    public void testInserUser(){

        this.umsMemberService.registerUer(UmsMemberDTO.builder().icon("icon01").nickName("xiaohuang").password("123456").build());
    }
}

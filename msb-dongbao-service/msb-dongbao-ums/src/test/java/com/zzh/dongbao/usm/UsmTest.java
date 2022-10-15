package com.zzh.dongbao.usm;

import com.zzh.dongbao.usm.entity.UmsMember;
import com.zzh.dongbao.usm.mapper.UmsMemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsmTest {
    @Autowired
    UmsMemberMapper umsMemberMapper;
    @Test
    public void testUmsInsert(){
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername("test04");
        umsMember.setEmail("123@qq.com");
        umsMemberMapper.insert(umsMember);
    }
    @Test
    public void testUmsUpdate(){
        UmsMember umsMember = new UmsMember();
        umsMember.setId(1581140633781817345L);
        umsMember.setUsername("test004");
        umsMember.setEmail("123@qq.com");
        umsMemberMapper.updateById(umsMember);
    }
}

package com.zzh.dongbao.usm.service.impl;

import com.zzh.dongbao.usm.entity.UmsMember;
import com.zzh.dongbao.usm.mapper.UmsMemberMapper;
import com.zzh.dongbao.usm.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author zzh
 * @since 2022-10-15
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;
}

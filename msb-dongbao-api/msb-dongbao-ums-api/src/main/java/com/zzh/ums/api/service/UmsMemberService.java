package com.zzh.ums.api.service;

import com.zzh.ums.api.dto.UmsMemberDTO;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author zzh
 * @since 2023-06-07
 */
@Repository
public interface UmsMemberService  {
    int registerUer(UmsMemberDTO user);
}

package com.zzh.dongbao.usm.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Arrays;
import java.util.Date;

/**
 * 自动插入更新时间
 */
public class DBAutoUpdateFiledConfig implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Arrays.stream(metaObject.getSetterNames()).forEach((i) ->{
            System.out.println(i);
        });
        metaObject.setValue("gmtCreate",new Date());
        metaObject.setValue("gmtModified",new Date());

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("gmtModified",new Date());
    }
}

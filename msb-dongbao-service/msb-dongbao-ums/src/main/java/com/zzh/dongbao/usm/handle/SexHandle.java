package com.zzh.dongbao.usm.handle;

import com.zzh.common.base.enums.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.springframework.stereotype.Component;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 处理性别的枚举，使其在数据库存的是0,1这种数字
 */
@MappedTypes(value = String.class)
//@MappedJdbcTypes(value = JdbcType.VARCHAR)
@Component
public class SexHandle implements TypeHandler<SexEnum> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
//        preparedStatement.setByte(i,(byte) sexEnum.getCode());
//        preparedStatement.setInt(i,sexEnum.getCode());
        preparedStatement.setString(i,String.valueOf(sexEnum.getCode()));
    }

    @Override
    /**
     *   根据列表获取数据库枚举对应的值
     *   下面第一种写法返回的枚举对象，这样不会返回给前端对应的msg信息
     */
    public SexEnum getResult(ResultSet resultSet, String s) throws SQLException {
        return SexEnum.getMsgByCode(resultSet.getInt(s));
    }

    @Override
    /**
     * 根据索引获取数据返回结果集中的枚举值
     */
    public SexEnum getResult(ResultSet resultSet, int i) throws SQLException {
        return SexEnum.getMsgByCode(resultSet.getInt(i));
    }

    @Override
    /**
     * 存储过程，跟上面一样正常调用就行
     */
    public SexEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return SexEnum.getMsgByCode(callableStatement.getInt(i));
    }
}

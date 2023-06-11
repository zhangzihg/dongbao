import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

public class MyGenerator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String outputDirPath="D:\\AboutProgram\\code\\Java_Pro\\msb-dongbao-mall-parent\\msb-dongbao-service\\msb-dongbao-ums\\src\\main\\java";
        gc.setOutputDir(outputDirPath);
        //设置打开目录
        gc.setOpen(true);
        //是否覆盖
        gc.setFileOverride(true);
        //去除service的I前缀
        gc.setServiceName("%sService");
        gc.setDateType(DateType.ONLY_DATE);
        gc.setIdType(IdType.ID_WORKER);
        gc.setAuthor("zzh");
        gc.setOpen(false);
         gc.setSwagger2(false);// 实体属性 Swagger2 注解

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3308/dongbao_test?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.zzh.dongbao.usm");
        pc.setController("controller");
        pc.setService("service");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //表名驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
//        列的驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        要生成的表
        strategy.setInclude("ums_member");
        //开启Lombok
        strategy.setEntityLombokModel(true);
        //设置逻辑删除
        strategy.setLogicDeleteFieldName("deleted");
        strategy.setRestControllerStyle(true);
        // 自动填充
        List<TableFill> tableFillList = new ArrayList<>();
        TableFill tableGmtCreateFill = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill tableGmtUpdateFill = new TableFill("gmt_modified",FieldFill.INSERT_UPDATE);
        tableFillList.add(tableGmtCreateFill);
        tableFillList.add(tableGmtUpdateFill);
        strategy.setTableFillList(tableFillList);

        //乐观锁
        strategy.setVersionFieldName("version");
        //restController风格
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);// localhost:xxx/hello_2

        mpg.setStrategy(strategy);
        mpg.execute();
    }
}

# dongbao

聚合项目maven，application项目需要都依赖service项目和api项目，否则会在controller中自动注入service对象时会失败，在启动类添加包扫描也没用。
【猜测应该是在注入时也会需要api的实现类因为没有引入对应依赖而报错 】
没有msb-dongbao-ums启动报错：
***************************

Description:

Field umsMemberService in com.zzh.dongbao.protal.web.controller.UmsController required a bean of type 'com.zzh.ums.api.service.UmsMemberService' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true)


Action:

Consider defining a bean of type 'com.zzh.ums.api.service.UmsMemberService' in your configuration.


===================================
也需要在启动类上添加service、api的包扫描不然伊日惠启动报错。因为聚合项目如果不加包扫描，找不到其他模块的类

Description:

Field umsMemberService in com.zzh.dongbao.protal.web.controller.UmsController required a bean of type 'com.zzh.ums.api.service.UmsMemberService' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true)
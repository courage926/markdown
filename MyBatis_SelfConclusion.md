# MyBatis

## 1.建表
<img alt="MyBatic_SelfConclusion-af135788.png" src="assets/MyBatic_SelfConclusion-af135788.png" width="" height="" >

## 2.domain  
根据数据表写domain 属性要写注释  
<img alt="MyBatic_SelfConclusion-ee56596d.png" src="assets/MyBatic_SelfConclusion-ee56596d.png" width="" height="" >

## 3.dao  
根据domain写dao接口规范  
<img alt="MyBatic_SelfConclusion-b4b91b1a.png" src="assets/MyBatic_SelfConclusion-b4b91b1a.png" width="" height="" >

## 4.impl  
利用dao接口生成实现类    
<img alt="MyBatic_SelfConclusion-3ba914a7.png" src="assets/MyBatic_SelfConclusion-3ba914a7.png" width="" height="" >

## 5.test  
利用dao接口生成测试类    
<img alt="MyBatic_SelfConclusion-1e565328.png" src="assets/MyBatic_SelfConclusion-1e565328.png" width="" height="" >

## 6.util  
抽取公共部分做工具类  
<img alt="MyBatic_SelfConclusion-10ecd6e0.png" src="assets/MyBatic_SelfConclusion-10ecd6e0.png" width="" height="" >

## 7.mapper  
写XxxMapper.java(接口)和XxxMapper.xml   
xml文件-->namespace,ONG语句  
查询要设置结果类型    
<img alt="MyBatic_SelfConclusion-44427f0b.png" src="assets/MyBatic_SelfConclusion-44427f0b.png" width="" height="" >

## 8.rescources
### db.properties  
数据库连接四要素  
<img alt="MyBatic_SelfConclusion-41d01df8.png" src="assets/MyBatic_SelfConclusion-41d01df8.png" width="" height="" >  
### log4j,properties  
记录日志  
注意包名要对应  
<img alt="MyBatic_SelfConclusion-6bd848e1.png" src="assets/MyBatic_SelfConclusion-6bd848e1.png" width="" height="" >  
### mybatis.config.xml  
主配置文件:  
<img alt="MyBatic_SelfConclusion-e2a27eab.png" src="assets/MyBatic_SelfConclusion-e2a27eab.png" width="" height="" >

## lib
<img alt="MyBatic_SelfConclusion-1d89ba13.png" src="assets/MyBatic_SelfConclusion-1d89ba13.png" width="" height="" >

## all
<img alt="MyBatic_SelfConclusion-76512e51.png" src="assets/MyBatic_SelfConclusion-76512e51.png" width="" height="" >

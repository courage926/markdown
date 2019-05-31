# 事务 (Transaction)
## 定义
把多个操作放在一起,变成一个不可分割的整体  
全部成功才是成功  
一个失败,全部失败   
## 操作
```
try{
    //1.开启事务,在多个操作前,设置手动的去操作事务
    conn.setAutoCommit(false);//禁止自动提交事务
    //使用当前连接对象去做多个操作
    操作1
    操作2
    操作3

    //2.提交事务
    conn.commit();

    }catch{
      //3.回滚事务
      conn.rollback();
    }finally{
      关闭资源
    }
```
## 获取自动生成主键
### 原因:
id是保存的时候生成的,获取自动生成主键便于下一步操作  
### 如何获取:
1.conn.preparedStatement(sql,Statement.RETURN_GENERATED_KEYS)  //设置标记  
2.ps.getGeneratedKeys();//获取自动生成的主键    

# DataSource
## 原因:
重复利用数据库连接对象
## 连接池使用/不使用连接池区别
<img alt="Transaction_DataSource-bfb6a035.png" src="assets/Transaction_DataSource-bfb6a035.png" width="" height="" >  
## DBCP
1.导包  
2.获取数据库连接对象(配置文件要写对)  
3.所有客户端使用一个连接池,线程安全
## druid
阿里巴巴的号称性能最好最好的

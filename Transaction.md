# 事务
## 操作
开启事务  
提交事务(commit)  
回滚事务(rollback)  

把多个操作放在一起,变成一个不可分割的整体   
全部成功才是成功  
一个失败,全部失败  


## 事务ACID属性  
1.原子性 Atomicity  
2.一致性 Consistency  
3.隔离性 Isolation  
4.持久性 Durability  

## 模板
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

## 注意:  
一次连接下的多个操作

## 获取自动生成的主键
why:  
how:  
autoGenerateKeys=statement.RETURN.....
<img alt="Transaction-42f17eeb.png" src="assets/Transaction-42f17eeb.png" width="" height="" >

## 连接池如何管理连接对象(面试题)
<img alt="Transaction-cf1b0f5c.png" src="assets/Transaction-cf1b0f5c.png" width="" height="" >

<img alt="Transaction-4c8e525b.png" src="assets/Transaction-4c8e525b.png" width="" height="" >

<img alt="Transaction-6438f923.png" src="assets/Transaction-6438f923.png" width="" height="" >

## DataSource(数据源)=Connection Pool(连接池)

## DBCP连接池


<img alt="Transaction-df4f3f15.png" src="assets/Transaction-df4f3f15.png" width="" height="" >

# 访问修饰符
```
default
private
public
protected:https://www.runoob.com/java/java-modifier-types.html#protected-desc
```
<img alt="java-ebbee256.png" src="assets/java-ebbee256.png" width="" height="" >

# 非访问修饰符
```
static:
静态变量:一个类只有一份
静态方法:不能使用类的非静态变量,从参数列表得到数据,然后计算
可以通过:类名.变量名/方法名访问
```
```
final:
final变量:
一旦赋值后,不能被重新赋值,被final修饰的实例变量必须显式指定初始值
final方法:
可以被子类继承,但不能被子类修改
声明final方法的目的就是防止该方法的内容被修改
final类:
不能被继承
```
```
abstract:
抽象类:不能实例化对象
声明抽象类的目的是为了将来对该类进行扩充
抽象方法:
没有任何实现的方法,方法的实现由子类提供
不能被声明为final和static
抽象类的子类必须继承父类的所有抽象方法,除非子类也是抽象类
```
```
synchronized
synchronized声明的方法同一时间只能被一个线程访问
```
```
transient
jvm会跳过被修饰的变量,不会持久化
```
```
volatile
每次被线程访问时,都强制从共享内存中重新读取该成员变量的值.
在任何时刻,两个不同的线程看到的成员变量的同一个值
```


<img alt="java-f1f882b3.png" src="assets/java-f1f882b3.png" width="" height="" >

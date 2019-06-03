# <center>项目一总结
# 知识点
## FreeMarker
- 数据+模板=输出(html/txt/java/class/...)
- 常用指令:
  - include/assign/list
    - <#include 文件路径>  
    - <#assign key=value>
    - <#list 集合 as 元素>

## 配置
```
依赖
模板路径
视图解析器
```
## FreeMarker异常
- 插值:${对象.属性}
- 空值处理:${对象.属性}或者${对象.属性!默认值}

## 分页插件
- 作用:兼容不同的数据库,不受sql影响
- 使用流程:
  - PageHelper
  - PageInfo
- 注意事项:
Mybatis.xml中引入插件
```
<plugins>
    <!-- com.github.pagehelper为PageHelper类所在包名 -->
    <plugin interceptor="com.github.pagehelper.PageInterceptor">
        <!--当pageNum<=0时，将pageNum设置为1-->
        <!--当pageNum>pages时，将pageNum设置为pages-->
        <property name="reasonable" value="true"/>
    </plugin>
</plugins>
```
applicationContext.xml关联mybati.xml
```
<bean id="mySqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <!-- 连接池 -->
        <property name="dataSource" ref="myDataSource"/>
        <!-- 映射文件路径 -->
        <property name="mapperLocations" value="classpath:cn/wolfcode/crm/mapper/*Mapper.xml"/>
        <property name="configLocation" value="classpath:mybatis.xml"/>
    </bean>
```
page.ftl
```
<script>
    //分页
    $(function(){
        $("#pagination").twbsPagination({
            totalPages: ${result.pages}||1,
                startPage: ${result.pageNum} || 1,
                visiblePages:5,
                first:"首页",
                prev:"上页",
                next:"下页",
                last:"尾页",
                initiateStartPageClick:false,
                onPageClick:function(event,page){
            $("#currentPage").val(page);
            $("#searchForm").submit();
        }
    });
    })
</script>
```
mapper.xml
```
<select id="queryForList" resultType="cn.wolfcode.crm.domain.Department">
        SELECT *
        FROM department
</select>
```
service接口:PageResult->PageInfo
```
PageInfo<Department> query(QueryObject qo);
```
serviceImpl
```
public PageInfo<Department> query(QueryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(),qo.getPageSize());
        List<Department> list = mapper.queryForList(qo);
        return new PageInfo<>(list);
    }
```
## 模态框
```
body下的直接子元素
只能同时打开一个模态框
$("#editModal").modal("show");
```

回显
1. 标签绑定数据: data-xxx='${...}';
2. domain中添加getJson方法
```
public String getJson(){
     Map<String,Object> map = new HashMap<>();
     map.put("id",id);
     map.put("name",name);
     map.put("sn",sn);
     return JSON.toJSONString(map);
 }
```
3. js中
```
$("#editForm input").val("");//清空数据
var json = $(this).data("xxx")//对应data-xxx
if(json) {        
        $("input[name=id]").val(json.id);
        $("input[name=name]").val(json.name);
        $("input[name=sn]").val(json.sn);
}
```


## jquery-form 表单异步提交插件
1. 发送请求
2. 接收响应数据(json格式)
3. 根据结果给出提示
4. 刷新页面
<img alt="项目一-2d790fba.png" src="assets/项目一-2d790fba.png" width="" height="" >
```
本身带有提交按钮 用ajaxForm
本身不带提交按钮 用ajaxSubmit
```
```
jquery-form.js导入
```
```js
$("#editForm").ajaxSubmit(function(data){
    if(data.success){
      ...
    }else{
      ...
    }
  })
```
JsonResult
```
@Setter@Getter
public class JsonResult {
    private boolean success = true;
    private String errorMsg;
    public void mark(String errorMsg){
        this.success=false;
        this.errorMsg=errorMsg;
    }
}
```
```
Controller
@ResponseBody
返回类型改为JsonResult
```
## jquery-bootstrap消息提示插件
```
function handleMessage(data) {
            if(data.success){
                $.messager.alert("温馨提示","执行成功,两秒后返回");
                setTimeout(function () {
                    window.location.reload();
                    console.log("2s后再执行这里");
                },2000)
                console.log("先执行这里");
            }else{
                $.messager.alert("温馨提示",data.errorMsg+"请确认后再试");
            }
        }
```

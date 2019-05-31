# BOM
浏览器操作模型
# 三种框
alert 弹出  
confirm 确认  
prompt 输入  
# 定时器(ms毫秒)
1.只执行一次  
setTimeout(fn,time)  
2.周期循环  
setInterval(fn,time)  
# DOM
文档对象模型:对html增删改查    
<img alt="JS高级(总结)-e5abf7ff.png" src="assets/JS高级(总结)-e5abf7ff.png" width="" height="" >
# DOM获取元素
1.getElementById  
2.getElementByTagName  
3.getElementClassName  
# Node属性和方法
<img alt="JS高级(总结)-dd1d6146.png" src="assets/JS高级(总结)-dd1d6146.png" width="" height="" >
# 元素节点和属性操作
- 获取属性值
  - node["attr"]
  - node.attr
  - node.getAttribute("attr")

- 设置属性值
  - node["attr"]=value
  - node.attr=value
  - node.setAttribute("attr",value)
- 特殊属性操作
  - node.checked = checked
  - node.selected = selected
  - class:node.className=xxx;
  - style.backgroundColor = red(-去掉,驼峰命名)
  - readOnly = true|false

# 元素节点的常用方法
  <img alt="JS高级(总结)-4069d852.png" src="assets/JS高级(总结)-4069d852.png" width="" height="200" >

# 事件处理
- *事件驱动编程:*
  - 事件源/事件主体:元素/标签
  - 事件名称:onclick...
  - 事件响应函数:function
  - 事件对象 event

# 事件绑定
1.在标签上使用 onclick 属性配置  
2.ele.onclick=function(event)  
3.浏览器兼容
ie:[Object].attachEvent("on"+“name_of_event_handler”, fnHandler);  
w3c:[Object].addEventListener(“name_of_event“, fnHandler);  

# 事件相关
<img alt="JS高级(总结)-651bec8b.png" src="assets/JS高级(总结)-651bec8b.png" width="" height="" >

| Header One | Header Two |
|:---------- |:---------- |
| Item One   | Item Two   |

add 

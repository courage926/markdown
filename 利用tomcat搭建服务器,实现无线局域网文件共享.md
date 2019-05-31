相关知识:
html网页制作
tomcat搭建服务器

将服务器与访问设备置于同一个局域网下
服务器:电脑
访问设备:手机
局域网:无线路由

win+r   
<img alt="利用tomcat搭建服务器,实现无线局域网文件共享-71331ebc.png" src="assets/利用tomcat搭建服务器,实现无线局域网文件共享-71331ebc.png" width="" height="" >

ipconfig命令查看本机(服务器)ip  
<img alt="利用tomcat搭建服务器,实现无线局域网文件共享-22094e48.png" src="assets/利用tomcat搭建服务器,实现无线局域网文件共享-22094e48.png" width="" height="" >

手机访问的话,要关闭防火墙  
<img alt="利用tomcat搭建服务器,实现无线局域网文件共享-b4c86e99.png" src="assets/利用tomcat搭建服务器,实现无线局域网文件共享-b4c86e99.png" width="" height="" >


tomcat的config的web.xml  
修改目录结构显示权限为可视  
<img alt="利用tomcat搭建服务器,实现无线局域网文件共享-d342bcbf.png" src="assets/利用tomcat搭建服务器,实现无线局域网文件共享-d342bcbf.png" width="" height="" >

tomcat的config的server.xml  
支持中文  
<img alt="利用tomcat搭建服务器,实现无线局域网文件共享-9aeeeaf6.png" src="assets/利用tomcat搭建服务器,实现无线局域网文件共享-9aeeeaf6.png" width="" height="" >

用要共享的文件夹代替tomcat原来的ROOT

电脑端访问效果  
<img alt="利用tomcat搭建服务器,实现无线局域网文件共享-000e53cd.png" src="assets/利用tomcat搭建服务器,实现无线局域网文件共享-000e53cd.png" width="" height="" >

手机端访问地址:
将localhost替换为192.168.0.100

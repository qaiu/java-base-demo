此版本开始完成第二步:处理请求工作
上一个版本中ClientHandler通过实例化HttpRequest
完成解析请求工作,因此ClientHandler下一步操作就是对请求进行处理
首先我们先对客户端请求的一个页面这样的操作进行处理
因此此版本先准备一个页面

实现:
1:在当前目录下新建一个目录webapps
     改目录用于保存我们服务器中所有可运行的webapp
  每个webapp就是一个网络应用,里面应当包含页面,静态资源,逻辑代码(就是一个网站需要的内容)
  
2:在webapps下新建一个网络应用myweb(名为myapp的子目录)

3:在myweb目录里新建一个页面index.html 

4:ClientHandler完成第二步处理
  首先用户在浏览器输入路径
  如: http://localhost:8088/myweb/index.html
  
此时ClientHandler第二部请求时通过Request获取请求行中的uri值时,应当是
/myweb/index.html
然后实例化一个File,并从webapp目录下根据请求路径/myweb/index.html就应该可以找到我们
创建的 文件:./webapps/myweb/index.html了

然后添加分支,根据文件判断是否存在并分别打桩
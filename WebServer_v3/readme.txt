本版本开始整理请求内容
思想:
一个请求的内容东西很多,因此我们设计一个类,名为
HttpRequest,并且将请求中的各个信息以属性定义
然后每当我们解析一个客户端发送过来的请求后都实例化一个
HttpRequest,并将信息赋值给对应的属性
这样将来处理请求时我们可以获取对应的属性得到请求中的相关信息


实现:
1:首先创建一个包:com.webserver.http

2:在包里定义类:HttpRequest
该类每一个实例将用来表示客户端发送过来的一个请求内容

3:在ClientHandler中实例化HttpRequest完成第一步处理工作:解析请求
  而解析请求的实际操作有HttpRequest的构造方法来完成
  即:实例化HttpRequest的同时将客户端发送过来的请求解析完毕,
  使得我们HttpRequest对象就是表示该请求的






此版本继续完成第三步:响应客户端工作
上个版本已经实现了响应客户端工作,但是ClientHandler中响应操作的代码有重复
(响应资源和404操作)
因此我们要讲响应的代码重用

与请求的设计思想一致,我们再设计一个类:
HttpResponse,使用当前类的一个实例表示服务器给客户端发送的内容

然后在处理请求的部分我们将响应的内容设置到response实例中,最后统一调用其flush方法
让response的内容以标准的Http响应格式发送给客户端

实现:
1.在http包里建一个类:HttpResponse
2:定义构造方法以及flush方法
  flush方法用于将HttpResponse对象的内容以一个标准的HTTP格式发送给客户端
3:迁移ClientHandler中发送响应的代码到flush中
4:ClientHandler将要发送给客户端的资源设置到HttpResponse中并调用
  flush方法去完成响应
 
 这样一来,响应资源与404都可以用flush方法来重用
 发送响应的代码了
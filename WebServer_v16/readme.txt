完成用户登录功能

流程
1:用户访问登录页面(从index.html点击超链接)
2:在登录页面输入用户名,密码并点击登陆按钮
3:数据提交到服务器处理登录
4:服务器响应结果(成功或者失败)

实现:
1:创建相关页面
  1.1:login.html,登陆页面
  	该页面上的form表单 action="./login"
  1.2:login_success.html,成功登录提示
   	显示登录成功
  1.3:login_fail,登录失败提示页面
  	显示:登录失败用户名或密码不正确
  
 2:在com.webserver.servlet包添加一个类:
   LoginServlet,定义service方法处理登陆业务
   2.1:首先通过request获取用户名密码
   2.2:使用RAF读取user.dat文件
   	循环读取每一条记录如果正确,则设置Response响应登录成功页面
   	如果不正确或文件没有跳转到失败页面
   
 3: 在ClientHandler处理分支中,判断path值是不是注册业务后添加一个else if分支
 判断是否是登录
 
 若果是,就实例化LoginServlet并调用service方法
 提示:登录业务的请求地址应改为"/myweb/login"
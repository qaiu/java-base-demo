继续重构代码
上一版本中我们在HttpContext中定义了一个Map
用来保存资源后缀以及对应的Content-Type的值
但是初始化的操作我们是固定存放6个信息
实际上有一千多种

我们直接使用TOMCAT提供的对应信息
在tomcat安装目录下,进入conf目录,里面有一个web.xml
文件,该文件整理了所有的资源后缀的对应关系

在我们的项目目录下新建一个conf文件夹,然后将该文件拷贝进来,
然后通过解析该文件初始化HttpContext中的这个Map
使得我们的服务器也能支持所有的资源
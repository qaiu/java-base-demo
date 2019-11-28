继续解决上一个版本中的第二个问题:
发送Content-Type时,值是固定的text/html

上个版本那种,我们在ClientHandler处理请求的环节
为HttpResponse添加我们发送的响应头
但是添加的Content-Type还是写死的text/html
我们应当根据实际客户端请求的文件类型来设置这个头
使得浏览器能正确理解其请求的资源

常见的Content-Type的值与对应的资源后缀名

资源后缀名                   Content-Type
html         text/html
css          text/css
js           application/javascript
png          image/png
gif          image/gif
jpg          image/jpeg

实现
在HttpResponse的setEntity方法中,设置了正文内容后,根据文件的后缀来设置
响应头
Content-Type和Content-Length
这样做因为,只要有响应正文,那么响应头一定包含这两项
因此我们将这两个头的操作放在
setEntity里

这样做好后,我们可以将原来ClientHandler中处理请求里设置响应头Content-Type和Content-Length
操作删除了
package day18.spring;

@Controller
public class UserController {
	//自动装配
	//自动从SpringContext,获取UserServer实例
	@Autowired
	private UserService userServer;
	public void test() {
		System.out.println("\n--控制器对象----------------------");
		System.out.println("调用业务对象"+userServer);
		userServer.test();
	}
}

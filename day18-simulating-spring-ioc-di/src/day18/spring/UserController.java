package day18.spring;

@Controller
public class UserController {
	//�Զ�װ��
	//�Զ���SpringContext,��ȡUserServerʵ��
	@Autowired
	private UserService userServer;
	public void test() {
		System.out.println("\n--����������----------------------");
		System.out.println("����ҵ�����"+userServer);
		userServer.test();
	}
}

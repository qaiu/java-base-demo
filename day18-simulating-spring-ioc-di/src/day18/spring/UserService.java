package day18.spring;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void test() {
		System.out.println("\n--ҵ�����----------------------");
		System.out.println("�������ݶ���"+userDao);
		userDao.test();
	}
}

package day18.spring;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void test() {
		System.out.println("\n--业务对象----------------------");
		System.out.println("调用数据对象"+userDao);
		userDao.test();
	}
}

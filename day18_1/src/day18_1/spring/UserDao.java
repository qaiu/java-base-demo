package day18_1.spring;


@Component
public class UserDao {
	//通过注解,从配置文件获取数据,为url等变量赋值
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driver}")
	private String driver;
	
	//测试输出
	public void test() {
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(driver);
	}

}

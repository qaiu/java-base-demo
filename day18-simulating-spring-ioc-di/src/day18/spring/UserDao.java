package day18.spring;

@Component
public class UserDao {
	//通过注解,从配置文件获取配置数据,并为url变量赋值
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driver}")
	private String dirver;
	
	public void test() {
		System.out.println(this.url);
		System.out.println(this.userName);
		System.out.println(this.password);
		System.out.println(this.dirver);
	}
	
	
}

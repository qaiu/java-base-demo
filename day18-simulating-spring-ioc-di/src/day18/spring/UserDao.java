package day18.spring;

@Component
public class UserDao {
	//ͨ��ע��,�������ļ���ȡ��������,��Ϊurl������ֵ
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

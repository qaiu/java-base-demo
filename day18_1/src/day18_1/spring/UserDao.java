package day18_1.spring;


@Component
public class UserDao {
	//ͨ��ע��,�������ļ���ȡ����,Ϊurl�ȱ�����ֵ
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driver}")
	private String driver;
	
	//�������
	public void test() {
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(driver);
	}

}

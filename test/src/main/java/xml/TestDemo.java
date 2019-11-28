package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * ʹ��DOM�ķ�ʽ����XML�ĵ�
 *
 * @author QAIU
 *
 */

public class PacersXmlDemo {
    public static void main(String[] args) {
        /*
         * ����һ��XML�Ĵ������� 1:����SAXReader 2:ʹ��SAXReader��ȡҪ������XML�ĵ� ������Document����
         * ������̾���DOM������ʱ����Դ�ĵط� ��Ϊ����XML�ĵ�����ȫ����ȡ��� �����ڽ����������Ľṹ 3:ͨ��Document�����ȡ��Ԫ��
         * 4:����XML��ʾ�����ṹ,�Ӹ�Ԫ�ؿ�ʼ�𼶱��� �Ե����ȡXML�ĵ����ݵ�Ŀ��
         */
        // ��emplist.xml�ļ����Ա����Ϣ��������

        List<Emp> empList = new ArrayList<Emp>();

        try {
            // 1
            SAXReader reader = new SAXReader();
            // 2
            Document doc = reader.read(new File("./emplist.xml"));
            // 3 ��ȡ��Ԫ��<list>
            /*
             * Element��ÿһ��ʵ�����ڱ�ʾXML�ĵ��е�һ����ǩ ͨ��Element���ǿ��Եõ����ʾ��Ԫ�ص�һ����Ϣ
             *
             * String getName() ��ȡ��ǰԪ�ص�����(��ǩ��)
             *
             * String getText() String getTextTrim() ��ȡԪ���м���ı�(��ʼ�ڽ���Ԫ���м���ı���Ϣ)
             *
             * Element element(String name) ��ȡ��ǰԪ����ָ�����ֵ���Ԫ��
             *
             * List elements() ��ȡ��ǰԪ����������Ԫ��
             *
             * List elements(String name) ��ȡ��ǰԪ��������ͬ����Ԫ��(ָ����)
             */
            Element root = doc.getRootElement();
            System.out.println(root.getName());
            /*
             * ��ȡ����ǩ�����е�<emp>��ǩ
             */
            List<Element> list = root.elements("emp");
            System.out.println(list.size());
            for (Element empEle : list) {
                String name = empEle.elementTextTrim("name");
                // ��ȡԱ��������
                System.out.print("����:" + name);
                // ��ȡ�Ա�
                String gender = empEle.elementTextTrim("gender");
                System.out.print(", �Ա�:" + gender);
                // ��ȡ����

                int age = Integer.parseInt(empEle.elementTextTrim("age"));
                System.out.print(", ����:" + age);
                // ��ȡнˮ
                int salary = Integer.parseInt(empEle.elementTextTrim("salary"));
                System.out.print(", нˮ:" + salary);
                // ��ȡ����id
//				Attribute attr = empEle.attribute("id");
//				int id = Integer.parseInt(attr.getValue());
                int id = Integer.parseInt(empEle.attributeValue("id"));
                System.out.println(",id:" + id);
                Emp emp = new Emp(id, name, age, gender, salary);
                empList.add(emp);
            }
            for (Emp emp : empList) {
                System.out.println(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

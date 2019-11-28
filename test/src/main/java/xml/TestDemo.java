package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * 使用DOM的方式解析XML文档
 *
 * @author QAIU
 *
 */

public class PacersXmlDemo {
    public static void main(String[] args) {
        /*
         * 解析一个XML的大致流程 1:创建SAXReader 2:使用SAXReader读取要解析的XML文档 并生成Document对象
         * 这个过程就是DOM解析耗时耗资源的地方 因为解析XML文档数据全部读取完毕 并且内建整个棵树的结构 3:通过Document对象读取根元素
         * 4:遍历XML表示的树结构,从根元素开始逐级遍历 以到达获取XML文档数据的目的
         */
        // 将emplist.xml文件里的员工信息解析出来

        List<Emp> empList = new ArrayList<Emp>();

        try {
            // 1
            SAXReader reader = new SAXReader();
            // 2
            Document doc = reader.read(new File("./emplist.xml"));
            // 3 获取根元素<list>
            /*
             * Element的每一个实例用于表示XML文档中的一个标签 通过Element我们可以得到其表示的元素的一切信息
             *
             * String getName() 获取当前元素的名字(标签名)
             *
             * String getText() String getTextTrim() 获取元素中间的文本(开始于结束元素中间的文本信息)
             *
             * Element element(String name) 获取当前元素下指定名字的子元素
             *
             * List elements() 获取当前元素下所有子元素
             *
             * List elements(String name) 获取当前元素下所有同名子元素(指定的)
             */
            Element root = doc.getRootElement();
            System.out.println(root.getName());
            /*
             * 获取跟标签下所有的<emp>标签
             */
            List<Element> list = root.elements("emp");
            System.out.println(list.size());
            for (Element empEle : list) {
                String name = empEle.elementTextTrim("name");
                // 获取员工的名字
                System.out.print("名字:" + name);
                // 获取性别
                String gender = empEle.elementTextTrim("gender");
                System.out.print(", 性别:" + gender);
                // 获取年龄

                int age = Integer.parseInt(empEle.elementTextTrim("age"));
                System.out.print(", 年龄:" + age);
                // 获取薪水
                int salary = Integer.parseInt(empEle.elementTextTrim("salary"));
                System.out.print(", 薪水:" + salary);
                // 获取属性id
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

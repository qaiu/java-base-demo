package map;

import java.util.HashMap;
import java.util.Map;


/**
 * java.util.Map�ӿ�
 * ���ұ�
 * Map���ֵĽṹ��һ���������еı��,���г�ΪKey
 * �ұ߳�ΪValue
 * Map���Ǹ���key��ȡ��Ӧ��Value
 * ��˱�������ʱ�ǳɶԱ����
 * ���Ҳ�ѯ��ʱ��Ӧ������ѯ������ΪValue
 * ��ѯ������Ϊkey����
 * mapҪ��key�����ظ�(equals�Ƚ��ж�)
 * 
 * ���õ�ʵ����
 * java.util.HashMap,ɢ�б�
 * �����ѯ�ٶ��������ݽṹ
 * @author QAIU
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		/*
		 * V put(K k,V v)
		 * ��������Key-Value����Map
		 * ����Key�������ظ�,����
		 * ��ʹ���ظ���Key�洢�����滻��Ӧ��Value����
		 * ��ô����ֵ����Keyԭ����Ӧ��Value
		 * ��������Key�������򷵻�null
		 */
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		Integer value = map.put("��ѧ", 99);
		System.out.println(value);
		System.out.println(map);
		value = map.put("��ѧ", 98);
		System.out.println(value);
		System.out.println(map);
		value = map.get("��ѧ");
		System.out.println("��ѧ:"+value);
		/*
		 * V remove(Object key)
		 * ɾ��Map����ĵ�Key��Ӧ�ļ�ֵ��
		 * ����ֵ��Key��Ӧ��Value
		 * ��������ڷ���null
		 */
		value = map.remove("��ѧ");
		System.out.println(value);
		System.out.println(map);
		value = map.remove("��");
		System.out.println(value);
		System.out.println(map);
		
		/*
		 * int size()
		 * ����MapԪ�ظ���
		 */
		int size = map.size();
		System.out.println(size);
		/*
		 * �жϵ�ǰMap�Ƿ����������Key��Value
		 */
		boolean ck = map.containsKey("����");
		System.out.println("����Key:"+ck);
		boolean cv = map.containsValue(97);
		System.out.println("����Value:"+cv);
		
//		map.forEach(null);
		/*
		 * Map�ı���
		 * Map�ṩ�����ֱ�������
		 * 1:�������е�Key
		 * 2:����һ���ֵ��
		 * 3:��������Value(������)
		 * 
		 */
	}
}

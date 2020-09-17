package tut.day04.d1map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap�洢�Զ������ͼ�ֵ
 * Map���ϱ�֤key��Ψһ��
 *     ��Ϊkey��Ԫ�أ�������дhashCode������equals�������Ա�֤keyΨһ
 */
public class Demo04HashMapSavePerson {

	public static void main(String[] args) {
		/*
		 * HashMap�洢�Զ������ͼ�ֵ
		 * key��String����
		 *     String���ͣ��Ѿ���дhashCode������equals���������Ա�֤keyΨһ
		 * value��Person����
		 *     value�����ظ���ͬ��ͬ���������Ϊͬһ���ˣ�
		 */
		// ����HashMap����
		HashMap<String, Person> map = new HashMap<>();
		// �����������Ԫ��
		map.put("����", new Person("����", 18));
		map.put("�Ϻ�", new Person("����", 19));
		map.put("����", new Person("����", 20));
		map.put("����", new Person("����", 18));
		// ʹ��keySet����ǿfor����map����
		Set<String> set = map.keySet();
		for (String key : set) {
			Person value = map.get(key);
			System.out.println(key + "->" + value);
		}
		System.out.println("================");
		
		/*
		 * HashMap�洢�Զ������ͼ�ֵ
		 * key��Person����
		 *     Person��ͱ�����дhashCode������equals�������Ա�֤keyΨһ
		 * value��String����
		 *     value�����ظ�
		 */
		// ����HashMap����
		HashMap<Person, String> map2 = new HashMap<>();
		// �����������Ԫ��
		map2.put(new Person("����", 18), "�س�");
		map2.put(new Person("����", 18), "�س�");
		map2.put(new Person("����", 18), "�س�");
		map2.put(new Person("����", 18), "����");
		// ʹ��entrySet����ǿfor����Map����
		Set<Map.Entry<Person, String>> set2 = map2.entrySet();
		for (Map.Entry<Person, String> entry : set2) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "->" + value);
		}
	}
}

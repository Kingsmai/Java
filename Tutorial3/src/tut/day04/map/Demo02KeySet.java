package tut.day04.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵĵ�һ�ֱ�����ʽ��ͨ������ֵ�ķ�ʽ
 * Map�����еķ�����
 *     Set<K> keySet() ���ش�ӳ���а����ļ���Set��ͼ��
 * ʵ�ֲ��裺
 *     1. ʹ��Map�����еķ���keySet()����Map�������е�keyȡ�������洢��һ��Set������
 *     2. ����Set���ϣ���ȡMap�����ֵ�ÿһ��key
 *     3. ͨ��Map�����еķ���get(key)���ҵ�value
 */
public class Demo02KeySet {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 21);
		map.put("����", 19);
		map.put("����", 25);
		
		// 1. ʹ��Map�����еķ���keySet()����Map�������е�keyȡ�������洢��һ��Set������
		Set<String> set = map.keySet();
		
		// 2. ����Set���ϣ���ȡMap�����ֵ�ÿһ��key
		// ʹ�õ���������Set����
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			// 3. ͨ��Map�����еķ���get(key)���ҵ�value
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("====================");
		
		// ʹ����ǿfor����Set����
		for (String key : set) {
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("====================");
		
		// �򻯣�����1��2��3ֱ��ͨ����ǿforѭ�����
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}
}

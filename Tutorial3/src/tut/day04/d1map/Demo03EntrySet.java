package tut.day04.d1map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵĵ�һ�ֱ�����ʽ��ʹ��Entry�������
 * Map�����еķ�����
 *     Set<Map.Entry<K, V>> entrySet() ���ش�ӳ���а�����ӳ���Set��ͼ��
 * ʵ�ֲ��裺
 *     1. ʹ��Map�����еķ���entrySet()����Map�����ж��Entry����ȡ�������洢��һ��Set������
 *     2. ����Set���ϣ���ȡÿһ��Entry����
 *     3. ʹ��Entry�����еķ���getKey()��getValue()��ȡ����ֵ
 */
public class Demo03EntrySet {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 21);
		map.put("����", 19);
		map.put("����", 25);
		
		// 1. ʹ��Map�����еķ���entrySet()����Map�����ж��Entry����ȡ�������洢��һ��Set������
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		// 2. ����Set���ϣ���ȡÿһ��Entry����
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			// 3. ʹ��Entry�����еķ���getKey()��getValue()��ȡ����ֵ
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("==============");
		
		// ʹ����ǿforѭ��
		for (Map.Entry<String, Integer> entry : set) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("==============");
		
		// �򻯣�����1��2��3ֱ��ͨ����ǿforѭ�����
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}
}

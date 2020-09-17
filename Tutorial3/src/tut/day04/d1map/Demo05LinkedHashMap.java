package tut.day04.d1map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * java.util.LinkedHashMap<K, V> extends HashMap<K, V>
 * Map�ӿڵĹ�ϣ�������ʵ�֣����п�Ԥ��ĵ���˳��
 * �ײ�ԭ��
 *     ��ϣ�� + ������¼Ԫ�ص�˳��
 */
public class Demo05LinkedHashMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "a");
		map.put("c", "c");
		map.put("b", "b");
		map.put("a", "d");
		System.out.println(map); // {a=d, b=b, c=c}��key�������ظ��������
		
		LinkedHashMap<String, String> linked = new LinkedHashMap<>();
		linked.put("a", "a");
		linked.put("c", "c");
		linked.put("b", "b");
		linked.put("a", "d");
		System.out.println(linked); // {a=d, c=c, b=b}��key�������ظ��������
	}
}

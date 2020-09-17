package tut.day04.d1map;

import java.util.HashMap;
import java.util.Map;

/*
 * java.util.Map<K, V>����
 * Map���ϵ��ص㣺
 * 1. Map������һ��˫�м��ϣ�һ��Ԫ�ذ�������ֵ��key��value��
 * 2. Map�����е�Ԫ�أ�key��value�������Ϳ�����ͬ��Ҳ���Բ�ͬ
 * 3. Map�����е�Ԫ�أ�key�ǲ������ظ��ģ�value�ǿ����ظ���
 * 4. Map�����е�Ԫ�أ�key��valueһһ��Ӧ
 * 
 * java.util.HashMap<K, V>���� implements Map<K, V>�ӿ�
 * HashMap���ϵ��ص㣺
 * 1. HashMap���ϵĵײ��ǹ�ϣ����ѯ���ٶ��ر�Ŀ�
 *     JDK1.8֮ǰ������+��������
 *     JDK1.8֮������+��������/������������ȳ���8λ������߲�ѯ���ٶ�
 * 2. HashMap������һ������ļ��ϣ��洢Ԫ�غ�ȡ��Ԫ�ص�˳���п��ܲ�һ��
 * 
 * java.util.LinkedHashMap<K, V>���� extends HashMap<K, V>����
 * LinkedHashMap���ϵ��ص㣺
 * 1. LinkedHashMap���ϵĵײ��ǹ�ϣ��+������֤������˳��
 * 2. LinkedHashMap������һ������ļ��ϣ��洢Ԫ�غ�ȡ��Ԫ�ص�˳��һ��
 */
public class Demo01Map {

	public static void main(String[] args) {
		/*
		 * V put(K key, V value) ��ָ����ֵ���ӳ���е�ָ�������������ѡ��������
		 *     ����ֵ��V
		 *         �洢��ֵ�Ե�ʱ��key���ظ�������ֵV��null
		 *         �洢��ֵ�Ե�ʱ��key�ظ�����ʹ���µ�value�滻Map���ظ���value�����ر��滻��valueֵ
		 */
		// ����Map���϶���
		Map<String, String> map = new HashMap<>();
		
		String v1 = map.put("����", "����");
		System.out.println("v1: " + v1); // v1: null
		System.out.println(map); // {����=����}
		
		String v2= map.put("����", "����");
		System.out.println("v2: " + v2); // v2: ����
		System.out.println(map); // {����=����}
		
		map.put("����", "����");
		map.put("����", "�ܰ�");
		map.put("���", "С��Ů");
		map.put("��־ƽ", "С��Ů");
		System.out.println(map); // {����=����, ����=�ܰ�, ����=����, ���=С��Ů, ��־ƽ=С��Ů}�������
		System.out.println("==================");
		
		/*
		 * V remove(Object key) ������ڣ���Ӹ�ӳ�����Ƴ�����ӳ�䣨��ѡ��������
		 *     ����ֵ��V
		 *         key���ڣ�V���ر�ɾ����ֵ
		 *         key�����ڣ�V����null
		 */
		// ����Map���϶���
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("����", 21);
		map2.put("����", 19);
		map2.put("����", 25);
		System.out.println(map2); // {����=19, ����=21, ����=25}
		
		Integer v3 = map2.remove("����"); // Integer -> int �Զ�����
		System.out.println("v3: " + v3); // v3: 25
		System.out.println(map2); // {����=19, ����=21}
		
		Integer v4 = map2.remove("����");
		System.out.println("v4: " + v4); // v4: null
		System.out.println(map2); // {����=19, ����=21}
		// �����int���գ�����java.lang.NullPointerException
		// null ���Ը�ֵ�� Integer ��װ�࣬���ǲ��ܸ�ֵ����������
//		int v5 = map2.remove("����"); // Integer -> int �Զ�����
		// ���Բ�����ֱ��ʹ�û����������������н���
		System.out.println("==================");
		
		/*
		 * V get(Object key) ����ָ����ӳ�䵽��ֵ�������ӳ�䲻��������ӳ�䣬�򷵻� null ��
		 *     ����ֵ��V
		 *         key���ڣ����ض�Ӧvalueֵ
		 *         key�����ڣ�����null
		 */
		System.out.println(map2); // {����=19, ����=21}
		Integer v6 = map2.get("����");
		System.out.println("v6: " + v6); // v6: 21
		System.out.println(map2); // {����=19, ����=21}��get�����޸ļ�������
		
		Integer v7 = map2.get("����");
		System.out.println("v7: " + v7); // v7: null
		System.out.println("==================");
		
		/*
		 * boolean containsKey(Object key) �����ӳ�����ָ������ӳ�䣬�򷵻� true ��
		 *     ����ֵ��boolean
		 *         ����������true
		 *         ������������false
		 */
		System.out.println(map2); // {����=19, ����=21}
		boolean b1 = map2.containsKey("����");
		System.out.println("b1: " + b1); // b1: true
		
		boolean b2 = map2.containsKey("����");
		System.out.println("b2: " + b2); // b2: false
	}
}

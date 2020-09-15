package tut.day04.map;

import java.util.HashMap;
import java.util.Hashtable;

/*
 * java.util.Hashtable<K, V>���� implements Map<K, V>����
 * 
 * Hashtable���ײ�Ҳ��һ����ϣ����һ���̰߳�ȫ�ļ��ϣ��ǵ��̵߳ļ��ϣ��ٶ���
 * HashMap���ײ���һ����ϣ����һ���̲߳���ȫ�ļ��ϣ��Ƕ��̵߳ļ��ϣ��ٶȿ�
 * 
 * HashMap���ϣ�֮ǰ��ѧ�����м��ϣ������Դ洢nullֵ��null��
 * Hashtable���ϣ����ܴ洢nullֵ��null��
 * 
 * Hashtable��Vector����һ������JDK1.2֮�󱻸��Ƚ��ļ���ȡ���ˡ�
 * Vector -> ArrayList
 * Hashtable -> HashMap
 * Hashtable������Properties��Ȼ��Ծ����ʷ����̨
 * 
 * Properties��һ��Ψһ��IO�����ϵļ���
 */
public class Demo06Hashtable {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put(null, "a");
		map.put("b", null);
		map.put(null, null); // nullҲ����key�ظ�
		System.out.println(map); // {null=null, b=null}
		
		Hashtable<String, String> table = new Hashtable<>();
//		table.put(null, "a"); // java.lang.NullPointerException
//		table.put("b", null); // java.lang.NullPointerException
//		table.put(null, null); // java.lang.NullPointerException
	}
}

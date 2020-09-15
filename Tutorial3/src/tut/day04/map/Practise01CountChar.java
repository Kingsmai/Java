package tut.day04.map;

import java.util.HashMap;
import java.util.Scanner;

/*
 * ��ϰ�������ַ����У�ÿ���ַ����ֵĴ���
 * 
 * ������
 * 1. ʹ��Scanner��ȡ�û�������ַ���
 * 2. ����һ��Map���ϣ�Key���ַ����е��ַ���Value���ַ�����
 * 3. �����ַ�������ȡÿһ���ַ�
 * 4. ʹ�û�ȡ�����ַ���Map�����ж�key�Ƿ����
 *     key���ڣ�
 *         ͨ��key��ȡvalue
 *         value++
 *         put(key, value)�����µ�value�洢��������
 *     key�����ڣ�
 *         put(key, 1)
 * 5. ����Map���ϣ�������
 */
public class Practise01CountChar {

	public static void main(String[] args) {
		// 1. ʹ��Scanner��ȡ�û�������ַ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String str = sc.next();
		
		// 2. ����һ��Map���ϣ�Key���ַ����е��ַ���Value���ַ�����
		HashMap<Character, Integer> map = new HashMap<>();
		
		// 3. �����ַ�������ȡÿһ���ַ�
		for (char ch : str.toCharArray()) {
			// 4. ʹ�û�ȡ�����ַ���Map�����ж�key�Ƿ����
			if (map.containsKey(ch)) {
				// key����
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			} else {
				// key������
				map.put(ch, 1);
			}
		}
		// 5. ����Map���ϣ�������
		for (Character key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + " -> " + value);
		}
		sc.close();
	}
}

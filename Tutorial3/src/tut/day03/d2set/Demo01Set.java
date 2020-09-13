package tut.day03.d2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * java.util.Set�ӿ� extends Collection�ӿ�
 * Set�ӿڵ��ص㣺
 * 1. ������洢�ظ���Ԫ��
 * 2. û���������������ķ�����Ҳ����ʹ����ͨ��forѭ������
 * java.util.HashSet���� implements Set�ӿ�
 * HashSet���ص㣺
 * 1. ������洢�ظ���Ԫ��
 * 2. û���������������ķ�����Ҳ����ʹ����ͨ��forѭ������
 * 3. ��һ������ļ��ϣ��洢Ԫ�غ�ȡ��Ԫ�ص�˳���п��ܲ�һ��
 * 4. �ײ���һ����ϣ��ṹ����ѯ���ٶȷǳ��Ŀ죩
 */
public class Demo01Set {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		// ʹ��add���������������Ԫ��
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		// ����ʹ����ͨforѭ��������ʹ�õ���������set����
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			// ���Է��ֱ���������ֻ��1, 2, 3�������Ҳ��ظ���
		}
		System.out.println("=================");
		// ʹ����ǿforѭ������set����
		for (Integer i : set) {
			System.out.println(i); // 1, 2, 3
		}
	}
}

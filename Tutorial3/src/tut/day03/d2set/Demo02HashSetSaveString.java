package tut.day03.d2set;

import java.util.HashSet;

/*
 * Set���ϲ�����洢�ظ�Ԫ�ص�ԭ��
 * �ʼ� 16
 */
public class Demo02HashSetSaveString {

	public static void main(String[] args) {
		// ����HashSet���϶���
		HashSet<String> set = new HashSet<>();
		String s1 = new String("abc");
		String s2 = new String("abc");
		set.add(s1);
		set.add(s2);
		set.add("�ص�");
		set.add("ͨ��");
		set.add("abc");
		System.out.println(set); // [�ص�, ͨ��, abc]
	}
}

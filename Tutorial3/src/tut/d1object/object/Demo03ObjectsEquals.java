package tut.d1object.object;

import java.util.Objects;

public class Demo03ObjectsEquals {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = "abc";
//		boolean b = s1.equals(s2); // �׳�java.lang.NullPointerException�쳣��null�ǲ��ܵ��÷�����
//		System.out.println(b);
		
		/*
		 * Objects���equals������������������бȽϣ���ֹ��ָ���쳣
		 * public static boolean equals(Object a, Object b) {
		 *     return (a == b) || (a != null && a.equals(b));
		 * }
		 */
		boolean b = Objects.equals(s1, s2);
		System.out.println(b); // false
	}
}

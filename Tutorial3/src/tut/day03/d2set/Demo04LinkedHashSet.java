package tut.day03.d2set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * java.util.LinkedHashSet���� extends HashSet����
 * LinkedHashSet�����ص㣺
 *     �ײ���һ����ϣ������+����/�������+��������һ��������¼Ԫ�صĴ洢˳�򣩣���֤Ԫ������
 */
public class Demo04LinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("def");
		set.add("abc");
		set.add("abc");
		set.add("ghi");
		System.out.println(set); // [abc, def, ghi]�����򣬲������ظ�
		
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		linked.add("def");
		linked.add("abc");
		linked.add("abc");
		linked.add("ghi");
		System.out.println(linked); // [def, abc, ghi]�����򣬲������ظ�
	}
}

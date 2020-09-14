package tut.day03.d5collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * java.util.Collections�Ǽ��Ϲ����࣬�����Լ��Ͻ��в��������ַ������£�
 * static <T> boolean addAll?(Collection<? super T> c, T... elements) ������ָ����Ԫ����ӵ�ָ���ļ����С�
 * static void shuffle?(List<?> list) ʹ��Ĭ�ϵ����Դ����û�ָ�����б�
 * static void shuffle?(List<?> list, Random rnd) ʹ��ָ�������Դ����û�ָ�����б�
 * static <T extends Comparable<? super T>> void sort?(List<T> list) ������Ԫ�ص�natural ordering ����ָ���б���������
 * static <T> void sort?(List<T> list, Comparator<? super T> c) ����ָ���Ƚ���������˳���ָ���б��������
 */
public class Demo01Collections {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// ����������Ӷ��Ԫ��
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.add("e");
		
		// * static <T> boolean addAll?(Collection<? super T> c, T... elements) ������ָ����Ԫ����ӵ�ָ���ļ����С�
		Collections.addAll(list, "a", "b", "c", "d", "e");
		System.out.println(list); // [a, b, c, d, e]
		
		Collections.shuffle(list);
		System.out.println(list); // [b, d, a, e, c]��ÿ��˳�򶼲�һ����
	}
}

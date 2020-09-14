package tut.day03.d5collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * java.util.Collections�Ǽ��Ϲ����࣬�����Լ��Ͻ��в��������ַ������£�
 * static <T extends Comparable<? super T>> void sort(List<T> list) ������Ԫ�ص�natural ordering ����ָ���б���������
 * 
 * ע�⣺
 *     sort(List<T> list)ʹ��ǰ�᣺
 *     ������ļ�����ߴ洢��Ԫ�أ�����ʵ��Comparable����д�ӿ��еķ���compareTo��������Ĺ���
 *     
 * Comparable�ӿڵ��������
 *     �Լ�(this) - ���������򣬷�֮����
 */
public class Demo02Sort {

	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(3);
		list01.add(2);
		System.out.println(list01); // [1, 3, 2]
		
		// static <T extends Comparable<? super T>> void sort?(List<T> list) ������Ԫ�ص�natural ordering ����ָ���б���������
		Collections.sort(list01);
		System.out.println(list01); // [1, 2, 3]
		
		ArrayList<String> list02 = new ArrayList<>();
		list02.add("a");
		list02.add("c");
		list02.add("b");
		System.out.println(list02); // [a, c, b]
		
		Collections.sort(list02);
		System.out.println(list02); // [a, b, c]
		
		ArrayList<Person> list03 = new ArrayList<>();
		list03.add(new Person("����", 18));
		list03.add(new Person("����", 20));
		list03.add(new Person("����", 15));
		list03.add(new Person("����", 21));
		System.out.println(list03); // [Person [name=����, age=18], Person [name=����, age=20], Person [name=����, age=15], Person [name=����, age=21]]
		
		Collections.sort(list03); // ���뱨���������±ƣ�
		System.out.println(list03);
	}
}

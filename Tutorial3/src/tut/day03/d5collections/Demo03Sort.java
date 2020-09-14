package tut.day03.d5collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * java.util.Collections�Ǽ��Ϲ����࣬�����Լ��Ͻ��в��������ַ������£�
 * static <T> void sort(List<T> list, Comparator<? super T> c) ����ָ���Ƚ���������˳���ָ���б��������
 * 
 * Comparator��Comparable������
 * Comparable: �Լ�(this)�ͱ���(����)�Ƚϣ��Լ���Ҫʵ��Comparable�ӿڣ���д�ȽϵĹ���compareTo����
 * Comparator: �൱����һ���������Ĳ��У��Ƚ�����
 * 
 * Comparator���������
 *     o1 - o2�����򣬷�֮����
 */
public class Demo03Sort {

	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(3);
		list01.add(2);
		System.out.println(list01); // [1, 3, 2]
		
		Collections.sort(list01, new Comparator<Integer>() {
			// ��д�ȽϵĹ���
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1 - o2; // ����
				return o2 - o1; // ����
			}
		});
		System.out.println(list01); // [1, 2, 3] | [3, 2, 1]
		
		ArrayList<Student> list02 = new ArrayList<>();
		list02.add(new Student("aaa", 18));
		list02.add(new Student("bbb", 20));
		list02.add(new Student("ccc", 15));
		list02.add(new Student("ddd", 21));
		list02.add(new Student("aaa", 21));
		System.out.println(list02);
		
		Collections.sort(list02, new Comparator<Student>() {
			// ����������������
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println(list02);
		
		// ��չ
		Collections.sort(list02, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// ����������������
				int result = o1.getAge() - o2.getAge();
				// ���������������ͬ����ʹ����Ŀ�ĵ�һ���ֱȽ�
				if (result == 0) {
					result = o1.getName().charAt(0) - o2.getName().charAt(0);
				}
				return result;
			}
		});
		System.out.println(list02);
	}
}

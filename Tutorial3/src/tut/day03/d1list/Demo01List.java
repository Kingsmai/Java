package tut.day03.d1list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * java.util.List�ӿ� extends Collection�ӿ�
 * 
 * List�ӿڵ��ص㣺
 * 1. ����ļ��ϣ��洢Ԫ�غ�ȡ��Ԫ�ص�˳����һ�µģ��洢123��ȡ��123��
 * 2. ��������������һЩ�������ķ���
 * 3. ����洢�ظ���Ԫ��
 * 
 * List�ӿ��д������ķ��������з�����
 * 1. void add (int index, E element) ��ָ��Ԫ�ز�����б��е�ָ��λ�ã���ѡ��������
 * 2. E get (int index) ���ش��б���ָ��λ�õ�Ԫ�ء�
 * 3. E remove (int index) ɾ�����б���ָ��λ�õ�Ԫ�أ���ѡ��������
 * 4. E set (int index, E element) ��ָ����Ԫ���滻���б���ָ��λ�õ�Ԫ�أ���ѡ��������
 * 
 * ע�⣺
 * ����������ʱ��һ��Ҫ��ֹ����Խ���쳣����Ҫ�����������÷�Χ��
 * java.lang.IndexOutOfBoundsException������Խ���쳣�����ϵı���
 * java.lang.ArrayIndexOutOfBoundsException������ı���
 */
public class Demo01List {

	public static void main(String[] args) {
		// ����һ��List���϶���
		List<String> list = new ArrayList<>();
		// ����add���������������Ԫ��
		list.add("a"); // 0
		list.add("b"); // 1
		list.add("c"); // 2
		list.add("d"); // 3
		list.add("a"); // 4
		System.out.println(list); // [a, b, c, d, a] ���ǵ�ַ����д��toString����
		
		// void add (int index, E element) ��ָ��Ԫ�ز�����б��е�ָ��λ�ã���ѡ��������
		// ��c��d֮�����һ��Xiaomai
		list.add(3, "Xiaomai");
		System.out.println(list); // [a, b, c, Xiaomai, d, a]
		
		// E remove (int index) ɾ�����б���ָ��λ�õ�Ԫ�أ���ѡ��������
		// ɾ��cԪ��
		String rm = list.remove(2);
		System.out.println("���Ƴ���Ԫ�أ�" + rm); // c
		System.out.println(list); // [a, b, Xiaomai, d, a]
		
		// E set (int index, E element) ��ָ����Ԫ���滻���б���ָ��λ�õ�Ԫ�أ���ѡ��������
		// ��Xiaomai�滻ΪProgrammer
		String change = list.set(2, "Programmer");
		System.out.println("���滻��Ԫ�أ�" + change); // Xiaomai
		System.out.println(list); // [a, b, Programmer, d, a]
		
		// List���ϱ��������ַ�ʽ��
		// ʹ����ͨ��forѭ��
		for (int i = 0; i < list.size(); i++) {
			// E get (int index) ���ش��б���ָ��λ�õ�Ԫ�ء�
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println("===============");
		
		// ʹ�õ�����
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("===============");
		
		// ʹ����ǿfor
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("===============");
		
		// һ��Ҫ��ֹ����Խ���쳣
//		String str = list.get(5); // Index 5 out of bounds for length 5
	}
}

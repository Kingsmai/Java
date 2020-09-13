package tut.day03.d1list;

import java.util.LinkedList;

/*
 * java.util.LinkedList���� implements List�ӿ�
 * LinkedList���ϵ��ص㣺
 * 1. �ײ���һ������ṹ����ѯ������ɾ��
 * 2. ��߰����˴���������βԪ�صķ���
 * ע�⣺ʹ��LinkedList�������еķ���������ʹ�ö�̬
 * 
 * void addFirst (E e) �ڴ��б�Ŀ�ͷ����ָ����Ԫ�ء�
 * void addLast (E e) ��ָ����Ԫ��׷�ӵ����б��ĩβ��
 * void push (E e) ��Ԫ�����͵����б�����ʾ�Ķ�ջ�ϡ�
 * E getFirst () ���ش��б��еĵ�һ��Ԫ�ء�
 * E getLast () ���ش��б��е����һ��Ԫ�ء�
 * E removeFirst () �Ӵ��б���ɾ�������ص�һ��Ԫ�ء�
 * E removeLast () �Ӵ��б���ɾ�����������һ��Ԫ�ء�
 * E pop () �������б�������Ķ�ջ�е�Ԫ�ء�
 * boolean isEmpty () ����˼��ϲ������κ�Ԫ�أ��򷵻� true ��
 */
public class Demo02LinkedList {

	public static void main(String[] args) {
		/*
		 * void addFirst (E e) �ڴ��б�Ŀ�ͷ����ָ����Ԫ�ء�
		 * void addLast (E e) ��ָ����Ԫ��׷�ӵ����б��ĩβ��
		 * void push (E e) ��Ԫ�����͵����б�����ʾ�Ķ�ջ�ϡ� == addFirst(E e)
		 */
		// ����LinkedList���϶���
		LinkedList<String> linked = new LinkedList<>();
		// ʹ��add���������������Ԫ��
		linked.add("a");
		linked.add("b");
		linked.add("c");
		System.out.println(linked); // [a, b, c]
		
		linked.addFirst("Start");
		System.out.println(linked); // [Start, a, b, c]
		
		linked.push("Push"); // ��Ч��addFirst()
		System.out.println(linked); // [Push, Start, a, b, c]
		
		linked.addLast("End"); // ��Ч��add()
		System.out.println(linked); // [Push, Start, a, b, c, End]
		System.out.println("===================");
		
		/*
		 * E getFirst () ���ش��б��еĵ�һ��Ԫ�ء�
		 * E getLast () ���ش��б��е����һ��Ԫ��
		 */
//		linked.clear(); // ��������е�Ԫ��
		// ��ȡԪ�صļ���Ϊ�յĻ������׳�java.util.NoSuchElementException
		
		// boolean isEmpty () ����˼��ϲ������κ�Ԫ�أ��򷵻� true ��
		if (!linked.isEmpty()) { // ���ǿյĲŻ�ȡ
			String first = linked.getFirst();  // ��Ч��get(0)
			System.out.println(first); // Push
			String last = linked.getLast(); // ��Ч��get(linked.size())
			System.out.println(last); // End
		} else {
			System.out.println("����Ϊ��");
		}
		System.out.println("===================");
		
		/*
		 * E removeFirst () �Ӵ��б���ɾ�������ص�һ��Ԫ�ء�
		 * E removeLast () �Ӵ��б���ɾ�����������һ��Ԫ�ء�
		 * E pop () �������б�������Ķ�ջ�е�Ԫ�ء���Ч��removeFirst
		 */
		String rmFirst = linked.removeFirst();
		System.out.println(rmFirst); // Push
		System.out.println(linked); // [Start, a, b, c, End]
		String rmLast = linked.removeLast();
		System.out.println(rmLast); // End
		System.out.println(linked); // [Start, a, b, c]
		String popStr = linked.pop(); // ��Ч��removeFirst
		System.out.println(popStr); // Start
		System.out.println(linked); // [a, b, c]
	}
}

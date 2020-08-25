package tut.demo02.d4arraylist;

import java.util.ArrayList;

/*
 * ArrayList���еĳ��÷�����
 * 
 * public boolean add(E e); // �򼯺ϵ������Ԫ�أ����������ͺͷ���һ�£�����ֵ��������Ƿ�ɹ�
 * ��ע������ArrayList������˵��add���Ԫ��һ���ǳɹ��ģ����Է���ֵ���ÿɲ���
 * ���Ƕ����������ϣ�����ѧϰ����add��Ӷ�����һ���ɹ�
 * public E get(int index); // �Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ�Ƕ�Ӧλ�õ�Ԫ��
 * public E remove(int index); // �Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ������Ԫ��
 * public int size(); // ��ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ���
 */
public class Demo03ArrayListMethod {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list); // []
		
		// �򼯺������Ԫ�أ�add
		boolean success = list.add("����");
		System.out.println("��ӵĶ����Ƿ�ɹ���" + success); // ��ӵĶ����Ƿ�ɹ���true
		System.out.println(list); // [����]
		
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println(list); // [����, ����, ����, ����]
		
		String name = list.get(2);
		System.out.println("��2������λ�ã�" + name); // ��2������λ�ã�����
		System.out.println(list); // [����, ����, ����, ����]��get����ɾ����������
		
		String whoRemoved = list.remove(1); // ɾ������
		System.out.println("��ɾ�������ǣ�" + whoRemoved); // ��ɾ�������ǣ�����
		System.out.println(list); // [����, ����, ����]
		
		int size = list.size();
		System.out.println("���ϳ���Ϊ��" + size); // ���ϳ���Ϊ��3
		
		
		
		// ��������ķ��������ǾͿ��Ա����������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

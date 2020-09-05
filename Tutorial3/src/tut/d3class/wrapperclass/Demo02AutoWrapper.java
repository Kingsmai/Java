package tut.d3class.wrapperclass;

import java.util.ArrayList;

/*
 * �Զ�װ�����Զ����䣺�������͵����ݺͰ�װ��֮������Զ����໥ת��
 * JDK 1.5֮����ֵ�������
 */
public class Demo02AutoWrapper {

	public static void main(String[] args) {
		/*
		 * �Զ�װ�䣺ֱ�Ӱ�int���͵�������ֵ����װ��
		 */
		Integer in = 1; // �൱�� Integer in = new Integer(1);
		
		/*
		 * �Զ����䣺in�ǰ�װ�࣬�޷�ֱ�Ӳ������㣬�����Զ�ת��Ϊ�����������ͣ��ڽ��м���
		 */
		in = in + 2; // �൱�� in = in.intValue() + 2;
		// ִ����֮�����Զ�װ��ΪInteger
		System.out.println(in instanceof Integer); // true
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		/*
		 * ArrayList�����޷�ֱ�Ӵ洢���������Դ洢Integer��װ��
		 */
		list.add(1); // �������Զ�װ�䣺list.add(new Integer(1));
		int a = list.get(0); // �������Զ����䣺int a = list.get(0).intValue();
		System.out.println(a); // 1
	}
}

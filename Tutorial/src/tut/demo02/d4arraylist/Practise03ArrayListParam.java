package tut.demo02.d4arraylist;

import java.util.ArrayList;

/*
 * ������ָ����ʽ��ӡ���ϵķ���(ArrayList������Ϊ����)��ʹ��{}���𼯺ϣ�ʹ��@�ָ�ÿ��Ԫ�ء�
 * ��ʽ���� {Ԫ��@Ԫ��@Ԫ��}��
 * 
 * System.out.println(list); [10, 20, 30]
 * printArrayList(list); {10@20@30}
 */
public class Practise03ArrayListParam {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println(list); // [����, ����, ����, ����]
		
		printArrayList(list);
	}
	
	/*
	 * ���巽����Ҫ��
	 * ����ֵ���ͣ�ֻ�ǽ��д�ӡ��û�����㣬û�н����������void
	 * �������ƣ�printArrayList
	 * �����б�ArrayList
	 */
	public static void printArrayList(ArrayList<String> list) {
		// {10@20@30}
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (i == list.size() - 1) { // ���һ��
				System.out.println(name + "}");
			} else {
				System.out.print(name + "@");				
			}
		}
	}
}

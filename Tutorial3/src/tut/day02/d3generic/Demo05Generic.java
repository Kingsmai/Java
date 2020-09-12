package tut.day02.d3generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���͵�ͨ�����
 * ? �����������������
 * ʹ�÷�ʽ�����ܴ�������ʹ�ã�ֻ����Ϊ�����Ĳ���ʹ��
 */
public class Demo05Generic {

	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(2);
		
		ArrayList<String> list02 = new ArrayList<>();
		list02.add("a");
		list02.add("b");
		
		printArray(list01);
		printArray(list02);
		
//		ArrayList<?> list03 = new ArrayList<?>(); // ����ͨ���������Ϊ��ʼ������
	}
	
	/*
	 * ����һ���������ܱ����������͵�ArrayList����
	 * ��ʱ�����ǲ�֪��ArrayList����ʹ��ʲô�������ͣ�����ʹ�÷��͵�ͨ��� ? ��������������
	 * ע�⣺������û�м̳и���ģ�����дObject
	 */
	public static void printArray(ArrayList<?> list) {
		// ʹ�õ�������������
		Iterator<?> it  = list.iterator();
		while(it.hasNext()) {
			// it.next����ȡ����Ԫ����Object��ֻ��Object���Ϳ��Խ����������������
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

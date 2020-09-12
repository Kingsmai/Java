package tut.day02.d2iterator;

import java.util.ArrayList;

/*
 * ��ǿForѭ�����ײ�ʹ�õ�Ҳ�ǵ�������ʹ��forѭ���ĸ�ʽ�����˵���������д
 * ��JDK1.5֮����ֵ�������
 * public interface Collection<E> extends Iterable<E> ���еĵ��м��϶�����ʹ����ǿforѭ��
 * public interface Iterable<T> ʵ�ִ˽ӿ���������Ϊ��ǿ�� for����Ŀ�꣨��ʱ��Ϊ��for-eachѭ������䣩�� 
 * 
 * ��ǿforѭ���������������Ϻ�����
 * 
 * ��ʽ��
 * for(���� / ������������� ������ : ������ / ������) {
 *     sout(������);
 * }
 */
public class Demo02ForEach {

	public static void main(String[] args) {
		// ʹ����ǿforѭ����������
		int[] arr = {1, 3, 5, 7, 9};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("==============");
		
		// ʹ����ǿforѭ����������
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		for (String str : list) {
			System.out.println(str);
		}
	}
}

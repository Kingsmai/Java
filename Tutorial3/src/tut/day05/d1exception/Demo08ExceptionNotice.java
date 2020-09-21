package tut.day05.d1exception;

import java.util.List;

/*
 * �쳣��ע������
 */
public class Demo08ExceptionNotice {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		 * ����쳣��������ִ���ʽ��
		 * 1. ����쳣�ֱ���
		 * 2. ����쳣һ�β��񣬶�δ���
		 * 3. ����쳣һ�β���һ�δ���
		 */
		
		// 1. ����쳣�ֱ���
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		try {
			List<Integer> list = List.of(1, 2, 3);
			System.out.println(list.get(4)); // java.lang.ArrayIndexOutOfBoundsException			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("��������");
		
		// 2. ����쳣һ�β��񣬶�δ���
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
			String str = null;
			System.out.println(str.charAt(5));
		} catch (ArrayIndexOutOfBoundsException e) { // �������Խ���ˣ������������
			System.out.println(e);
		} catch (NullPointerException e) { // �������Խ���ˣ������������
			System.out.println(e);
		}
		
		/*
		 * һ��try���catchע�����
		 *     catch��߶�����쳣������������Ӹ����ϵ����ô������쳣��������д�����棬����ͻᱨ��
		 *         ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
		 */
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
			List<Integer> list = List.of(1, 2, 3);
			System.out.println(list.get(4));
		} catch (IndexOutOfBoundsException e) { // ���ࣨ��̬��
			System.out.println(e);
//		} catch (ArrayIndexOutOfBoundsException e) { // ����д���±ߣ�û���ã��������ڱ���
//			System.out.println(e);
		}
		
		// 3. ����쳣һ�β���һ�δ���
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
			List<Integer> list = List.of(1, 2, 3);
			System.out.println(list.get(4));
		} catch (Exception e) { // ���ࣨ��̬��
			System.out.println(e);
		}
		
		// ����ʱ�쳣���׳����Բ�������������Ҳ�������׳�
		// Ĭ�ϸ������������ֹ����ʲôʱ���׳��쳣�ˣ���������ִ�г���
	}
}

package tut.day05.d1exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.Throwable����Java���������д�����쳣�ĳ���
 *     Exception���������쳣�����б��루д���룩Java������ֵ�����
 *         RuntimeException���������쳣��Java�������й����г��ֵ�����
 *         �쳣���൱�ڳ������һ��Сë������ð�����գ������쳣���������ҩ����������Լ���ִ��
 *     Error������
 *         ������൱�ڳ������һ���޷�������ë�����ǵ䣬���̣��������޸�Դ���룬������ܼ���ִ��
 */
public class Demo01Exception {

	@SuppressWarnings("unused")
	public static void main(String[] args) /* throws ParseException */ {
		// Exception���������쳣�����б��루д���룩Java������ֵ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = sdf.parse("2020-0918");
		} catch (ParseException e) {
			e.printStackTrace(); // ���������쳣
			System.out.println("�������쳣");
		}
		System.out.println(date);
		System.out.println("��������");

		// RuntimeException���������쳣��Java�������й����г��ֵ�����
		int[] arr = new int[] { 1, 2, 3 };
		System.out.println(arr[0]);
		try {
			// ���ܻ�����쳣�Ĵ���
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException ����Խ���쳣
		} catch (Exception e) {
			// �쳣�Ĵ����߼�
//			e.printStackTrace();
			System.out.println(e);
		}

		// Error������
		// �����ڴ�������󣨴���������̫���ˣ������˸�JVM������ڴ棩
//		int[] mem = new int[1024 * 1024 * 1024]; // java.lang.OutOfMemoryError: Java heap space
		// �����޸Ĵ��룬�ô���������Сһ��
		int[] mem = new int[1024 * 1024];
	}
}

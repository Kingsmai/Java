package tut.day05.d1exception;

import java.util.Objects;

/*
 * Objects���еľ�̬����
 * static <T> T requireNonNull?(T obj) ���ָ���Ķ��������Ƿ��� null ��
 * Դ�룺
 *     public static <T> T requireNonNull(T obj) {
 *         if (obj == null)
 *             throw new NullPointerException();
 *         return obj;
 *     }
 */
public class Demo04Objects {

	public static void main(String[] args) {
		method(null);
	}
	
	public static void method(Object obj) {
		// �Դ��ݹ����Ĳ������Ϸ��жϣ��ж��Ƿ�Ϊnull
//		if (obj == null) {
//			new NullPointerException("���ݵĶ����ֵ�ǿ�");
//		}
		
//		Objects.requireNonNull(obj);
		
		Objects.requireNonNull(obj, "���ݵĶ����ֵ�ǿ�");
	}
}

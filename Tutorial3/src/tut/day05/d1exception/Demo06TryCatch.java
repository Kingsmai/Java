package tut.day05.d1exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * try...catch���쳣����ĵڶ��ַ�ʽ
 * ��ʽ��
 *     try {
 *         ���ܲ����쳣�Ĵ���
 *     } catch(����һ���쳣�ı�������������try�׳����쳣����) {
 *         �쳣�Ĵ����߼��������쳣����֮����ô�����쳣����
 *         һ���ڹ����У�����쳣����Ϣ��¼��һ����־��
 *     }
 *     ... �����ж��
 *     catch(�쳣���� ������) {
 *     
 *     }
 *     ע�⣺
 *         1. try�У����ܻ��׳�����쳣������ô�Ϳ���ʹ�ö��catch��������Щ�쳣
 *         2. ���try�в������쳣����ô�ͻ�ִ��catch�е��쳣�����߼���ִ����catch�еĴ����߼�������ִ��try...catch֮��Ĵ���
 *            ���try��û�в����쳣����ô�Ͳ���ִ��catch�е��쳣�Ĵ����߼���ִ����try�еĴ��룬����ִ��try...catch֮��Ĵ���
 */
@SuppressWarnings("unused")
public class Demo06TryCatch {

	public static void main(String[] args) {
		try {
			// ���ܲ����쳣�Ĵ���
			readFile("d:\\a.tx");
			System.out.println("��Դ�ͷ�"); // һ������Ͳ���ִ��
		} catch (IOException e) { // try���׳�ʲô�쳣����catch�Ͷ���ʲô�쳣������������������쳣����
			// �쳣�Ĵ����߼��������쳣����֮����ô�����쳣����
			// System.out.println("catch - �ļ��ĺ�׺������.txt");
			
			/*
			 * Throwable���ж�����3���쳣����ķ�����
			 *     String getMessage() ���ش�throwable����ϸ��Ϣ�ַ�����
			 *     String toString() ���ش�throwable�ļ��������
			 *     void printStackTrace() ����throwable������ݴ�ӡ����׼��������
			 * JVM��ӡ�쳣���� Ĭ�ϵ���printStackTrace����ӡ���쳣��Ϣ����ȫ���
			 */
			System.out.println(e.getMessage()); // �ļ���׺������
			System.out.println(e.toString()); // java.io.IOException: �ļ���׺������
			/*
			 * java.io.IOException: �ļ���׺������
			 *     at tut.day05.d1threadandexception.Demo06TryCatch.readFile(Demo06TryCatch.java:54)
			 *     at tut.day05.d1threadandexception.Demo06TryCatch.main(Demo06TryCatch.java:29)
			 */
			e.printStackTrace(); // ��ӡ��ɫ���ַ�����������������������
		}
		System.out.println("��������");
	}
	
	/*
	 * ������ݵ�·������.txt��β
	 * ��ô���Ǿ������׳�IO�쳣���󣬸�֪�����ĵ����ߣ��ļ��ĺ�׺������
	 */
	public static void readFile(String fileName) throws IOException {
		if (!fileName.endsWith(".txt")) {
			throw new IOException("�ļ���׺������");
		}
		System.out.println("·��û�����⣬��ȡ�ļ�");
	}
}

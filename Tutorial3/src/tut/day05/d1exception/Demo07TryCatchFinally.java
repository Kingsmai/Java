package tut.day05.d1exception;

import java.io.IOException;

/*
 * finally�����
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
 *     } finally {
 *         �����Ƿ�����쳣����ִ��
 *     }
 * ע�⣺
 *     1. finally���ܵ���ʹ�ã������tryһ��ʹ��
 *     2. finallyһ��������Դ�ͷţ���Դ���գ������۳����Ƿ�����쳣�����Ҫ��Դ�ͷţ�IO��
 */
public class Demo07TryCatchFinally {

	public static void main(String[] args) {
		try {
			// ���ܻ�����쳣�Ĵ���
			readFile("c:\\a.tx");
		} catch (IOException e) {
			// �쳣������߼�
			e.printStackTrace();
		} finally {
			// �����Ƿ�����쳣������ִ��
			System.out.println("��Դ�ͷ�");
		}
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

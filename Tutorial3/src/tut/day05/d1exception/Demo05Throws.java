package tut.day05.d1exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * throws�ؼ��֣��쳣����ĵ�һ�ַ�ʽ���������˴���
 * ���ã�
 *     �������ڲ��׳��쳣�����ʱ����ô���Ǿͱ��봦������쳣����
 *     ����ʹ��throws�ؼ��ִ����쳣���󣬻���쳣�����׳��������ĵ����ߴ����Լ������������˴��������ս���JVM����->�жϳ���
 * ʹ�ø�ʽ���ڷ�������ʱʹ��
 *     ���η� ����ֵ���� ������(�����б�) throws AaaException, BbbException {
 *         throw new AaaException("����ԭ��");
 *         throw new BbbException("����ԭ��");
 *     }
 * ע��
 *     1. throws�ؼ��ֱ���д�ڷ���������
 *     2. throws�ؼ��ֺ���������쳣������Exception������Exception������
 *     3. �����ڲ�����׳��˶���쳣������ôthrows��߱���Ҳ��������쳣
 *        ����׳��Ķ���쳣�����и������ϵ����ôֱ�����������쳣����
 *     4. ������һ�������׳��쳣�ķ��������Ǿͱ��봦���������쳣
 *        Ҫô����ʹ��throws�����׳������������ĵ����ߴ������ս���JVM
 *        Ҫôtry...catch�Լ������쳣
 */
public class Demo05Throws {

	/*
	 * FileNotFoundExceptions extends IOException extends Exception
	 * ����׳��Ķ���쳣�����и������ϵ����ôֱ�����������쳣����
	 */
	public static void main(String[] args) throws IOException {
		readFile("c:\\a.txt");
	}
	
	/*
	 * ����һ���������Դ��ݵ��ļ�·�����Ϸ����ж�
	 * ���·������c:\\a.txt����ô���Ǿ��׳��ļ��Ҳ����쳣���󣬸�֪�����ĵ�����
	 * ע�⣺
	 *     FileNotFoundException�Ǳ����쳣���׳��˱����쳣���ͱ��봦������쳣
	 *     ������throws���������׳�FileNotFoundException����쳣�����÷���ʹ���ߴ���
	 */
	public static void readFile(String fileName) throws FileNotFoundException, IOException {
		if (fileName.equals("c:\\a.txt")) {
			throw new FileNotFoundException("���ݵ��ļ�·������c:\\a.txt");
		}
		
		/*
		 * ������ݵ�·������.txt��β
		 * ��ô���Ǿ������׳�IO�쳣���󣬸�֪�����ĵ����ߣ��ļ��ĺ�׺������
		 */
		if (!fileName.endsWith(".txt")) {
			throw new IOException("�ļ���׺������");
		}
		System.out.println("·��û�����⣬��ȡ�ļ�");
	}
}

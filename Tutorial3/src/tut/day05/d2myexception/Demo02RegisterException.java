package tut.day05.d2myexception;

import java.util.Scanner;

/*
 * Ҫ������ģ��ע�����������û����Ѵ��ڣ����׳��쳣��ʾ���ף����û����ѱ�ע��
 * 
 * ������
 *     1. ʹ�����鱣���Ѿ�ע������û��������ݿ⣩
 *     2. ʹ��Scanner��ȡ�û������ע����û�����ǰ�ˣ�ҳ�棩
 *     3. ����һ�����������û������ע����û��������ж�
 *         3.1. �����洢�Ѿ�ע����û��������飬��ȡÿһ���û���
 *         3.2. ʹ�û�ȡ�����û������û�������û����Ƚ�
 *             true��
 *                 �û����Ѿ����ڣ��׳�RegisterException�쳣����֪�û����ף����û����ѱ�ע�ᡱ
 *             false��
 *                 ���������Ƚ�
 *         3.3. ���ѭ�������ˣ���û���ҵ��ظ����û�������ʾ�û�����ϲ��ע��ɹ���
 */
public class Demo02RegisterException {

	static String[] usernames = {"����", "����", "����"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫע����û�����");
		String username = sc.next();
		checkUsername(username);
	}
	
	public static void checkUsername(String username) {
		for (String name : usernames) {
			if(name.equals(username)) {
				throw new RegisterException("���û��Ѿ���ע��"); // �׳��������쳣������������JVM���� -> �жϴ���
			}
		}
		System.out.println("��ϲ��ע��ɹ�");
	}
}

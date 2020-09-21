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
public class Demo01RegisterException {

	// 1. ʹ�����鱣���Ѿ�ע������û��������ݿ⣩
	static String[] usernames = {"����", "����", "����"};
	
	public static void main(String[] args) /* throws RegisterException */ {
		// 2. ʹ��Scanner��ȡ�û������ע����û�����ǰ�ˣ�ҳ�棩
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫע����û�����");
		String username = sc.next();
		checkUsername(username);
	}
	
	// 3. ����һ�����������û������ע����û��������ж�
	public static void checkUsername(String username) /* throws RegisterException */ {
		// 3.1. �����洢�Ѿ�ע����û��������飬��ȡÿһ���û���
		for (String name : usernames) {
			// 3.2. ʹ�û�ȡ�����û������û�������û����Ƚ�
			if(name.equals(username)) {
				// true���û����Ѿ����ڣ��׳�RegisterException�쳣����֪�û����ף����û����ѱ�ע�ᡱ
				try {
					throw new RegisterException("���û��Ѿ���ע��");					
				} catch (RegisterException e) {
					e.printStackTrace();
					return; // ��������
				}
			}
		}
		// 3.3. ���ѭ�������ˣ���û���ҵ��ظ����û�������ʾ�û�����ϲ��ע��ɹ���
		System.out.println("��ϲ��ע��ɹ�");
	}
}

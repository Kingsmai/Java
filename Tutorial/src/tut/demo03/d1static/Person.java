package tut.demo03.d1static;

/*
 * ��̬�����ĸ�ʽ�ǣ�
 * 
 * public class ������ {
 * 	static {
 *   // ��̬����������
 * 	}
 * }
 * 
 * �ص㣺����һ���õ�����ʱ����̬�����ִ��Ψһ��һ��
 */
public class Person {
	static {
		System.out.println("��̬�����ִ��");
	}
	
	 public Person () {
		 System.out.println("���췽��ִ��");
	 }
}

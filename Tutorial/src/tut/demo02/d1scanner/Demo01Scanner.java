package tut.demo02.d1scanner;

import java.util.Scanner; // 1. ����

/*
 * Scanner��Ĺ��ܣ�
 * ����ʵ�ּ����������ݣ���������
 * 
 * �������͵�һ��ʹ�ò��裺
 * 1. ����
 * import ��·��.������;
 * ���ʹ�õ�����ͬһĿ¼�£�����ʡ�Ե������
 * ֻ��java.lang�µ����ݣ���String������Ҫ�����������İ�����Ҫimport���
 * 
 * 2. ����
 * ������ ������ = new ������();
 * 
 * 3. ʹ��
 * ������.��Ա������();
 */
public class Demo01Scanner {
	 public static void main(String[] args) {
		 // 2. ����
		 Scanner sc = new Scanner(System.in); // System.in����Ӽ��̽�������
		 
		 // 3. ��ȡ���������һ��int����
		 int num = sc.nextInt(); // ����̨������֮��س�
		 
		 // 3. ��ȡ���������һ���ַ���
		 String str = sc.next(); // ͬ��
		 
		 System.out.println("�����int�����ǣ�" + num);
		 System.out.println("������ַ����ǣ�" + str);
	}
}

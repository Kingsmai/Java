package tut.demo02.d1scanner;

import java.util.Scanner;

/*
 * ��������int���֣�Ȼ������������ֵ
 * 
 * ˼·��
 * 1. ��Ȼ�Ǽ������룬�϶���Ҫ�õ�Scanner
 * 2. Scanner�������裺������������ʹ��nextInt()����
 * 3. ��Ȼ���������֣���������nextInt()�������õ�����int����
 * 4. �޷�ͬʱ��������˭���Ӧ��ת����Ϊ��������
 * 4.1. �����ж�ǰ��������˭����õ�ǰ���������ֵ
 * 4.2. ����ǰ�����е����ֵ���ٺ͵��������ֱȽ�
 * 5. ��ӡ���ս��
 */
public class Practise02ScannerMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		System.out.println("��������������֣�");
		int c = sc.nextInt();
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		System.out.println("���ֵ�ǣ�" + max);
		sc.close();
	}
}

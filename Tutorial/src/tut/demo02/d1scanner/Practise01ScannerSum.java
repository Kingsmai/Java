package tut.demo02.d1scanner;

import java.util.Scanner;

/*
 * ������������int���֣����������ֵ
 * 
 * ˼·��
 * 1. ��Ȼ��Ҫ�������룬��ô����Scanner
 * 2. Scanner���������裺������������ʹ��
 * 3. ��Ҫ�������֣�����Ҫ��������nextInt����
 * 4. �õ����������֣�����Ҫ����һ��
 * 5. �������ӡ���
 */
public class Practise01ScannerSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		int result = a + b;
		System.out.println("����ǣ�" + result);
		sc.close();
	}
}

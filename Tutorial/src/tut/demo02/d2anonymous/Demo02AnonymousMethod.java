package tut.demo02.d2anonymous;

import java.util.Scanner;

public class Demo02AnonymousMethod {
	public static void main(String[] args) {
		// ��ͨʹ�÷�ʽ
		System.out.println("������һ������");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		System.out.println("������ǣ�" + num1);
		
		// ��������ʽ
		System.out.println("������һ������");
		int num2 = new Scanner(System.in).nextInt();
		System.out.println("������ǣ�" + num2);
		
		// ʹ��һ��д���������
		System.out.println("������һ������");
		Scanner sc2 = new Scanner(System.in);
		methodParam(sc2);
		
		// ʹ������������д���
		System.out.println("������һ������");
		methodParam(new Scanner(System.in));
		
		// �������󷵻�
		Scanner sc3 = methodReturn();
		System.out.println("������һ������");
		int num3 = sc3.nextInt();
		System.out.println("������ǣ�" + num3);
	}
	
	// �������󴫲�
	public static void methodParam(Scanner sc) {
		int num = sc.nextInt();
		System.out.println("������ǣ�" + num);
	}
	
	// �������󷵻�
	public static Scanner methodReturn() {
		// һ�㷽��
//		Scanner sc = new Scanner(System.in);
//		return sc;
		
		return new Scanner(System.in);
	}
}

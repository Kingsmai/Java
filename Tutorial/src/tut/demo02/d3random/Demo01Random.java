package tut.demo02.d3random;

import java.util.Random; // 1. ����

/*
 * Random����������������֣�ʹ������Ҳ����������
 * 
 * 1. ����
 * import java.util.Random;
 * 
 * 2. ����
 * Random r = new Random();
 * 
 * 3. ʹ��
 */
public class Demo01Random {
	public static void main(String[] args) {
		// 2. ����
		Random r = new Random();
		// 3. ����һ�������������Χ��int���з�Χ������������nextInt()
		int num1 = r.nextInt();
		System.out.println("���ɵ������ǣ�" + num1);
		
		// 3. ����һ��������������������˷�Χ������ҿ����䣩��nextInt(3);
		// ʵ���ϴ������[0, 3), Ҳ����0 ~ 2
		int num2 = r.nextInt(3);
		System.out.println("���ɵ������ǣ�" + num2);
		
		// 3. �������100������ʹ���������󣩣�
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextInt(10)); // ��Χ��0 ~ 9
		}
	}
}

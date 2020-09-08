package tut.demo02.d3random;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ
 * 
 * ˼·��
 * 1. ��ѡ��Ҫ����һ��������֣�һ�����������ٱ仯����Random��nextInt����
 * 2. ��Ҫ�������룬�����õ���Scanner
 * 3. ��ȡ������������֣���Scanner���е�nextInt����
 * 4. �Ѿ��õ��������֣��жϣ�if��
 * 4.1. ���̫���ˣ���ʾ̫�󣬲�������
 * 4.2. ���̫С�ˣ���ʾ̫С����������
 * 4.3. ��������ˣ���Ϸ����
 * 5. ���Ծ�������һ�Σ�ѭ��������ȷ������while(true)
 */
public class Practise02RandomGame {
	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(100) + 1; // ����һ������� [1, 100]
		System.out.println("������һ�����֣�");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int input = sc.nextInt();
			if (input > answer) {
				System.out.println("̫���ˣ�����һ�Σ�");
			} else if (input < answer) {
				System.out.println("̫С�ˣ�����һ�Σ�");
			} else {
				System.out.println("�����ˣ�" + answer + "����Ϸ����");
				break;
			}
		}
		sc.close();
	}
}

package tut.demo02.d3random;

import java.util.Random;

/*
 * ����int����n��ֵ������ȡ������֣���Χ�� [1,n]
 * 
 * ˼·��
 * 1. ����һ��int����n�������ֵ
 * 2. Ҫʹ��Random���������裺������������ʹ��
 * 3. ���д10����ô���� 0~9��Ȼ����Ҫ���� 1~10�����Է��֣����� +1 ����
 * 4. ��ӡ������� 
 */
public class Practise01Random1toN {
	public static void main(String[] args) {
		int n = 5;
		Random r = new Random();
		int result = r.nextInt(n) + 1; // ������Χ�� [0,n), ���� +1 ֮���� [1,n+1),Ҳ����[1,n]
		System.out.println(result);
	}
}

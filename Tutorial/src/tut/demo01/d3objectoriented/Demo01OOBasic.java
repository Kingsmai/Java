package tut.demo01.d3objectoriented;

import java.util.Arrays; // �Զ�����

/*
 * ������̣�����Ҫʵ��һ�����ܵ�ʱ��ÿһ������Ĳ��趼��Ҫ������Ϊ����ϸ����ÿһ��ϸ��
 * ������󣺵���Ҫʵ��һ�����ܵ�ʱ�򣬲����ľ���Ĳ��裬������һ�����иù��ܵ��ˣ�����������
 */
public class Demo01OOBasic {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40 ,50};
		/*
		 * Ҫ���ӡ��ʽ��[10, 20, 30, 40 ,50]
		 */
		// ������̣�
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) { // ��������һ��Ԫ��
				System.out.println(array[i] + "]");
			} else { // ����������һ��Ԫ��
				System.out.print(array[i] + ", ");				
			}
		}
		System.out.println("=============");
		// �������
		// ��һ��JDK�ṩ�õ�Arrays�࣬
		// ������һ��toString������ֱ�Ӿ��ܰ���������Ҫ�ĸ�ʽ�ַ���
		System.out.println(Arrays.toString(array));		
	}
}

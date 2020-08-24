package tut.demo01.d2array;
/*
 * ��ȡ���鳤�ȣ�
 * arrayName.length
 * ���õ�һ���������֣��������鳤��
 * ����һ�����������������ڼ䳤�Ȳ��ɸı�
 * 
 * �������飺�������ÿһ��Ԫ�ؽ��д���
 */
public class Demo06ArrayLength {
	public static void main(String[] args) {
		int[] array = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
		int len = array.length;
		System.out.println(len); // 11
		
		int[] arrayB = new int[3];
		System.out.println(arrayB.length); // 3
		arrayB = new int[5];
		// ��ַ�ı���
		System.out.println(arrayB.length); // 5
		
		System.out.println("===========");
		
		// �������飺ԭʼ��ʽ
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		// ��һ��һ���ã����鷳

		System.out.println("===========");
		
		// �������飺for����
		for (int i = 0; i < 11; i++) {
			System.out.println(array[i]);
		}
		// ��һ�����Ԫ�ظ��࣬Ҫ���ж�ֵ

		System.out.println("===========");
		
		// �������飺for�������length
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("===========");
		
		// �������飺foreach����
		for (int i : array) {
			System.out.println(i);
		}
	}
}

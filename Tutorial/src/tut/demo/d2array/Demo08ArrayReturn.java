package tut.demo.d2array;
/*
 * ��������Ϊ����ֵ������ʵ��һ������ӵ�ж������ֵ
 * 
 * �κ��������Ͷ�������Ϊ�����������ͺͷ���ֵ���ͣ�
 * ������Ϊ�����Ĳ�������ʵ�Ǵ�������ĵ�ַ
 * ������Ϊ�����ķ��أ���ʵ�Ƿ�������ĵ�ַ
 */
public class Demo08ArrayReturn {
	public static void main(String[] args) {
		int[] result = calculate(10, 20, 30);
		System.out.println("main�������յ��������ǣ�" + result); // ����ֵ
		System.out.println("�ܺͣ�" + result[0]);
		System.out.println("ƽ������" + result[1]);
	}
	
	public static int[] calculate(int a, int b, int c) {
		int sum = a + b + c; // �ܺ�
		int avg = sum / 3; // ƽ����
		// ��Ҫһ�����飬���Ա��������
//		int[] array = new int[2];
//		array[0] = sum;
//		array[1] = avg;
		int[] array = {sum, avg};
		System.out.println("calculate�����ڲ��������ǣ�" + array); // ��ֵַ
		return array;
	}
}

package tut.demo.d1method;
/*
 * ���ڹ������Ƶķ�������Ϊ�����б�һ������Ҫ��ס̫�಻һ�������֣�̫�鷳
 * ���������أ�Overload��
 * ����������һ�������ǲ����б�һ��
 * ˭�ܶ����������������˭��˭���Բ��ϣ��ͱ���
 * �ô���
 * ֻ��Ҫ��סһ���������ƣ��Ϳ���ʵ�����ƵĶ������
 * 
 * ��������������������أ�
 * 1. ����������ͬ
 * 2. �������Ͳ�ͬ
 * 3. �����Ķ���˳��ͬ
 * 
 * �������������������޹أ�
 * 1. ����������޹�
 * 2. �뷽���ķ���ֵ�����޹�
 */
public class Demo04MethodOverload {
	public static void main(String[] args) {
		System.out.println(sumTwo(10, 20));
		System.out.println(sumThree(10, 20, 30));
		System.out.println(sumFour(10, 20, 30, 40));
		
		// ����
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40));
//		System.out.println(sum(10, 20, 30, 40, 50)); // �����Ҳ�������������������ķ���
	}
	
	/*
	 * ��������£�
	 */
	public static int sumTwo(int a, int b) {
		return a + b;
	}
	public static int sumThree(int a, int b, int c) {
		return a + b + c;
	}
	public static int sumFour(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	/*
	 *  ���������أ�
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	// �������Ͷ���
	public static int sum(double a, double b) {
		return (int) (a + b);
	}
	
	public static int sum(int a, double b) {
		return (int) (a + b);
	}

	public static int sum(double a, int b) {
		return (int) (a + b);
	}
	// ��������޹�
//	public static int sum(int x, int y) { //�����Ѿ����������int���͵Ĳ���
//		return x + y;
//	}
	// �뷵��ֵ�����޹�
//	public static double sum(int a, int b) { // ��ʵ�͸�����һ��
//		return a + b + 0.0;
//	}
}

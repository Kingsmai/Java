package tut.demo02.d7math;

/*
 * java.lang.Math������ѧ��صĹ����࣬�����ṩ�˴�����̬�������������ѧ������صĲ���
 * 
 * public static double abs(double num); ��ȡ����ֵ����������
 * public static double ceil(double num); ����ȡ��
 * public static double floor(double num); ����ȡ��
 * public static long round(double num); ��������
 * 
 * Math.PI������Ƶ�Բ���ʳ���
 */
public class Demo01Math {
	public static void main(String[] args) {
		// ��ȡ����ֵ
		System.out.println(Math.abs(3.14)); // 3.14
		System.out.println(Math.abs(0)); 	// 0
		System.out.println(Math.abs(-2.5)); // 2.5
		System.out.println("=============");
		
		// ����ȡ��
		System.out.println(Math.ceil(3.9)); // 4.0
		System.out.println(Math.ceil(3.1)); // 4.0
		System.out.println(Math.ceil(3.0)); // 3.0
		System.out.println("=============");
		
		// ����ȡ��
		System.out.println(Math.floor(30.1)); // 30.0
		System.out.println(Math.floor(30.9)); // 30.0
		System.out.println(Math.floor(31.0)); // 31.0
		System.out.println("=============");
		
		// ��������
		System.out.println(Math.round(20.4)); // 20
		System.out.println(Math.round(10.5)); // 11
		
		// ���Ƶ�Բ���ʳ���
		System.out.println(Math.PI); // 3.141592653589793
	}
}

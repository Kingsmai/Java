package tut.demo01.d2array;
/*
 * ���������Ϊ�����Ĳ���
 * �����÷���ʱ���򷽷�С���Ž��д��Σ�����ȥ����ʵ������ĵ�ֵַ
 */
public class Demo07ArrayParam {
	public static void main(String[] args) {
		int[] array = {10, 20, 30};
		System.out.println(array); // ��ֵַ
		printArray(array);
		System.out.println("=====AAA=====");
		printArray(array);
		System.out.println("=====BBB=====");
		printArray(array);
	}
	
	/*
	 * ����ֵ���ͣ���ӡ������Ҫ���㣬û�н������void
	 * �������ƣ�printArray
	 * �����б�����������飬���ܴ�ӡ��ߵ�Ԫ��int[] array
	 */
	public static void printArray (int[] array) {
		System.out.println("printArray�����յ��Ĳ����ǣ�" + array); // ��ֵַ
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

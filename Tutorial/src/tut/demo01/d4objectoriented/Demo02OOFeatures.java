package tut.demo01.d4objectoriented;
/*
 * �������������������װ���̳С���̬
 * 
 * ��װ����Java�е����֣�
 * 1. ��������һ�ַ�װ
 * 2. �ؼ���Ҳ��һ�ַ�װ
 * 
 * ��װ���ǽ�һЩϸ����Ϣ����������������粻�ɼ�
 */
public class Demo02OOFeatures {
	public static void main(String[] args) {
		int[] array = {5, 15, 25, 100, 20};
		int max = getMax(array);
		System.out.println("���ֵ��" + max);
	}
	
	// ����һ�����飬����һ�����ֵ
	// ��������һ�ַ�װ
	public static int getMax(int[] array) {
		int max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) {
//				max = array[i];
//			}
//		}
		
		// ��һ���д��
		for (int i : array) {
			max = max < i ? i : max;
		}
		
		return max;
	}
}

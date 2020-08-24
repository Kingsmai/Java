package tut.demo01.d2array;
/*
 * ���鷴ת��
 * Ҫ����ʹ��������
 * 
 * 1. ����Ԫ�ط�ת����ʵ���ǶԳ�λ�õ�Ԫ�ؽ���
 * 
 * 2. ͨ������������һ������
 * int i = 0;
 * 2. ���ڱ�ʾ�Գ�λ����Ҫ��������
 * int i = 0;
 * int j = array.length - 1;
 * 
 * 3. ��������������ֵ
 * int a = 10;
 * int b = 20;
 * 3. ʵ�֣�
 * int temp = a;
 * a = b;
 * b = temp;
 * 
 * 4. ʲôʱ��ֹͣ���� i == j || i > j
 * 5. ʲôʱ�򽻻���i < j
 */
public class Practise02ArrayReverse {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		for (int num : array) {
			System.out.print(num + ", ");
		}
		System.out.println();
		/*
		 * ��ʼ����䣺int min = 0, max = array.length - 1;
		 * �����жϣ�min < max;
		 * �������ʽ��min++, max--
		 */
		for (int min = 0, max = array.length - 1; min < max; min++, max--) {
			int temp = array[min];
			array[min] = array[max];
			array[max] = temp;
		}
		for (int num : array) {
			System.out.print(num + ", ");
		}
	}
}

package tut.day05.d1exception;

/*
 * �쳣�Ĳ������̷����������쳣��ô�����ģ���δ����쳣��
 */
public class Demo02Exception {

	public static void main(String[] args) {
		// ����int���͵����鲢��ֵ
		int[] arr = {1, 2, 3};
		int e = getElement(arr, 3);
		System.out.println(e);
	}
	
	/*
	 * ����һ����������ȡָ����������Ԫ��
	 * ������
	 *     int[] arr
	 *     int index
	 */
	public static int getElement(int[] arr, int index) {
		int elem = arr[index];
		return elem;
	}
}

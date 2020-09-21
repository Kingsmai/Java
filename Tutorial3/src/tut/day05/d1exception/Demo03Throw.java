package tut.day05.d1exception;

/*
 * throw�ؼ���
 * ���ã�
 *     ����ʹ��throw�ؼ�����ָ���ķ������׳�ָ�����쳣
 * ʹ�ø�ʽ��
 *     throw new xxxException("�쳣������ԭ��");
 * ע�����
 *     1. throw�ؼ��ֱ���д�ڷ������ڲ�
 *     2. throw�ؼ���new�Ķ��������Exception����Exception���������
 *     3. throw�ؼ����׳�ָ�����쳣�������Ǿͱ��봦������쳣����
 *         throw�ؼ��ֺ�ߴ�������runtimeException������runtimeException������������ǿ��Բ�����Ĭ�Ͻ���JVM������ӡ�쳣�����жϳ���
 *         throw�ؼ��ֺ�ߴ������Ǳ����쳣��д����ʱ��ı��������Ǿͱ��봦������쳣��Ҫôthrows��Ҫôtry...catch
 */
public class Demo03Throw {

	public static void main(String[] args) {
//		int[] arr = null;
		int[] arr = new int[3];
		int e = getElement(arr, 3);
		System.out.println(e);
	}
	
	/*
	 * ����һ����������ȡָ����������Ԫ��
	 * ������
	 *     int[] arr
	 *     int index
	 * �Ժ󣨹����У��������ȱ���Է������ݹ����Ĳ������кϷ���У�飬
	 * ����������Ϸ������Ǿͱ���ʹ���׳��쳣�ķ�ʽ��֪�����ĵ����ߣ����ݵĲ���������
	 * ע�⣺
	 *     NullPointerException��һ���������쳣�����ǿ��Բ�����Ĭ�Ͻ���JVM����
	 *     ArrayIndexOutOfBoundsException��һ���������쳣�����ǿ��Բ�����Ĭ�Ͻ���JVM����
	 */
	public static int getElement(int[] arr, int index) {
		/*
		 * ���ǿ��ԶԴ��ݹ����Ĳ��������飩�����кϷ�У��
		 * �������arr��ֵ��null����ô���Ǿ��׳���ָ���쳣����֪�����ĵ����ߡ����ݵ������ֵ��null��
		 */
		if (arr == null) {
			throw new NullPointerException("���ݵ������ֵ��null");
		}
		/*
		 * ���ǿ��ԶԴ��ݹ����Ĳ�����index�������кϷ�У��
		 * ���index�ķ�Χ���������������Χ�ڣ���ô���Ǿ��׳���������Խ���쳣����֪ʹ�÷����ߡ����ݵ����������������ʹ�÷�Χ��
		 */
		if (index < 0 || index > arr.length - 1) {
			throw new ArrayIndexOutOfBoundsException("���ݵ����������������ʹ�÷�Χ");
		}
		int elem = arr[index];
		return elem;
	}
}

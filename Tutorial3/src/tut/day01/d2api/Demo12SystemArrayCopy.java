package tut.day01.d2api;

import java.util.Arrays;

public class Demo12SystemArrayCopy {

	public static void main(String[] args) {
		/*
		 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 * ��������ָ�������ݿ�������һ�������С�
		 * ������
		 * src - Դ���顣
		 * srcPos - Դ�����е���ʼλ�á�
		 * dest - Ŀ�����顣
		 * destPos - Ŀ�������е���ʼλ�á�
		 * length - Ҫ���Ƶ�����Ԫ�ص�������
		 */
		/*
		 *  ��Ŀ����src������ǰ3��Ԫ�أ����Ƶ�dest�����ǰ3��λ����
		 *  ����Ԫ��ǰ��src����Ԫ��[1,2,3,4,5]��dest����Ԫ��[6,7,8,9,10]
		 *  ����Ԫ�غ�src����Ԫ��[1,2,3,4,5]��dest����Ԫ��[1,2,3,9,10]
		 */
		int[] src = {1, 2, 3, 4, 5};
		int[] dest = {6, 7, 8, 9, 10};
		System.out.println("����ǰsrc: " + Arrays.toString(src) + ", dest: " + Arrays.toString(dest));
		System.arraycopy(src, 0, dest, 0, 3);
		System.out.println("���ƺ�src: " + Arrays.toString(src) + ", dest: " + Arrays.toString(dest));
	}
}

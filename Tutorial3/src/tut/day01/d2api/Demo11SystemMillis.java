package tut.day01.d2api;

public class Demo11SystemMillis {

	public static void main(String[] args) {
		/*
		 * public static long currentTimeMillis()
		 * �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
		 */
		// ��Ŀ����֤forѭ����ӡ����1-9999����Ҫʹ�õ�ʱ�䣨���룩
		// ����ִ��ǰ����ȡһ�κ���ֵ
		long start = System.currentTimeMillis();
		for(int i = 0; i < 9999; i++) {
			System.out.println(i);
		}
		// ����ִ�к󣬻�ȡһ�κ���ֵ
		long end = System.currentTimeMillis();
		// �����ֵ
		System.out.println("��������" + (end - start) + "ms");
	}
}

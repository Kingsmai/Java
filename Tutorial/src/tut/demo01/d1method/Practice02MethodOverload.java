package tut.demo01.d1method;
/*
 * ����������ϰ
 */
public class Practice02MethodOverload {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(isSame(a, b));
		System.out.println(isSame((short)10, (short)10));
		System.out.println(isSame(11, 12));
		System.out.println(isSame(20L, 20L));
	}
	
	/*
	 * �Ƚ����������Ƿ����
	 * �������ͷֱ�Ϊ��byte, short, int, long
	 * ��ǿ���ò�ͬ�ķ���д�����ڲ������߼�
	 */
	public static boolean isSame(byte a, byte b) {
		System.out.println("�Ƚ�����byte�ķ���ִ�У�");
		boolean same;
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(short a, short b) {
		System.out.println("�Ƚ�����short�ķ���ִ�У�");
		boolean same = a == b ? true : false;
		return same;
	}
	public static boolean isSame(int a, int b) {
		System.out.println("�Ƚ�����int�ķ���ִ�У�");
		return a == b;
	}
	public static boolean isSame(long a, long b) {
		System.out.println("�Ƚ�����long�ķ���ִ�У�");
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
}

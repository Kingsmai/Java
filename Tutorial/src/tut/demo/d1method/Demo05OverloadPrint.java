package tut.demo.d1method;

// byte short int long float double char boolean
// String

// �ڵ����������ʱ��println�ķ�����ʵ���ǽ����˶���������ʽ������
public class Demo05OverloadPrint {
	public static void main(String[] args) {
		myPrint(100);
		myPrint("Hello");
	}

	public static void myPrint(byte param) {
		System.out.println(param);
	}
	public static void myPrint(short param) {
		System.out.println(param);
	}
	public static void myPrint(int param) {
		System.out.println(param);
	}
	public static void myPrint(long param) {
		System.out.println(param);
	}
	public static void myPrint(float param) {
		System.out.println(param);
	}
	public static void myPrint(double param) {
		System.out.println(param);
	}
	public static void myPrint(char ch) {
		System.out.println(ch);
	}
	public static void myPrint(boolean is) {
		System.out.println(is);
	}
	public static void myPrint(String str) {
		System.out.println(str);
	}
}

package tut.d1interface.demo01;

public interface MyInterfacePrivateB {

	public static void methodStatic1() {
		System.out.println("��̬����1");
		methodStaticCommon();
	}
	
	public static void methodStatic2() {
		System.out.println("��̬����2");	
		methodStaticCommon();
	}
	
	private static void methodStaticCommon() {
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
	}
}

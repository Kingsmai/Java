package tut.d1interface.demo02;

public interface MyInterfaceA {
	// ����д�����ӿڲ����о�̬�����
//	static {
//		
//	}
	
	// ����д�����ӿڲ����й��췽��
//	public MyInterface() {
//		
//	}
	
	public abstract void methodA();
	
	public abstract void methodSame();
	
	public default void methodDefault() {
		System.out.println("�ӿ�A��Ĭ�Ϸ���");
	}
}

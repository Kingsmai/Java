package tut.d1interface.demo02;

public interface MyInterfaceB {

	public abstract void methodB();

	public abstract void methodSame();

	public default void methodDefault() {
		System.out.println("�ӿ�B��Ĭ�Ϸ���");
	}
}

package tut.d1interface.demo03;

/*
 * ����ӽӿ���4��������
 * methodA ��Դ�ڽӿ�A
 * methodB ��Դ�ڽӿ�B
 * methodCommon ͬʱ��Դ�ڽӿ�A��B
 * method ��Դ�����Լ�
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

	public abstract void method();

	@Override
	default void methodDefault() {
		// TODO Auto-generated method stub
		System.out.println("������дĬ�Ϸ���");
	}
}

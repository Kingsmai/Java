package tut.d1interface.demo01;

/*
 * ��Java8��ʼ���ӿ���������Ĭ�Ϸ���
 * ��ʽ��
 * public default ����ֵ���� ��������(�����б�) {
 *     // ������
 * }
 * 
 * ��ע����ע���е�Ĭ�Ϸ��������Խ���ӿ�����������
 */
public interface MyInterfaceDefault {

	// ���󷽷�
	public abstract void methodAbs();
	
	// �������һ�����󷽷�
//	public abstract void methodAbs2();
	
	// ����ӵķ������ĳ�Ĭ�Ϸ���
	public default void methodDefault() {
		System.out.println("��������ӵ�Ĭ�Ϸ���");
	}
	
	// public ���η����Ա�ʡ��
	default void methodDefault2() {
		System.out.println("public ���η����Ա�ʡ��");
	}
}

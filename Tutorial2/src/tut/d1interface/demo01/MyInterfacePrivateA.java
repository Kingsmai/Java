package tut.d1interface.demo01;

/*
 * ����������
 * ������Ҫ��ȡһ�����з����������������Ĭ�Ϸ���֮���ظ����������
 * ����������з�����Ӧ����ʵ����ʹ�ã�Ӧ����˽�л���
 * 
 * �����������Java9��ʼ���ӿڵ���������˽�з�����
 * 1. ��ͨ˽�з�����������Ĭ�Ϸ���֮���ظ���������
 * ��ʽ��
 * private ����ֵ���� ��������(�����б�) {
 *     // ������
 * }
 * 2. ��̬˽�з�������������̬����֮���ظ���������
 * ��ʽ��
 * private static ����ֵ���� ��������(�����б�) {
 *     // ������
 * }
 */
public interface MyInterfacePrivateA {

	public default void methodDefault1() {
		System.out.println("Ĭ�Ϸ���1");
		methodCommon();
	}
	
	public default void methodDefault2() {
		System.out.println("Ĭ�Ϸ���2");	
		methodCommon();
	}
	
	private void methodCommon() {
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
	}
}

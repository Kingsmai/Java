package tut.d1interface.demo01;

/*
 * ��Java8��ʼ���ӿڵ��������徲̬����
 * ��ʽ��
 * public static void ��������(�����б�) {
 *     // ������
 * }
 * ��ʾ�����ǽ�abstract����default����static���ɣ����Ϸ�����
 */
public interface MyInterfaceStatic {

	public static void methodStatic() {
		System.out.println("���ǽӿڵľ�̬����");
	}
	
	static void methodStatic2() {
		System.out.println("public ���η����Ա�ʡ��");
	}
}

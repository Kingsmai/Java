package tut.d3final.demo01;

/*
 * ��final�ؼ�����������һ��������ʱ����������������շ�����Ҳ���ǲ��ܱ�������д
 * ��ʽ��
 * ���η� final ����ֵ���� ��������(�����б�) {
 * 	// ������
 * }
 */
public abstract class Father {

	public final void method() {
		// TODO Auto-generated method stub
		System.out.println("���෽��ִ��");
	}
	
	public abstract /*final*/ void methodAbs();
}

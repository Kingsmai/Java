package tut.demo04.d1extends;

// ����һ�����ֻ���ʹ�����ֻ���Ϊ����
public class NewPhone extends Phone {
	@Override
	public void show() {
//		System.out.println("��ʾ����"); // �ظ���
		super.show(); // �Ѹ����show�����ù�����
		// �Լ���������Ӹ�������
		System.out.println("��ʾ����");
		System.out.println("��ʾͷ��");
	}
}

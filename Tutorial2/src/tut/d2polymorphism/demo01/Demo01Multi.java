package tut.d2polymorphism.demo01;

/*
 * ���뵱�����ֶ�̬�ԣ���ʵ����һ�仰����������ָ���������
 * ��ʽ��
 * �������� ������ = new ��������();
 * ����
 * �ӿ����� ������ = new ʵ��������();
 */
public class Demo01Multi {

	public static void main(String[] args) {
		// ʹ�ö�̬��д��
		// ��߸�������ã�ָ���ұ�����Ķ���
		Father obj = new Son();
		
		obj.method(); // ���෽��
		
		obj.methodFather();
		
//		obj.methodSon(); // �ò������෽��
	}
}

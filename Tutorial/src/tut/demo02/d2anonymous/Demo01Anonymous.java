package tut.demo02.d2anonymous;
/*
 * ��������ı�׼��ʽ��
 * ������ ������ = new ������();
 * 
 * �����������ֻ���ұߵĶ���û����ߵ����ֺ͸��������
 * new ������();
 * 
 * ��������ֻ��ʹ��Ψһ��һ�Σ��´�ʹ�ò��ò��ٴ���һ���µĶ���
 * ʹ�ý��飺���ȷ����һ������ֻ��Ҫʹ��Ψһ��һ�Σ��Ϳ�������������
 */
public class Demo01Anonymous {
	public static void main(String[] args) {
		Person one = new Person();
		one.name = "����";
		one.showName(); // �ҽ�����
		System.out.println("=============");
		
		// ��������
		new Person().name = "����";
		new Person().showName(); // �ҽ�null
	}
}

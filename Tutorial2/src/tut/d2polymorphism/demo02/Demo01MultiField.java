package tut.d2polymorphism.demo02;

/*
 * ���ʳ�Ա���������ַ�ʽ��
 * 
 * 1. ֱ��ͨ���������Ʒ��ʳ�Ա���������Ⱥ������˭��������˭��û����������
 * 2. ���ͨ����Ա�������ʳ�Ա���������÷�������˭��������˭��û����������
 */
public class Demo01MultiField {

	public static void main(String[] args) {
		// ʹ�ö�̬��д������������ָ���������
		Father obj = new Son();
		System.out.println(obj.num); // 10�������ֵ
//		System.out.println(obj.age); // ����Father��û�������Ա����
		System.out.println("==========");
		
		// ����û�и�����д�����Ǹ���10
		// �������������д�������ӣ�20
		obj.showNum();
	}
}

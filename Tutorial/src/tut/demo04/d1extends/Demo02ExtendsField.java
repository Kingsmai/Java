package tut.demo04.d1extends;

/*
 * �ڸ�����ļ̳й�ϵ���У������Ա�����������򴴽��������ʱ�����������ַ�ʽ��
 * 
 * ֱ��ͨ�����������ʳ�Ա������
 * �Ⱥ������˭����������˭��û�о�������
 * ���ͨ����Ա�������ʳ�Ա������
 * �÷�������˭����������˭��û����������
 * 
 * �ֲ�������ֱ��д
 * ����ĳ�Ա������this.��Ա����
 * ����ĳ�Ա������super.��Ա����
 * 
 * �ڸ�����ļ̳й�ϵ�У�����������󣬷��ʳ�Ա�����Ĺ���
 * �����Ķ�����˭����������˭�����û�о�������
 * 
 * ע�����
 * �����ǳ�Ա�������ǳ�Ա���������û�ж��������ң����Բ��������������
 */
public class Demo02ExtendsField {
	public static void main(String[] args) {
		Father father = new Father(); // �����������
		System.out.println(father.numFather); // ֻ��ʹ�ø���Ķ�����û���κ���������
		System.out.println("=============");
		
		Son son = new Son(); // �����������
		System.out.println(son.numFather); // 10
		System.out.println(son.numSon); // 20
		System.out.println("=============");
		
		// �Ⱥ������˭����������˭
		System.out.println(son.num); // �������࣬200
//		System.out.println(son.abc); // ������û�У����뱨��
		System.out.println("=============");
		
		// �������������ģ�����������ģ�û����������
		son.methodSon(); // 200
		// ����������ڸ��൱�ж�����
		son.methodFather(); // 100
		System.out.println("=============");
		
		son.method(); // ������������ִ��
	}
}

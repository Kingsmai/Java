package tut.d2polymorphism.demo02;

/*
 * �ڶ�̬���뵱�У���Ա�����ķ��ʹ����ǣ�
 * 	��new����˭����������˭��û����������
 * 
 * �ھ������뿴��ߣ����п��ұ�
 * 
 * �Ա�һ�£�
 * ��Ա���������뿴��ߣ����л������
 * ��Ա���������뿴��ߣ����п��ұ�
 */
public class Demo02MultiMethod {

	public static void main(String[] args) {
		Father obj = new Son(); // ��̬
		obj.method(); // ���Ӷ��У���������
		obj.methodFather(); // ����û�У�������
		
		// ���뿴�������Father��Father����û��methodSon���������Ա��뱨��
//		obj.methodSon(); // ����д��
	}
}

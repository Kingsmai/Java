package tut.d1interface.demo01;

/*
 * 1. �ӿڵ�Ĭ�Ϸ���������ͨ���ӿڵ�ʵ�������ֱ�ӵ���
 * 2. �ӿڵ�Ĭ�Ϸ����� Ҳ���Ա��ӿ�ʵ������и�����д
 */
public class Demo02Interface {

	public static void main(String[] args) {
		MyInterfaceDefaultA a = new MyInterfaceDefaultA();
		
		// ���ó��󷽷���ʵ�����е����Ҳ�ʵ����
		a.methodAbs();
		// ����Ĭ�Ϸ��������ʵ���൱��û�У��������ҽӿڵ�
		a.methodDefault();
		System.out.println("==============");
		
		MyInterfaceDefaultB b = new MyInterfaceDefaultB();
		b.methodAbs();
		b.methodDefault();
	}
}

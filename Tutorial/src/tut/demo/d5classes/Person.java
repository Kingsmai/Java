package tut.demo.d5classes;
/*
 * �������ľֲ���������ĳ�Ա����������ʱ�򣬸��ݡ��ͽ�ԭ�򡱣�����ʹ�þֲ�����
 * �����Ҫ���ʱ��൱�еĳ�Ա��������Ҫʹ�ø�ʽ��
 * this.��Ա������
 * 
 * ͨ��˭���õķ�����˭����this
 * thisһ��Ҫд�ڷ�������
 */
public class Person {
	String name; // ���Լ�������
	
	/**
	 * ���к�
	 * @param who �Է�������
	 */
	public void sayHello(String who) {
		System.out.println(who + "����á�����" + name);
	}
	
	/*
	 * �ͳ�Ա����ͬ�����ֵĲ���
	 */
	public void sayHi(String name) {
//		System.out.println(name + "����á�����" + name); // ������name�õĶ��ǲ���
		System.out.println(name + "����á�����" + this.name); // ������name�õĶ��ǲ���
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

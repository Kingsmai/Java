package tut.demo04.d1extends;

public class Father {
	int numFather = 10;
	
	int num = 100;
	
	public Father() {
		System.out.println("�����޲ι���");
	}
	
	public Father(int num) {
		System.out.println("�����вι���");
	}
	
	public void methodFather() {
		System.out.println("���෽��ִ��");
		// ʹ�õ��Ǳ��൱�еģ����������������
		System.out.println(num);
	}
	
	public Object method() {
		System.out.println("������������ִ��");
		return null;
	}
}

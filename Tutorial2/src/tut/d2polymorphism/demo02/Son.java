package tut.d2polymorphism.demo02;

public class Son extends Father {

	int num = 20;
	
	int age = 19;
	
	@Override
	public void showNum() {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
	
	@Override
	public void method() {
		System.out.println("���෽��");
	}
	
	public void methodSon() {
		System.out.println("�������з���");
	}
}

package tut.d5innerclass.demo01;

public class Demo02InnerClass {

	public static void main(String[] args) {
		// �ⲿ������.�ڲ������� ������ = new �ⲿ������().new �ڲ�������();
		Outer.Inner obj = new Outer().new Inner();
		obj.methodInner();
	}
}

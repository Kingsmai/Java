package tut.demo.d5classes;

public class Demo01Person {
	public static void main(String[] args) {
		Person person = new Person();
		// ���Լ�������
		person.name = "����";
		person.sayHello("����");
		person.sayHi("����");
		
		// ͨ��˭���õķ�����˭����this
		System.out.println(person); // tut.demo.d5.Person@15db9742
		person.printThis(); // ͬ��
	}
}

package tut.demo.d4objectoriented;

public class Demo03Person {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "С��";
//		person.age = 19; // ֱ�ӷ���private���ݣ�����
		person.setAge(-19);
		person.show();
	}
}

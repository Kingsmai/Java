package tut.demo03.d1static;

public class Demo03StaticStudent {
	public static void main(String[] args) {
		// ��������һ�½��ң����Ǿ�̬�Ķ�����Ӧ��ͨ�������Ƶ���
		Student.classroom = "101����";
		Student one = new Student("����", 20);
		System.out.println("one��������" + one.getName());
		System.out.println("one�����䣺" + one.getAge());
		System.out.println("one�Ľ��ң�" + Student.classroom);
		System.out.println("==============");
		Student two = new Student("����", 18);
		System.out.println("two��������" + two.getName());
		System.out.println("two�����䣺" + two.getAge());
		System.out.println("two�Ľ��ң�" + Student.classroom);
	}
}

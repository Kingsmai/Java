package tut.demo.d6standardclass;

public class Demo01Student {
	public static void main(String[] args) {
		Student stu1 = new Student(); // �����µ�student�ն���
		System.out.println("������" + stu1.getName() + "������" + stu1.getAge());
		stu1.setName("����");
		stu1.setAge(20);
		System.out.println("������" + stu1.getName() + "������" + stu1.getAge());
		System.out.println("=========");
		Student stu2 = new Student("����", 21); // �����µ�student����
		System.out.println("������" + stu2.getName() + "������" + stu2.getAge());
		stu2.setAge(22); // �޸�����
		System.out.println("������" + stu2.getName() + "������" + stu2.getAge());
	}
}

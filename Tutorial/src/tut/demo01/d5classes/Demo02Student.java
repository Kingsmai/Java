package tut.demo01.d5classes;

public class Demo02Student {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student stu1 = new Student(); // ��ʵ���ǵ���Student�Ĺ��캯��
		System.out.println("=============");
		Student stu2 = new Student("С��", 19);
		System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
		// �����Ҫ�ı�����г�Ա�����������ݣ���Ȼ��Ҫʹ��setXxx()����
		stu2.setAge(20); // �ı�����
		System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
	}
}

package tut.demo03.d1static;

/*
 * ���һ����Ա����ʹ����static�ؼ��֣���ô��������������ڶ����Լ��������������ڵ��࣬���������ͬһ������
 */
public class Demo01StaticField {
	public static void main(String[] args) {
		Student one = new Student("����", 19);
		one.classroom = "101����";
		Student.classroom = "101����"; // eclipse����������д�������ʽ�����Ҳһ����������û��
		System.out.println("ѧ�ţ�" + one.getId() + "��������" + one.getName() + "�����䣺" + one.getAge() + "�����ң�" + one.classroom);
		Student two = new Student("����", 16);
		System.out.println("ѧ�ţ�" + two.getId() + "��������" + two.getName() + "�����䣺" + two.getAge() + "�����ң�" + two.classroom);		
	}
}

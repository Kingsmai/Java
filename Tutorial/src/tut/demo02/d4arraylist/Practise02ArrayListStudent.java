package tut.demo02.d4arraylist;

import java.util.ArrayList;

/*
 * �Զ���4��ѧ������,��ӵ�����,������
 * 
 * ˼·��
 * 1. �Զ���Student�࣬�ĸ�����
 * 1.1. private���δʣ��޲ι��췽����ȫ�ι��췽����getter/setter
 * 2. ����һ�����ϣ����ڴ洢ѧ�����󣬷���<Student>
 * 3. �����࣬����4��ѧ������
 * 4. ��4��ѧ��������ӵ������У�add
 * 5. ��������for, size, get
 */
public class Practise02ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student one = new Student("����", 18);
		Student two = new Student("����", 28);
		Student three = new Student("����", 38);
		Student four = new Student("����", 48);
		
		students.add(one);
		students.add(two);
		students.add(three);
		students.add(four);
		
//		System.out.println(students); // ��ַ����
		for (int i = 0; i < students.size(); i++) {
//			System.out.println(students.get(i)); // ��ֵַ
			Student std = students.get(i);
			System.out.println("������" + std.getName() + "�����䣺" + std.getAge());
		}
	}
}

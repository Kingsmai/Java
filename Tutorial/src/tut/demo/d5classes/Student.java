package tut.demo.d5classes;
/*
 * ���췽����ר��������������ķ�����������ͨ��new����������ʱ��
 * ��ʵ���ǵ��ù��췽��
 * ��ʽ��
 * public ������(�������� ��������, ...) {
 * 	������
 * }
 * 
 * ע�����
 * 1. ���췽�������Ʊ�������ڵ���������ȫһ����������СдҲҪһ��
 * 2. ���췽����Ҫд����ֵ���ͣ���void����д
 * 3. ���췽������returnһ������ķ���ֵ
 * 4. ���û�б�д�κι��췽������ô����������Ĭ������һ�����췽����û�в�����������ʲô���鶼����
 * 5. һ���д������һ�����캯������ô����������������
 * 6. ���췽��Ҳ�ǿ��Խ������ص�
 * 6.1. ���أ�����������ͬ�������б�ͬ
 */
public class Student {
	private String name;
	private int age;
	
	// ���췽��
	public Student() {
		System.out.println("�޲ι��췽��ִ������");
//		return 100; // ����д���������з���ֵ
	}
	
	// ȫ�ι��췽��
	public Student(String name, int age) {
		System.out.println("ȫ�ι��췽��ִ������");
		this.setName(name);
		this.setAge(age);
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

package tut.day03.d5collections;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

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

	// ��д����Ĺ���
	@Override
	public int compareTo(Person o) {
//		return 0; // ��ΪԪ�ض�����ͬ��
		// �Զ���ȽϵĹ��򣬱Ƚ������˵�����(this, ����Person)
//		return this.getAge() - o.getAge(); // ����������������
		return o.getAge() - this.getAge(); // �������併������
	}
}

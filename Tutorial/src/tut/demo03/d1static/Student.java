package tut.demo03.d1static;

public class Student {
	private int id; // ѧ��
	private String name; // ����
	private int age; // ����
	static String classroom; //���ڽ���
	private static int idCounter = 0; // ѧ�ż�������ÿ��newһ���µĶ����ʱ�򣬼�����++
	
	public Student() {
		this.id = ++idCounter;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.id = ++idCounter;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

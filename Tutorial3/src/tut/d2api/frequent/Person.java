package tut.d2api.frequent;

//import java.util.Objects;

public class Person {

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
	
	/*
	 * ֱ�Ӵ�ӡ����ĵ�ֵַû�����壬��Ҫ��дObject���toString����
	 * ��ӡ���������
	 * eclipseͨ��Source -> Generate ToString��������
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/*
	 * Object���equals����Ĭ�ϱȽϵ�����������ĵ�ֵַ��û������
	 * ��дequals�ķ������Ƚ�������������ԣ�name, age��
	 * ���⣺������һ����̬���޷�ʹ���������е����ݣ����Ժͷ�����
	 * Object obj = person2 = new Person("����", 19);
	 * �����ʹ������ת�ͣ�ǿת����obj����תΪPerson
	 * 
	 * eclipseͨ��Source -> Generate HashCode and Equals��������
	 */
	@Override
	public boolean equals(Object obj) {
		// ������ݵĲ������Լ�(this)��ֱ�ӷ���true����߳���Ч��
		if (this == obj)
			return true;
		// ������ݵ�ֵ��null, ֱ�ӷ���false����߳���Ч��
		if (obj == null)
			return false;
		// �жϣ���ֹ����ת���쳣 ClassCastException
		// ������������ obj instanceof Person
		if (getClass() != obj.getClass()) // ʹ�÷��似�����ж�obj�Ƿ���person����
			return false;
		// ����ת�ͣ���obj����תΪPerson
		Person other = (Person) obj;
		// �Ƚ�������������ԣ�һ��������this��һ��������obj
		// this���Բ�д
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		// intellj IDEA �����ɷ��������㣡����
//		return age == other.age && Objects.equals(name, other.name);
		return true;
	}
	


	/*
	 * ��ΪtoString��������д�ˣ���߲����ã����ض����ֵַ��
	 * ��Object.class��toString�������ƹ����������µ�toMem����
	 * Ҳ������������ֱ��ͨ����Integer.toHexString(������.hashCode())���ص�ֵַ
	 */
	public String toMem() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
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
}

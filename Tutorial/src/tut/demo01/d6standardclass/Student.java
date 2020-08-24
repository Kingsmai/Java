package tut.demo01.d6standardclass;
/*
 * һ����׼����ͨ��Ҫӵ���ĸ���ɲ��֣�
 * 1. ���г�Ա������Ҫʹ��private�ؼ�������
 * 2. Ϊÿһ����Ա������дһ��Getter/Setter����
 * 3. ��дһ���޲�������
 * 4. ��дһ��ȫ��������
 * 
 * ������׼����Ҳ���� Java Bean
 * 
 * eclipse���ٴ���������
 * 1. ����Getter / Setter
 * 1.1. �Ϸ�Source�˵����ҵ�Generate Getter / Setter
 * 1.2. ѡ�����г�Ա������Ȼ��OK
 * 2. �����޲ι��췽��
 * 2.1. �Ϸ�Source�˵����ҵ�Generate Constructor Using Field
 * 2.2 ȡ����ѡ���еĳ�Ա������Ȼ��OK
 * 3. �����вι��췽��
 * 3.1. �Ϸ�Source�˵����ҵ�Generate Constructor Using Field
 * 2.2 ѡ�����г�Ա������Ȼ��OK
 * 
 * ����˳������ν
 * 
 */
public class Student {
	private String name; // ����
	private int age; // ����
	
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

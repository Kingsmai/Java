package tut.d3final.demo01;

/*
 * ���ڳ�Ա������˵�����ʹ��final�ؼ������Σ���ô�������Ҳ���ɱ䡣
 * 
 * 1. ���ڳ�Ա��������Ĭ��ֵ����������final֮������ֶ���ֵ�������ٸ�Ĭ��ֵ�ˡ�
 * 2. ����final�ĳ�Ա������Ҫôʹ��ֱ�Ӹ�ֵ��Ҫ��ͨ�����췽��ֱ�Ӹ�ֵ������ѡ��һ
 * 3. ���뱣֤�൱�����е����ط����������ջ��final�ĳ�Ա�������и�ֵ
 */
public class Person {

	private final String name/* = "����" */;

	public Person() {
		// TODO Auto-generated constructor stub
		name = "����";
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
}

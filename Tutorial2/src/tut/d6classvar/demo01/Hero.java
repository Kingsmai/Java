package tut.d6classvar.demo01;

/*
 * ��Ϸ���е�Ӣ�۽�ɫ��
 */
public class Hero {

	private String name; // ����
	private int age; // ����
	private Weapon weapon; // ����
	private Skill skill; // ����
	
	public Hero() {
		super();
	}

	public Hero(String name, int age, Weapon weapon, Skill skill) {
		super();
		this.name = name;
		this.age = age;
		this.weapon = weapon;
		this.skill = skill;
	}

	public void attack() {
		System.out.println("����Ϊ" + age + "��" + name + "ʹ��" + weapon.getCode() + "���й���");
		System.out.println("==============");
	}
	
	public void useSkill() {
		System.out.println(name + "�ͷż��ܣ�");
		skill.use();
		System.out.println("�����ͷ���ϣ�");
		System.out.println("==============");
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

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}

package tut.demo04.d2practise;

public class User {

	private String name; // ����
	private int money; // ���
	
	public User() {
		super();
	}

	public User(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	// ��ʾ��ǰ�û���Ϣ
	public void show() {
		System.out.println("�ҽУ�" + name + "�����ж���Ǯ��" + money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

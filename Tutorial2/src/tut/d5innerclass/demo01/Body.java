package tut.d5innerclass.demo01;

public class Body { // �ⲿ��

	public class Heart { // ��Ա�ڲ���
		
		// �ڲ���ķ���
		public void beat() {
			System.out.println("��������");
			System.out.println("�ҽУ�" + name); // ��ȷд��
		}
	}
	
	// �ⲿ��ĳ�Ա����
	private String name;
	
	// �ⲿ��ķ���
	public void methodBody() {
		System.out.println("�ⲿ��ķ���");
		Heart heart = new Heart();
		heart.beat();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package tut.demo04.d1extends;

/*
 * super�ؼ����÷������֣�
 * 1. ������ĳ�Ա�����У����ʸ���ĳ�Ա����
 * 2. ������ĳ�Ա�����У����ʸ���ĳ�Ա����
 * 3. ������Ĺ��췽���У����ʸ���Ĺ��췽��
 * 
 * super�ؼ����������ʸ������ݣ�this�ؼ����������ʱ�������
 * 
 * this�ؼ����÷������֣�
 * 1. �ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա����
 * 2. �ڱ���ĳ�Ա�����У����ʱ������һ����Ա����
 * 3. �ڱ���Ĺ��췽���У����ʱ������һ�����췽��
 * �ڵ����ַ�������Ҫע�⣺
 * A. this(...)����Ҳ�����ǹ��췽���еĵ�һ����䣬Ψһһ��
 * B. super��this���ֹ�����ò���ͬʱʹ��
 */
public class Son extends Father {
	int numSon = 20;
	
	int num = 200;
	
	public Son() {
//		super(); // ���ø����޲ι��췽������д����������
		super(10); // ���ø������صĹ��췽��
		// super������ǵ�һ�У�����ֻ��һ��
		System.out.println("���๹�췽��");
	}
	
	public Son (int n) {
		this(); // ������вι��죬���ñ�����޲ι���
		//��Ҳ���Է����������Ǳ���д�ڵ�һ�У�		
		// ���о��ǲ�����super();��Ϊ���ù��췽��ֻ���ڵ�һ�������ִ��
//		super(); // ��д��super();�ͱ�����
	}
	
	public void methodSon() {
		System.out.println("���෽��ִ��");
		// ��Ϊ���൱����num�����������õ��Ǳ����num
		System.out.println(num);
	}
	
	// �������ֱ���������
	@Override // ����ǲ�����Ч����ȷ������д������д�ϣ�
	public String method() { // ����ֵ��Χ Object > String
//		super(); // ����д����ֻ�����๹�췽�����ܵ��ø��๹�췽��
		super.method(); // ���ø����Ա����
		System.out.println("������������ִ��");
		int num = 300; // �ֲ�����
		System.out.println(num); // 300���ֲ�����
		System.out.println(this.num); // 200������ĳ�Ա����
		System.out.println(super.num); // 100������ĳ�Ա����
		return null;
	}
	
	public void methodA() {
		System.out.println("methodAִ��");		
	}
	
	public void metthodB() {
		methodA();
		this.methodA(); // ǿ��ʹ�ñ���ĳ�Ա����
		System.out.println("methodBִ��");
	}
}

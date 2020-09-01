package tut.d3final.demo01;

/*
 * final �ؼ��ִ������ա����ɸı��
 * 
 * �������ַ�����
 * 1. ������������һ����
 * 2. ������������һ������
 * 3. ������������һ���ֲ�����
 * 4. ������������һ����Ա����
 * 
 * 
 * ע�����
 * �����ࡢ������˵��abstract�ؼ��ֺ�final�ؼ��ֲ���ͬʱʹ�ã���Ϊì��
 */
public class Demo01Final {

	public static void main(String[] args) {
		int num1 = 30;
		System.out.println(num1); // 30
		num1 = 20;
		System.out.println(num1); // 20
		
		// һ��ʹ��final�������ξֲ���������ô��������Ͳ��ܽ��и���
		final int num2 = 200;
		System.out.println(num2); // 200
//		num2 = 250; // ����д�������ܸı�
//		num2 = 200; // ����д��
		
		final int num3;
		num3 = 30; // ��ȷд������֤��Ψһһ�θ�ֵ����
		System.out.println("====================");
		
		// ���ڻ���������˵�����ɱ�˵���Ǳ������е����ݲ��ɸı�
		// ��������������˵�����ɱ�˵���Ǳ������еĵ�ֵַ
		Student stu1 = new Student("����");
		System.out.println(stu1);
		System.out.println(stu1.getName()); // ����
		stu1 = new Student("����");
		System.out.println(stu1);
		System.out.println(stu1.getName()); // ����
		System.out.println("====================");
		
		final Student stu2 = new Student("����");
		System.out.println(stu2);
		System.out.println(stu2.getName());
		// ����д����final���������ͱ��������еĵ�ַ���ɸı�
//		stu2 = new Student("����");
		stu2.setName("����");
		System.out.println(stu2.getName());
	}
}

package tut.demo.d3objectoriented;
/*
 * ͨ������£�һ���಻��ֱ��ʹ�ã���Ҫ�����ഴ��һ������ ����ʹ��
 * 
 * 1. ������ָ����Ҫʹ�õ��࣬��ʲôλ��
 * import ������.������
 * import tut.dem0.d3objectoriented.Student;
 * 1.1. ���ڵ�ǰ������ͬһ���������������ʡ�Ե�����䲻д��������ļ���
 * 
 * 2. ����
 * ������ ������ = new ������();
 * Student stu = new Student();
 * 
 * 3. ʹ�ã���Ϊ�������֣�
 * 3.1. ʹ�ó�Ա������������.��Ա������;
 * 3.2. ʹ�ó�Ա������������.��Ա������();
 * ������˭�����ö�����.˭��
 * 
 * ע�����
 * 1. �����Ա����û�н��и�ֵ����ô������һ��Ĭ��ֵ�����������һ��
 */
public class Demo02Student {
	public static void main(String[] args) {
		// 1. ����
		// ����Ҫ��Student������ڵ��ļ���ͬһ�����£�����ʡ�Բ�д
		
		// 2. ����
		Student stu = new Student();
		System.out.println(stu); // tut.demo.d3objectoriented.Student@15db9742 ��ַ
		
		// 3. ʹ��
		System.out.println(stu.name); // null Ĭ��ֵ
		System.out.println(stu.age); // 0 Ĭ��ֵ
		System.out.println();
		
		// �ı�����еĳ�Ա������ֵ���ݣ�
		stu.name = "ŷ������"; // ���Ҳ���ַ�������ֵ��stu�����е�name��Ա����
		stu.age  = 20;
		System.out.println(stu.name); // ŷ������
		System.out.println(stu.age); // 20
		System.out.println();
		
		// 4. ʹ�ö���ĳ�Ա����
		stu.eat();
		stu.sleep();
		stu.study();
	}
}

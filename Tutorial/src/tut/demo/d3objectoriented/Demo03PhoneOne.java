package tut.demo.d3objectoriented;

public class Demo03PhoneOne {
	public static void main(String[] args) {
		// ����Phone�࣬����һ����Ϊone�Ķ���
		Phone one = new Phone();
		System.out.println(one.brand); // null
		System.out.println(one.price); // 0.0
		System.out.println(one.color); // null
		System.out.println("==========");
		
		one.brand = "��Ϊ";
		one.price = 4299.0;
		one.color = "��ɫ";
		System.out.println(one.brand); // ��Ϊ
		System.out.println(one.price); // 4299.0
		System.out.println(one.color); // ��ɫ
		
		one.call("������");
		one.sendMessage();
	}
}

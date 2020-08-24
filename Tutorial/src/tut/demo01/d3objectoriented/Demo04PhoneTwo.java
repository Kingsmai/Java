
package tut.demo01.d3objectoriented;

public class Demo04PhoneTwo {
	public static void main(String[] args) {
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
		System.out.println("==========");
		
		Phone two = new Phone();
		System.out.println(two.brand); // null
		System.out.println(two.price); // 0.0
		System.out.println(two.color); // null
		System.out.println("==========");
		
		two.brand = "ƻ��";
		two.price = 6899.0;
		two.color = "��ɫ";
		System.out.println(two.brand); // ƻ��
		System.out.println(two.price); // 6899.0
		System.out.println(two.color); // ��ɫ
				
		two.call("�ǲ�˹");
		two.sendMessage();
		System.out.println("==========");
	}
}

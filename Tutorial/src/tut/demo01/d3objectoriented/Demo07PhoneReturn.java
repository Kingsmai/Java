package tut.demo01.d3objectoriented;

public class Demo07PhoneReturn {
	public static void main(String[] args) {
		Phone two = getPhone();
		System.out.println(two.brand); // С��
		System.out.println(two.price); // 1299.0
		System.out.println(two.color); // ��ɫ
	}
	
	public static Phone getPhone() {
		Phone one = new Phone();
		one.brand = "С��";
		one.price = 1299.0;
		one.color = "��ɫ";
		return one;
	}
}

package tut.demo01.d3objectoriented;

public class Demo06PhoneParam {
	public static void main(String[] args) {
		Phone one = new Phone();
		one.brand = "����";
		one.price = 2788.0;
		one.color = "��ɫ";
		
		method(one); // ����ȥ����ʵ�ǵ�ֵַ
	}
	
	private static void method(Phone param) {
		// TODO Auto-generated method stub
		System.out.println(param.brand);
		System.out.println(param.price);
		System.out.println(param.color);
	}
}

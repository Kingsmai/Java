package tut.day01.d2api;

/*
 * ��StringBuilder�ַ���֮���������
 * StringBuilder�е�insert����
 */
public class Demo16StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Hello World!");
		System.out.println(str1); // Hello World!
		str1.insert(5, " Java");
		System.out.println(str1); // Hello Java World!
	}
}

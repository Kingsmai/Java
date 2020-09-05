package tut.d2api.frequent;

/*
 * StringBuilder��append����
 * public StringBuilder append(...)����������������ݵ��ַ�����ʽ�������ص�ǰ��������
 */
public class Demo14StringBuilderAppend {

	public static void main(String[] args) {
		// ����StringBuilder����
		StringBuilder str1 = new StringBuilder();
		// ʹ��append������StringBuilder���������
		// append�������ص���this -> ���÷����Ķ���
		StringBuilder str2 = str1.append("Hello, World!"); // ��str1�ĵ�ַ��ֵ��str2
		System.out.println(str1); // Hello, World!
		System.out.println(str2); // Hello, World!
		System.out.println(str1 == str2); // true����ֵַ��ͬ��
		
		// ʹ��append����������շ���ֵ
		StringBuilder str3 = new StringBuilder();
		// ���Բ�����������
		str3.append("Hello");
		str3.append('J');
		str3.append(true);
		str3.append(12);
		str3.append('��');
		str3.append(3.1415);
		System.out.println(str3); // HelloJtrue12��3.1415
		
		// ��ʽ��̣���������ֵ��һ�����󣬿��Լ������÷���
		System.out.println("abc".toUpperCase().toLowerCase()); // ���Լ���toUpperCase...
		StringBuilder str4 = new StringBuilder();
		str4.append("abc").append(123).append('z').append(Math.PI).append(false);
		System.out.println(str4); // abc123z3.141592653589793false
	}
}

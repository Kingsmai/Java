package tut.d2api.frequent;

/*
 * StringBuilder��String�����໥ת����
 * String -> StringBuilder: ʹ��StringBuilder���췽��
 *     StringBuilder(String str) ����һ����ʼ��Ϊָ���ַ������ݵ��ַ�����������
 * StringBuilder -> String: ʹ��StringBuilder�е�toString����
 *     public String toString() ����ǰStringBuilder����ת��ΪString����
 */
public class Demo15StringBuilderToString {

	public static void main(String[] args) {
		// String -> StringBuilder
		String str1 = "Hello";
		System.out.println("str1: " + str1); // str1: Hello
		StringBuilder str2 = new StringBuilder(str1);
		System.out.println("str2: " + str2); // str2: Hello
		
		// ��StringBuilder���������
		str2.append(", World!");
		System.out.println("str2: " + str2); // str2: Hello, World!
		// StringBuilder -> String
		String str3 = str2.toString();
		System.out.println("str3: " + str3); // str3: Hello, World!
	}
}

package tut.demo02.d5string;
/*
 * String�������ȡ��صĳ��÷���
 * 
 * public int length(); // ��ȡ�ַ������к��е��ַ��������õ��ַ�������
 * public String concat(); // ����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ���
 * public char charAt(int index); // ��ȡָ������λ�õĵ����ַ�����������0��ʼ��
 * public int indexOf(String str); // ���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�У�����-1ֵ
 */
public class Demo04StringGet {
	public static void main(String[] args) {
		// ��ȡ�ַ����ĳ���
		String str = "First, solve the problem. Then, write the code.";
		System.out.println("�ַ����ĳ��ȣ�" + str.length()); // 47
		
		int len = "Programs must be written for people to read, and only incidentally for machines to execute.".length();
		System.out.println("�ַ����ĳ��ȣ�" + len); // 91
		System.out.println("===============");
		
		// ƴ���ַ���
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.concat(str2);
		System.out.println(str1); // Hello��ԭ�ⲻ��
		System.out.println(str2); // World��ԭ�ⲻ��
		System.out.println(str3); // HelloWorld���µ��ַ���
		String str4 = str1 + str2;
		System.out.println(str4); // HelloWorld
		System.out.println(str4 == str3); // false
		System.out.println(str4.equals(str3)); // true
		System.out.println("===============");
		
		// ��ȡָ��λ�������ĵ����ַ�
		char ch = "Java".charAt(1);
		System.out.println("��1������λ�õ��ַ��ǣ�" + ch); // a
		System.out.println("===============");
		
		// ���Ҳ����ַ����ڱ����ַ������г��ֵ�һ�ε�����λ��
		// �������û�У�����ֵ -1
		String original = "Hello World Hello World";
		int index = original.indexOf("llo");
		System.out.println("��һ������ֵ�ǣ�" + index); // 2
		
		System.out.println("Hello World".indexOf("Java")); // -1
	}
}

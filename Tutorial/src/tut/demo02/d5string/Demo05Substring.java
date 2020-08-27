package tut.demo02.d5string;
/*
 * �ַ����Ľ�ȡ������
 * 
 * public String substring(int index); // �Ӳ���λ�ã�һֱ���ַ���ĩβ�������ַ���
 * public String substring(int begin, int end); // ��begin��ʼ��һֱ��end�������м���ַ���
 * ע�����
 * 1. [begin, end) ������ߣ��������ұ�
 * 2. substring��Сд�ģ�����������һ�����ʣ����ַ���
 */
public class Demo05Substring {
	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str2 = str1.substring(5);
		System.out.println("str1: " + str1); // HelloWorld��ԭ�ⲻ��
		System.out.println("str2: " + str2); // World�����ַ���
		System.out.println("==========");
		
		String str3 = str1.substring(4, 7);
		System.out.println("str3: " + str3); // oWo
		System.out.println("==========");
		
		/*
		 * ��������д�����ַ�����������Ȼ��û�иı�
		 * �����������ַ����� "Hello", "Java"
		 * strA���б�����ǵ�ֵַ
		 * ������ֵַ�� Hello �� 0x666
		 * ������ֵַ����� Java �� 0x999 
		 */
		String strA = "Hello";
		System.out.println(strA); // Hello
		strA = "Java";
		System.out.println(strA); // Java
	}
}

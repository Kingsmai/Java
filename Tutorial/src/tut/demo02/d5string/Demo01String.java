package tut.demo02.d5string;
/*
 * java.lang.String������ַ���
 * API �ĵ���All string literals in Java programs, such as "abc", are implemented as instances of this class.
 * ���룺Java �����е������ַ�������ֵ����"abc"������Ϊ�����ʾ��ʵ��
 * ��ʵ���ǳ���������˫���ŵ��ַ���������String��Ķ��󡣣�����û��new��������String��Ķ���
 * 
 * String���ص㣺
 * 1. �ַ��������������ɱ䡾�ص㡿
 * 2. ������Ϊ�ַ������ɸı䣬�����ַ����ǿ��Թ���ʹ�õ�
 * 3. �ַ���Ч�����൱����char[]�ַ����飬���ǵײ�ԭ����byte[]�ֽ�����
 * 
 * �����ַ����ĳ��� 3+1 �ַ�ʽ
 * ���ֹ��췽��
 * public String (); // ����һ���հ��ַ������������κ�����
 * public String (char[] array); // �����ַ���������ݣ���������Ӧ���ַ���
 * public String (byte[] array); // �����ֽ���������ݣ���������Ӧ���ַ���
 * һ��ֱ�Ӵ���
 * String str = "World"; // �ұ�ֱ����˫����
 * 
 * ע�⣺ֱ��д��˫���ţ������ַ�������
 */
public class Demo01String {
	public static void main(String[] args) {
		// ʹ�ÿղι���
		String str1 = new String(); // С�������գ�˵���ַ���ʲô���ݶ�û��
		System.out.println("��һ���ַ�����" + str1); // ��һ���ַ�����
		
		// �����ַ����鴴���ַ���
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String str2 = new String(charArray);
		System.out.println("�ڶ����ַ�����" + str2); // �ڶ����ַ�����Hello
		
		// �����ֽ����鴴���ַ���
		byte[] byteArray = {74, 97, 118, 97}; // �ַ���ASCII��
		String str3 = new String(byteArray);
		System.out.println("�������ַ�����" + str3); // �������ַ�����Java
		
		// ֱ�Ӵ���
		String str4 = "World";
		System.out.println("���ĸ��ַ�����" + str4); // ���ĸ��ַ�����World
	}
}

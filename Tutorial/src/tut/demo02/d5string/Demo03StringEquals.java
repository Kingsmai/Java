package tut.demo02.d5string;
/*
 * == �ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ������������
 * 
 * public boolean equals(Object obj); // �����������κζ���ֻ�в������ַ�������������ͬ�Ż᷵��true������false
 * ע�����
 * 1. �κζ�������Object���н���
 * 2. equals�������жԳ��ԣ�a.equals(b)��b.equals(a)Ч��һ��
 * 3. ����Ƚ�˫��һ������һ���������Ƽ��ѳ����ַ���д��ǰ��
 * �Ƽ��� "abc".equals(str)	���Ƽ��� str.equals("abc")
 * 
 * public boolean equalsIgnoreCase(String str); // ���Դ�Сд�������ݵıȽ�
 */
public class Demo03StringEquals {	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(charArray);
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str3)); // true
		System.out.println(str3.equals("Hello")); // true
		System.out.println("Hello".equals(str1)); // true
		
		String str4 = "hello";
		System.out.println(str1.equals(str4)); // false
		System.out.println("===========");
		
		String str5 = "abc";
		System.out.println("abc".equals(str5)); // �Ƽ�
		System.out.println(str5.equals("abc")); // ���Ƽ�
		String str6 = null;
		System.out.println("abc".equals(str6)); // false
//		System.out.println(str6.equals("abc")); // ������ָ���쳣
		System.out.println("===========");
		
		String strA = "Java";
		String strB = "java";
		System.out.println(strA.equals(strB)); // false
		System.out.println(strA.equalsIgnoreCase(strB)); // true
		
		// ֻ��Ӣ�����ִ�Сд�����������ִ�Сд
		System.out.println("abcһ123".equals("abcҼ123")); // false
	}
}

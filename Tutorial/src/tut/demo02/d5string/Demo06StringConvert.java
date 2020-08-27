package tut.demo02.d5string;
/*
 * String ���У���ת����صķ�����
 * 
 * public char[] toCharArray(); ����ǰ�ַ������Ϊ�ַ�������Ϊ����ֵ
 * public byte[] getBytes(); ����ַ����ײ���ֽ�����
 * public String replace(CharSequence oldString, CharSequence newString);
 * �����г��ֵ����ַ����滻Ϊ�µ��ַ����������滻֮��Ľ�����ַ���
 * 
 * ��ע��CharSequence��˼����˵���Խ����ַ�������
 */
public class Demo06StringConvert {
	public static void main(String[] args) {
		// ת����Ϊ�ַ�����
		char[] chars = "Hello".toCharArray();
		System.out.println(chars[0]); // H
		System.out.println(chars.length); // 5
		System.out.println("==============");
		
		// ת����Ϊ�ֽ�����
		byte[] bytes = "World".getBytes();
		System.out.println(bytes[0]); // 87
		System.out.println(bytes.length); // 5
		System.out.println("==============");
		
		// �ַ����������滻
		String str1 = "How do you do?";
		String str2 = str1.replace("o", "*");
		System.out.println(str1); // How do you do?
		System.out.println(str2); // H*w d* y*u d*?
		
		// ʵ�У���Ϸ���дʹ���
		String lang1 = "�᲻���氡�����ү�ģ�";
		String lang2 = lang1.replace("���ү��", "****");
		System.out.println(lang2); // �᲻���氡��****��
	}
}

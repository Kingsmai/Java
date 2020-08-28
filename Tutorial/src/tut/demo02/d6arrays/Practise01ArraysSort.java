package tut.demo02.d6arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * ��ʹ��`Arrays` ��ص�API����һ���ַ����е������ַ��������У��������ӡ��
 */
public class Practise01ArraysSort {
	public static void main(String[] args) {
		Random rnd = new Random();
		// ������Ҫ���ɵ��ַ��� [a-z][A-Z][0-9]
		String strPool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		// ��ɢ�ַ���Ϊ��������
		char[] charPool = strPool.toCharArray();
		// �����ַ����飬���ڱ�������ַ�
		char[] charArray = new char[30];
		// ��������ַ���
		for (int i = 0; i < charArray.length; i++) {
			// ����ַ�������ַ�����ֵ���ַ�����
			charArray[i] = charPool[rnd.nextInt(charPool.length)];
		}
		// ������ַ�����ת��Ϊ�ַ�������ʱ������ģ�
		String str = new String(charArray);
		System.out.println("����ַ�����" + str);
		// ������ַ�����������
		Arrays.sort(charArray);
		// ��������õ��ַ�����ת��Ϊ�ַ���
		str = new String(charArray);
		System.out.println("�����ַ�����" + str);	
		System.out.print("�����ַ�����");
		// �����������ַ����飬�����
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}

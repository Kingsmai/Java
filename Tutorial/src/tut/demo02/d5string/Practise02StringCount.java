package tut.demo02.d5string;

import java.util.Scanner;

/*
 * ����¼��һ���ַ���ͳ���ַ����д�Сд��ĸ�������ַ�����
 * ���ࣺ��д��ĸ��Сд��ĸ�����֣���������
 * 
 * ˼·��
 * 1. ��Ȼ�õ��������룬�϶���ҪScanner
 * 2. ������������ַ�����String str = sc.next();
 * 3. �����ĸ��������ֱ���������ַ����Եĳ��ִ���
 * 4. ��Ҫ���ַ���һ����һ���ֽ��м����String -> char[]��toCharArray()
 * 5. ����char[]�ַ����飬�Ե�ǰ�ַ�����������жϣ��������ĸ���������++����
 * 6. ��ӡ����ĸ��������ֱ���������ַ����ִ���
 */
public class Practise02StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String input = sc.next(); // ��ȡ���������һ���ַ���
		int countUpper = 0; // ��д
		int countLower = 0; // Сд
		int countNumber = 0; // ����
		int countOther = 0; // ����
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i]; // ��ǰ�����ַ�
			if (ch >= 'A' && ch <= 'Z' ) {
				countUpper++;
			} else if (ch >= 'a' && ch <= 'z') {
				countLower++;
			} else if (ch >= '0' && ch <= '9') {
				countNumber++;
			} else {
				countOther++;
			}
		}
		System.out.println("��д��ĸ�У�" + countUpper);
		System.out.println("Сд��ĸ�У�" + countLower);
		System.out.println("�����У�" + countNumber);
		System.out.println("���������У�" + countOther);
		sc.close();
	}
}

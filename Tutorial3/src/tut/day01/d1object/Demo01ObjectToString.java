package tut.day01.d1object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import tut.day01.d2api.Person;

/*
 * java.lang.Object��
 * Object �����νṹ�ĸ��ࣨ��㣩��ÿ���඼ʹ��Object��Ϊ���ࣨ���ࣩ��
 * ���ж��󣨰������飩��ʵ�������ķ���
 */
public class Demo01ObjectToString {

	public static void main(String[] args) {
		/*
		 * Person��Ĭ�ϼ̳���Object�࣬���Կ���ʹ��Object���е�toString����
		 * String toString() ���ظö�����ַ�����ʾ
		 */
		Person person = new Person("����", 18);
		String str = person.toString();
		System.out.println(str); // tut.d1api.demo01.object.Person@7d6f77cc
		
		// ֱ�Ӵ�ӡ��������֣���ʵ���ǵ��ö����toString������person����person.toString();
		System.out.println(person); // tut.d1api.demo01.object.Person@7d6f77cc
		
		/*
		 * ��һ�����Ƿ���д��toString������ֱ�Ӵ�ӡ�������ּ���
		 * ���û����дtoString��������ô��ӡ�ľ��ǵ�ֵַ
		 * �����дtoString��������ô������д�ķ�ʽ��ӡ
		 */
		Random rnd = new Random();
		System.out.println(rnd); // java.util.Random@69222c14  û����дtoString����
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc); // java.util.Scanner[delimiters=\p{javaWhitespace}+]...  ��дtoString����
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list); // [1, 2]  ��дtoString����
	}
}

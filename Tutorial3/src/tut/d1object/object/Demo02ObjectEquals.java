package tut.d1object.object;

import java.util.ArrayList;

import tut.d2api.frequent.Person;

/*
 * java.lang.Object��
 * Object �����νṹ�ĸ��ࣨ��㣩��ÿ���඼ʹ��Object��Ϊ���ࣨ���ࣩ��
 * ���ж��󣨰������飩��ʵ�������ķ���
 */
public class Demo02ObjectEquals {

	public static void main(String[] args) {
		/*
		 * Person��Ĭ�ϼ̳���Object�࣬���Կ���ʹ��Object���е�equals����
		 * boolean equals(Object obj) ָʾ����ĳ�������Ƿ���˶�����ȡ�
		 * 
		 * equals����Դ�룺
		 * public boolean equals(Object obj) {
		 *     return (this == obj);
		 * }
		 * ���ͣ�
		 * Object obj ���Դ����κζ���
		 * == �Ƚ�����������ص���һ������ֵ
		 * �����������ͣ��Ƚϵ���ֵ
		 * �����������ͣ��Ƚϵ�����������ĵ�ֵַ
		 * this���ĸ�������õķ����������е�this�����Ǹ�����
		 * person1����equals������this����person1
		 * obj�����ݹ����Ĳ���
		 */
		Person person1 = new Person("����", 18);
		Person person2 = new Person("����", 19);
		System.out.println("person1: " + Integer.toHexString(person1.hashCode())); // ��ӡ�ö����ֵַ
		System.out.println("person2: " + Integer.toHexString(person2.hashCode())); // ��ӡ�ö����ֵַ
		boolean bool = person1.equals(person2); // equalsĬ���ǱȽϵ�ֵַ��this == obj
		// �������ڣ�
		boolean boolHash = (Integer.toHexString(person1.hashCode())) == (Integer.toHexString(person1.hashCode()));
		System.out.println("person1.equals(person2): " + bool); // false����ֵַ��һ����
		System.out.println("��ֵַ�Ƚϣ�" + boolHash);
		System.out.println("=============");
		
		person1 = person2; // ��person2�ĵ�ֵַ��ֵ��person1
		System.out.println("��person2�ĵ�ֵַ��ֵ��person1");
		System.out.println("person1: " + Integer.toHexString(person1.hashCode())); // ��ӡ�ö����ֵַ
		System.out.println("person2: " + Integer.toHexString(person2.hashCode())); // ��ӡ�ö����ֵַ
		bool = person1.equals(person2);
		System.out.println("person1.equals(person2): " + bool); // true
		System.out.println("=============");
		
		// ��дequals����֮�󣬾Ͳ����ǱȽϵ�ֵַ��
		Person person3 = new Person("����", 20);
		Person person4 = new Person("����", 20);
		person4.setName("����");
		System.out.println("person3: " + Integer.toHexString(person3.hashCode())); // ��ӡ�ö����ֵַ
		System.out.println("person4: " + Integer.toHexString(person4.hashCode())); // ��ӡ�ö����ֵַ
		bool = person3.equals(person4); // ��ʱ��equals������д���ǱȽ϶��������
		System.out.println("person3.equals(person4): " + bool); // true
		
		// �ȽϷ�Person�ദ��
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(person4.equals(list)); // false������Person��
	}
}

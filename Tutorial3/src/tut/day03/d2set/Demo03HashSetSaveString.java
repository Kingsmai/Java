package tut.day03.d2set;

import java.util.HashSet;

/*
 * HashSet�洢�Զ�������Ԫ��
 * 
 * Set���ϱ�֤Ԫ��Ψһ��
 *     �洢��Ԫ�أ�String, Integer, ..., Student, Person, ...��������дhashCode������equals����
 *     
 * Ҫ��ͬ����ͬ������ˣ���Ϊͬһ���ˣ�ֻ�ܴ洢һ��
 */
public class Demo03HashSetSaveString {

	public static void main(String[] args) {
		// ����HashSet���ϴ洢Person
		HashSet<Person> set = new HashSet<>();
		Person p1 = new Person("�ﳾ", 21);
		Person p2 = new Person("ľ����", 19);
		Person p3 = new Person("�ﳾ", 21);
		// ��û��дhashCode֮ǰ����ϣֵ��ͬ
		System.out.println(p1.hashCode()); // 2104457164 | 806264
		System.out.println(p2.hashCode()); // 1521118594 | 26310998
		System.out.println(p3.hashCode()); // 1940030785 | 806264
		// ��û��дequals����֮ǰ��ͬ��ͬ���䷵��false���Ƚϵ��ǵ�ֵַ��
		System.out.println(p1==p2); // false | false
		System.out.println(p1==p3); // false | false
		System.out.println(p1.equals(p2)); // false | false
		System.out.println(p1.equals(p3)); // false | true
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println(set); // [Person [name=�ﳾ, age=21], Person [name=ľ����, age=19]]
	}
}

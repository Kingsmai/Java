package tut.demo02.d4arraylist;
/*
 * ����һ�����飬�����洢����Person����
 * 
 * �����и�ȱ�㣺
 * һ�����������������ڼ䳤�Ȳ��ɷ����ı�
 */
public class Demo01Array {
	public static void main(String[] args) {
		// ���ȴ���һ������Ϊ3�����飬�����������Person���͵Ķ���
		Person[] array = new Person[3];
		
		Person one = new Person("����", 18);
		Person two = new Person("����", 28);
		Person three = new Person("����", 38);
		
		// ��one���еĵ�ֵַ��ֵ�������0��Ԯ��λ��
		array[0] = one;
		array[1] = two;
		array[2] = three;
		
		System.out.println(array[0]); // ��ַ
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		Person person = array[1];
		System.out.println(person.getName()); // ����
		System.out.println(array[1].getName()); // ����
	}
}

package tut.d2polymorphism.demo03;

/*
 * ����ת��һ���ǰ�ȫ�ģ�û������ģ���ȷ�ġ�����Ҳ��һ���׶ˣ�
 * ����һ������ת��Ϊ���࣬��ô���޷���������ԭ�����е�����
 * 
 * ����������ö��������ת�͡���ԭ��
 */
public class Demo01Main {

	// ���������ת�;��ǣ���������ָ���������
	public static void main(String[] args) {
		Animal animal = new Cat(); // ����ת��ΪAnimal������������ʱ����һֻè
		animal.eat(); // è����
		
//		animal.catchMouse(); // ����д����
		
		// ����ת�ͣ����С���ԭ������
		Cat cat = (Cat) animal;
		cat.catchMouse(); // èץ����
		
		// �����Ǵ��������ת��
		// ����������ʱ����һֻè�����ڷ�Ҫ������
		// ���󣬵��Ǳ��������ᱨ���������л�����쳣
		// ����java.lang.ClassCastException����ת���쳣
//		Dog dog = (Dog) animal;
	}
}

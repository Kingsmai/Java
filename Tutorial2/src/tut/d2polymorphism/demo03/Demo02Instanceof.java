package tut.d2polymorphism.demo03;

/*
 * ��β���֪��һ���������ö��󣬱�����ʲô���ࣿ
 * ��ʽ��
 * ���� instanceof ������
 * �⽫��õ�һ�� booleanֵ�����Ҳ�����ж�ǰ��Ķ����ܲ��ܵ����������͵�ʵ��
 */
public class Demo02Instanceof {

	public static void main(String[] args) {
		Animal animal = new Cat(); // ������һֻè
		animal.eat(); // è����
		
		// ���ϣ�������������з���������Ҫ����ת��
		// �ж�һ�¸�������animal�����ǲ���Dog
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.watchHouse();
		}
		// �ж�һ�¸�������animal�����ǲ���Cat
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.catchMouse();
		}
		
		giveMeAPet(new Dog());
	}
	
	// ΪʲôҪת��
	public static void giveMeAPet(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.watchHouse();
		}
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.catchMouse();
		}
	}
}

package tut.demo04.d2abstract2;

public class DemoMain {

	public static void main(String[] args) {
//		Animal animal = new Animal(); // ����д��
//		Dog dog = new Dog(); // ����д��
		
		DogPoodle poodle = new DogPoodle(); // ������ͨ�࣬����ֱ��new����
		DogHuskey huskey = new DogHuskey(); // ͬ��
		
		poodle.eat();
		poodle.sleep();
		System.out.println("============");
		huskey.eat();
		huskey.sleep();
	}
}

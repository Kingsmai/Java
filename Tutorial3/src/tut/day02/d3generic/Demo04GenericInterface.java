package tut.day02.d3generic;

/*
 * ���Ժ��з��͵Ľӿ�
 */
public class Demo04GenericInterface {

	public static void main(String[] args) {
		// ����GenericInterfaceImpl1����
		GenericInterface<String> impl1 = new GenericInterfaceImpl1(); // ��̬����෺�ͱ������Ҳ�ʵ����һ�£�
		impl1.method("abc");
		GenericInterfaceImpl1 impl2 = new GenericInterfaceImpl1();
		impl2.method("def");

		// ����GenericInterfaceImpl2����
		GenericInterfaceImpl2<Integer> impl3 = new GenericInterfaceImpl2<>();
		impl3.method(10);
		GenericInterfaceImpl2<Double> impl4 = new GenericInterfaceImpl2<>();
		impl4.method(8.8);
	}
}

package tut.day02.d3generic;

public class Demo02GenericClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// ��д����Ĭ��ΪObject����
		GenericClass gc = new GenericClass();
		gc.setName("������������ʱ����������д��String����ôֻ�����ַ���");
//		String str = gc.getName(); // ȡ��Ҳֻ�����ַ���
		Object obj = gc.getName();
		System.out.println(obj);
		
		// ����GenericClass���󣬷�����Integer����
		GenericClass<Integer> gcInt = new GenericClass<>();
		gcInt.setName(123);
		Integer name = gcInt.getName();
		System.out.println(name); // 123
		int nameInt = gcInt.getName(); // �Զ����� Integer -> int
		System.out.println(nameInt); // 123
		
		// ����GenericClass���󣬷�����String����
		GenericClass<String> gcStr = new GenericClass<>();
		gcStr.setName("С��");
		String nameStr = gcStr.getName();
		System.out.println(nameStr); // С��
	}
}

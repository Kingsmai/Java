package tut.day02.d3generic;

/*
 * ���Ժ��з��͵ķ���
 */
public class Demo03GenericMethod {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// ����GenericMethod����
		GenericMethod gm = new GenericMethod();
		
		/*
		 * ���ú��з��͵ķ���method01
		 * ����ʲô���ͣ����;���ʲô����
		 */
		gm.method01(10); // 10
		gm.method01("abc"); // abc
		gm.method01(8.8); // abc
		gm.method01(true); // abc
		
		gm.method02("��̬���������鴴������ʹ��");
		
		// ��̬������ͨ������.������(����)����ֱ��ʹ��
		GenericMethod.method02("ͨ������.������(����)����ֱ��ʹ��");
		GenericMethod.method02(123); // 123
	}
}

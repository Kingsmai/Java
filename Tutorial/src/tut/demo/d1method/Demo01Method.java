package tut.demo.d1method;
/*
 * Eclipse ������ע�ͱ���ǿ��֢������
 * ������� * �ţ�����
 * �汾�� Eclipse 2020-06
 */
public class Demo01Method {
	public static void main(String[] args) {
		Rect(); // ���÷���
	}
	
	// ������κ���
	private static void Rect() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <20; j++) {
				System.out.print("*"); // ���������
			}
			System.out.println(); // ����
		}		
	}
}

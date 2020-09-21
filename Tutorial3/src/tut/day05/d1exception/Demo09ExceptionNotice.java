package tut.day05.d1exception;

/*
 * ���finally��return��䣬��Զ����finally�������������
 */
public class Demo09ExceptionNotice {

	public static void main(String[] args) {
		int a = getA();
		System.out.println(a); // 100
	}
	
	/*
	 * ����һ�����������ر���a��ֵ
	 */
	@SuppressWarnings("finally")
	public static int getA() {
		int a = 10;
		try {
			return a;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// һ����ִ�еĴ���
			// ��ò�Ҫ��finally��дreturn
			a = 100;
			return a;
		}
	}
}

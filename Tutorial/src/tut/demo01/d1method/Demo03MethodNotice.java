package tut.demo01.d1method;

/*
 * ʹ�÷�����ע�����
 * 1. ����Ӧ�������൱�У����ǲ����ڷ��������ٶ��巽��
 * 2. ���������ǰ��˳������ν
 * 3. ��������󲻻��Զ�ִ�У���Ҫ���ã�
 * 3.1. ��������
 * 3.2. ��ӡ����
 * 3.3. ��ֵ����
 * 4. ��������з���ֵ������д�ϡ�return ����ֵ;��������û��
 * 5. return ��ķ���ֵ���ݣ�����Ͷ��巽��ʱ�ķ���ֵ���Ͷ�Ӧ��
 * 6. void �������ͣ�return ���ܴ������ݣ�ֻ��return;
 * 7. void �����������һ�е�return����ʡ��
 * 8. һ���������п����ж��return��䣬����ͬʱֻ����һ���ܱ�ִ�е�
 */
public class Demo03MethodNotice {
	public static void main(String[] args) {
		method();
		method2();
	}
	private static void method() {
//		return 10; // �����д������������ֵΪ��
		System.out.println("Hello World");
		return; // û�з���ֵ��ִ�з�������
	}
	
	private static void method2() {
		System.out.println("�����޷���ֵ��ʡ��return");
//		return; // ���һ��return����ʡ��
	}
	
	public static int getMax(int a, int b) {
//		int max;
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
		// ����ѡ��һ
		if (a > b) {
			return a; // ֻ��һ��return�ᱻִ�е�
		} else {
			return b;
		}
	}
}

package tut.day05.d3thread.d1mainthread;

/*
 * ���̣߳�ִ������main���������߳�
 * 
 * ���̳߳���Java������ֻ��һ���߳�
 * ִ�д�main������ʼ�����ϵ�������ִ��
 * 
 * JVMִ��main������main��������뵽ջ�ڴ�
 * JVM���Ҳ���ϵͳ����һ��main����ͨ��CPU��ִ��·��
 * CPU�Ϳ���ͨ�����·����ִ��main����
 * �����·���и����֣���main�������߳�
 */
public class Demo01MainThread {

	public static void main(String[] args) {
		Person p1 = new Person("����");
		p1.run();
		
		// ע�⿴���쳣���������߳�����
		System.out.println(0 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		Person p2 = new Person("����");
		p2.run();
	}
}

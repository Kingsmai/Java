package tut.day05.d3thread.d3getname;

/*
 * �̵߳����ƣ�
 *     ���̣߳�main
 *     ���̣߳�Thread-0, Thread-1, Thread-2 ...
 */
public class Demo01GetThreadName {

	public static void main(String[] args) {
		// ����Thread����������
		MyThread mt = new MyThread();
		// ����start�������������̣߳�ִ��run����
		mt.start();
		
		new MyThread().start();
		
		// ��ȡ���߳�����
		System.out.println(Thread.currentThread().getName());
	}
}

package tut.day05.d3thread.d4setname;

public class Demo01SetThreadName {

	public static void main(String[] args) {
		// �������߳�
		MyThread mt = new MyThread();
		mt.setName("�����߳�");
		mt.start();
		
		// �������߳�
		new MyThread("�����߳�").start();
	}
}

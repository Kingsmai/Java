package tut.day05.d3thread.d2thread;

// 1. ����һ��Thread�������
public class MyThread extends Thread {

	// 2. ��Thread�����������дThread���е�run�����������߳����񣨿����߳�Ҫ��ʲô��
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("run ->" + i);
		}
	}
}

package tut.day05.d3thread.d3getname;

/*
 * ��ȡ�̵߳����ƣ�
 *     1. ʹ��Thread���еķ���getName()
 *         String getName() ���ظ��̵߳����ơ�
 *     2. �����Ȼ�ȡ����ǰ����ִ�е��̣߳�ʹ���߳��еķ���getName()��ȡ�̵߳�����
 *         static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳��������
 */
// ����һ��Thread�������
public class MyThread extends Thread {

	// ��дThread���е�run�����������߳�����
	@Override
	public void run() {
		super.run();
		// 1. ��ȡ�߳�����
		String name = getName();
		System.out.println(name);
		
		// 2. ��ȡ��ǰ�̵߳�����
		Thread t = Thread.currentThread();
		System.out.println(t);
		String tname = t.getName();
		System.out.println(tname);
		
		// ��ʽ���
		System.out.println(Thread.currentThread().getName());
	} 
}

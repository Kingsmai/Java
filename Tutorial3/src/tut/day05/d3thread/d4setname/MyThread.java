package tut.day05.d3thread.d4setname;

/*
 * �����̵߳����ƣ����˽⣩
 *     1. ʹ��Thread���еķ���setName(����)
 *         void setName(String name) �����̵߳����Ƹ���Ϊ���ڲ��� name ��
 *     2. ����һ���������Ĺ��췽�������������̵߳����ƣ����ø���Ĵ��ι��췽�������߳����ƴ��ݸ����࣬�ø��ࣨThread�������߳���һ������
 *         Thread(String name) �����µ� Thread����  
 */
public class MyThread extends Thread {
	
	public MyThread() {}
	
	public MyThread(String name) {
		super(name); // ���߳����ƴ��ݸ����࣬�ø��ࣨThread�������߳���һ������
	}

	@Override
	public void run() {
		// ��ȡ�߳�����
		System.out.println(Thread.currentThread().getName());
	}
}

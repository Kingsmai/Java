package tut.day05.d3thread.d2thread;

/*
 * �������̳߳���ĵ�һ�ַ�ʽ������Thread�������
 * java.lang.Thread�ࣺ�������̵߳��࣬������Ҫʵ�ֶ��̳߳��򣬾ͱ���̳�Thread��
 * 
 * ʵ�ֲ��裺
 * 1. ����һ��Thread�������
 * 2. ��Thread�����������дThread���е�run�����������߳����񣨿����߳�Ҫ��ʲô��
 * 3. ����Thread����������
 * 4. ����Thread���еķ���start�����������µ��̣߳�ִ��run����
 * 
 * void start() ���´��߳̿�ʼִ��; Java��������ô��̵߳�run������
 * ����������߳�����ͬʱ���У���ǰ�̣߳�main�̣߳�����һ���̣߳����������̣߳�ִ����run��������
 * һ������һ���߳���Զ�ǲ��Ϸ��ġ� �ر��ǣ��߳�һ�����ִ�оͿ��ܲ�������������
 * 
 * Java����������ռʽ���ȣ��Ǹ��̵߳����ȼ��ߣ��ĸ��߳̾�����ִ�У�ͬһ�����ȼ������ѡ��һ��ִ��
 */
public class Demo01Thread {

	public static void main(String[] args) {
		// 3. ����Thread����������
		MyThread mt = new MyThread();
		// 4. ����Thread���еķ���start�����������µ��̣߳�ִ��run����
		mt.start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("main ->" + i);
		}
	}
}

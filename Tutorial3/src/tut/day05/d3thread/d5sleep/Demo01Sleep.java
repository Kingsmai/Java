package tut.day05.d3thread.d5sleep;

/*
 * static void sleep(long millis) ���µ�ǰ����ִ�е��߳����ߣ���ʱִֹͣ�У�ָ���ĺ�����������ȡ����ϵͳ��ʱ���͵��ȳ���ľ��Ⱥ�׼ȷ�ԡ�
 * ����������֮���̼߳���ִ��
 */
public class Demo01Sleep {

	public static void main(String[] args) {
		// ģ�����
		for(int i = 1; i <= 60; i++) {
			System.out.println(i);
			
			// ʹ��Thread���sleep�����ó���˯��1����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

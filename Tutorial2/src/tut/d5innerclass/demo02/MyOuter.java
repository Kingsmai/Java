package tut.d5innerclass.demo02;

/*
 * �ֲ��ڲ��࣬���ϣ���������ڷ����ľֲ���������ô����ֲ����������ǡ���Чfinal��
 * 
 * ��ע����Java8��ʼ��ֻҪ�ֲ�������ʵ���䣬��ôfinal�ؼ��ʿ���ʡ��
 * 
 * ԭ��
 * 1. new �����Ķ����ڶ��ڴ�ʱ��
 * 2. �ֲ������Ǹ��ŷ����ߵģ���ջ�ڴ浱��
 * 3. �������н���֮�����̳�ջ���ֲ������ͻ�������ʧ
 * 4. ���� new �����Ķ�����ڶѵ��г������ڣ�ֱ������������ʧ
 */
public class MyOuter {

	public void methodOuter() {
		int num = 10; // ���ڷ����ľֲ�����
//		num = 20; // ����д�������ܱ�
		
		@SuppressWarnings("unused")
		class myInner {
			public void methodInner() {
				System.out.println(num);
			}
		}
	}
}

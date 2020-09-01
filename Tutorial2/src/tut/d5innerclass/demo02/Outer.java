package tut.d5innerclass.demo02;

/*
 * ���һ�����Ƕ�����һ�������ڲ��ģ���ô�����һ���ֲ��ڲ���
 * ���ֲ�����ֻ�е�ǰ�����ķ�������ʹ������������������Ͳ�������
 * 
 * �����ʽ��
 * ���η� class �ⲿ������ {
 * 	���η� ����ֵ���� �ⲿ�෽������(�����б�) {
 * 		class �ֲ��ڲ�������{
 * 			// ...
 * 		}
 * 	}
 * }
 * 
 * С��һ�����Ȩ�����η���
 * public > protected > (default) > private
 * ����һ�����ʱ��Ȩ�����η�����
 * 1. �ⲿ�� public / (default)
 * 2. ��Ա�ڲ��� public / protected / (default) / private
 * 3. �ֲ��ڲ��� ʲô������д��Ч���� (default) Ҳ��һ��
 */
public class Outer {

	public void methodOuter() {
		class Inner { // �ֲ��ڲ���
			int num = 10;
			public void methodInner() {
				System.out.println(num);
			}
		}
		
		// ��methodOuter�ڲ�����Inner��
		Inner inner = new Inner();
		// ����Inner���methodInner����
		inner.methodInner();
	}
}

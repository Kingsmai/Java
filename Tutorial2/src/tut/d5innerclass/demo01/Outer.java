package tut.d5innerclass.demo01;

/*
 * �������������������ô��ʽ�ǣ��ⲿ������.this.�ⲿ���Ա������
 */
public class Outer {

	int num = 10; // �ⲿ��ĳ�Ա����
	
	public class Inner /* extends Object */ {
		int num = 20; // �ڲ���ĳ�Ա����
		
		public void methodInner() {
			int num = 30; // �ڲ��෽���ľֲ�����
			System.out.println(num); // 30���ֲ��������ͽ�ԭ��
			System.out.println(this.num); // 20���ڲ���ĳ�Ա����
//			System.out.println(super.num); // ����ģ��ڲ��಻�Ǽ̳й�ϵ
			System.out.println(Outer.this.num); // 10���ⲿ��ĳ�Ա����
		}
	}
}

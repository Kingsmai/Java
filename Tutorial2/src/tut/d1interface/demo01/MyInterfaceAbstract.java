package tut.d1interface.demo01;

/*
 * ���κΰ汾��Java�У��ӿڶ��ܶ�����󷽷�
 * 
 * ��ʽ��
 * public abstract ����ֵ���� ��������(�����б�);
 * 
 * ע�⣺
 * 1. �ӿڵ��еĳ��󷽷������η������ǹ̶��������ؼ��� public abstract
 * 2. �������ؼ������η�������ѡ���Ե�ʡ�ԣ�������ѧ�����Բ��Ƽ���
 * 3. ��������Ҫ�ؿ������ⶨ��
 */
public interface MyInterfaceAbstract {

	// ����һ�����󷽷�
	public abstract void methodAbs1();
	
//	private abstract void methodTwo(); // ����д�������η�������private
	
	// ��Ҳ�ǳ��󷽷�
	abstract void methodAbs2();
	
	// ��Ҳ�ǳ��󷽷�
	public void methodAbs3();
	
	// ��Ҳ�ǳ��󷽷�
	void methodAbs4();
}

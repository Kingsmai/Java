package tut.day05.d1exception;

/*
 * �Ӹ�����쳣��
 *     - ��������׳��˶���쳣��������д���෽��ʱ���׳��͸�����ͬ���쳣ֻ�ܲ��������������׳�
 *     - ���෽��û���׳��쳣��������д����÷���ʱҲ�����׳��쳣����ʱ����������쳣��ֻ�ܲ��������������׳�
 * ע�⣺
 *     �����쳣��ʲô���������쳣��ʲô��
 */
public class Demo10Father {

	public void show01() throws NullPointerException, ClassCastException {}
	
	public void show02() throws IndexOutOfBoundsException {}
	
	public void show03() throws IndexOutOfBoundsException {}
	
	public void show04() {}
}

class Son extends Demo10Father {
	// ������д���෽��ʱ���׳��͸�����ͬ���쳣
	@Override
	public void show01() throws NullPointerException, ClassCastException {}
	
	// ������д���෽��ʱ���׳������쳣�����࣬
	@Override
	public void show02() throws ArrayIndexOutOfBoundsException {}
	
	// ������д���෽��ʱ�����׳��쳣
	@Override
	public void show03() {}
	
	// ����û���׳��쳣��������д���෽��ʱ��Ҳ�����׳��쳣
	@Override
	public void show04() {
		// ��������쳣��ֻ�ܴ������׳�
		try {
			throw new Exception("�������쳣");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

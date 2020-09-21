package tut.day05.d2myexception;

/*
 * �Զ����쳣�ࣺ
 *     Java�ṩ���쳣�࣬��������ʹ�ã���Ҫ�Լ�����һЩ�쳣��
 * ��ʽ��
 *     public class XxxException extends Exception | RuntimeException {
 *         // ���һ���ղ����Ĺ��췽��
 *         // ���һ�����쳣��Ϣ�Ĺ��췽��
 *     }
 * ע�⣺
 *     1. �Զ����쳣��һ�㶼����Exception��β��˵���������쳣��
 *     2. �Զ����쳣�࣬����̳�Exception����RuntimeException
 *         �̳�Exception����ô�Զ�����쳣�����һ���������쳣����������ڲ��׳��˱������쳣���ͱ��봦������쳣��Ҫôthrows��Ҫôtry...catch
 *         �̳�RuntimeException����ô�Զ�����쳣�����һ���������쳣�����账��������������� -> �жϴ���
 */
public class RegisterException extends /*Exception*/ RuntimeException {
	// ���һ���ղ������췽��
	public RegisterException() {
		super();
	}
	
	/*
	 * ���һ�����쳣��Ϣ�Ĺ��췽��
	 * �鿴Դ�뷢�֣����е��쳣�඼����һ�����쳣��Ϣ�Ĺ��췽���������ڲ�����ø�����쳣��Ϣ�Ĺ��췽�����ø�������������쳣��Ϣ
	 */
	public RegisterException(String message) {
		super(message);
	}
}

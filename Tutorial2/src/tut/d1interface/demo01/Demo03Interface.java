package tut.d1interface.demo01;

/*
 * ע���������ͨ���ӿ�ʵ����Ķ��������ýӿڵ��еľ�̬����
 * ��ȷ������ͨ���ӿ����ƣ�ֱ�ӵ������еĽӿڷ���
 * ��ʽ��
 * �ӿ�����.��̬������(����);
 */
public class Demo03Interface {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ������ʵ�������
		MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
		
//		impl.methodStatic(); // ����д��
		
		// ֱ��ͨ���ӿ����Ƶ��þ�̬����������newһ��ʵ��
		MyInterfaceStatic.methodStatic();
	}
}

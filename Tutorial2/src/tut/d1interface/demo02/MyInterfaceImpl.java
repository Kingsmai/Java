package tut.d1interface.demo02;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("������д��A����");
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("������д��B����");
		
	}

	@Override
	public void methodSame() {
		// TODO Auto-generated method stub
		System.out.println("������д��Same������ֻ����дһ��");
		
	}
	
	@Override
	public void methodDefault() {
		// TODO Auto-generated method stub
		System.out.println("�Զ���ӿڵ��г�ͻ��Ĭ�Ϸ��������˸�����д");
	}

}

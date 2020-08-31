package tut.p1usbdemo.demo01;

public class DemoMain {

	public static void main(String[] args) {
		// ����һ���ʼǱ�����
		Computer computer = new Computer();
		computer.powerOn();
		
		// ׼��һ����꣬������ʹ��
//		Mouse mouse = new Mouse();
		// ��������ת��
//		USB usbMouse = mouse;
		USB usbMouse = new Mouse(); // ��̬д��
		// ������USB���ͣ����ݽ�ȥ�ľ���USB���
		computer.useDevice(usbMouse);
		
		// ����һ��USB����
		Keyboard keyboard = new Keyboard(); // û��ʹ�ö�̬д��
		computer.useDevice(keyboard); // ��ȷд��
		
		// ʹ��������� ��������
//		computer.useDevice(new Keyboard()); // ��ȷд��
		
		computer.powerOff();
		System.out.println("==============");
		
		method(10.0); // ��ȷд�� double -> double
		method(20); // ��ȷд�� int -> double
		int a = 30;
		method(a); // ��ȷд�� int -> double
	}
	
	private static void method(double num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
}

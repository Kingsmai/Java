package tut.p1usbdemo.demo01;

public class Computer {

	public void powerOn() {
		System.out.println("�ʼǱ����Կ���");
	}
	
	public void powerOff() {
		System.out.println("�ʼǱ����Թػ�");
	}
	
	// ʹ��USB�豸�ķ�����ʹ�ýӿ���Ϊ����
	public void useDevice(USB usb) {
		usb.open();
		if (usb instanceof Mouse) {
			Mouse mouse = (Mouse) usb; // ����ת��
			mouse.click();
		}
		if (usb instanceof Keyboard) {
			Keyboard keyboard = (Keyboard) usb; // ����ת��
			keyboard.type();
		}
		usb.close();
	}
}

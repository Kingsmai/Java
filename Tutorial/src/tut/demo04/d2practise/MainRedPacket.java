package tut.demo04.d2practise;

import java.util.ArrayList;

public interface MainRedPacket {

	public static void main(String[] args) {
		Manager manager = new Manager("Ⱥ��", 100);
		
		Member one = new Member("��ԱA", 0);
		Member two = new Member("��ԱB", 0);
		Member three = new Member("��ԱC", 0);
		
		manager.show();
		one.show();
		two.show();
		three.show();
		System.out.println("==========================");
		
		// Ⱥ���ܹ���20��Ǯ���ֳ��������
		ArrayList<Integer> list = manager.send(20, 3);
		
		// ������ͨ��Ա�պ��
		one.receive(list);
		two.receive(list);
		three.receive(list);
		
		manager.show(); // 100 - 20 = 80
		// 6��6��8�������
		one.show();
		two.show();
		three.show();
	}
}

package tut.demo04.d2practise;

import java.util.ArrayList;

// Ⱥ����
public class Manager extends User {

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int money) {
		super(name, money);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Integer> send(int totalMoney, int count) {
		// ��Ҫһ�����ϣ������洢���ɸ�����Ľ��
		ArrayList<Integer> packetList = new ArrayList<>();
		
		// ���ȿ�һ��Ⱥ���ж���Ǯ
		int leftMoney = super.getMoney(); // Ⱥ����ǰ���
		if (totalMoney > leftMoney) {
			System.out.println("����");
			return packetList; // ���ؿռ���
		}
		
		// ��Ǯ����ʵ���������������
		super.setMoney(leftMoney - totalMoney);
		
		// �������Ҫƽ����ֳ�Ϊcount��
		int avg = totalMoney / count;
		int mod = totalMoney % count; // ������Ҳ����˦�µ���ͷ
		// ����������ͷ���������һ���������
		// ����Ѻ��һ��һ���ŵ����ϵ���
		for (int i = 0; i < count - 1; i++) {
			packetList.add(avg);
		}
		
		// ���һ�����
		int last = avg + mod;
		packetList.add(last);
		return packetList;
	}
}

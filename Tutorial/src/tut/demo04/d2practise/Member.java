package tut.demo04.d2practise;

import java.util.ArrayList;
import java.util.Random;

// ��ͨ��Ա
public class Member extends User {

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int money) {
		super(name, money);
		// TODO Auto-generated constructor stub
	}
	
	public void receive(ArrayList<Integer> list) {
		// �Ӷ��������У�����ȡһ���������Լ�
		// �����ȡһ�����ϵ��е��������
		int index = new Random().nextInt(list.size());
		// �����������Ӽ��ϵ���ɾ�������ҵõ���ɾ���ĺ�������Լ�
		int delta = list.remove(index);
		// ��ǰ��Ա�Լ������ж���Ǯ
		int money = super.getMoney();
		// �ӷ������������û�ȥ
		super.setMoney(money + delta);
	}
}

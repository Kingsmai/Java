package tut.demo02.d4arraylist;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��һ���󼯺ϴ���20��������֣�Ȼ��ɸѡ���е�ż��Ԫ�أ��ŵ�С���ϵ���
 * Ҫ��ʹ���Զ���ķ���ʵ��ɸѡ
 * 
 * ������
 * 1. ��Ҫ����һ�����ϣ������洢int���֣�<Integer>
 * 2. ���������Random nextInt();
 * 3. ѭ��20�Σ���������ַ���󼯺ϣ�forѭ����add����
 * 4. ����һ����������������ɸѡ
 * ɸѡ�����ݴ󼯺ϣ�ɸѡ����Ҫ���Ԫ�أ��õ�С����
 * ��Ҫ�أ�
 * ����ֵ���ͣ�ArrayListС���ϣ�����Ԫ�ظ�����ȷ����
 * �������ƣ�getSmallList
 * �����б�ArrayList�󼯺ϣ�װ��20���������
 * 5. �жϣ�if����ż�� num % 2 == 0
 * 6. �����ż���ͷŵ�С���ϵ��У����򲻷�
 */
public class Practise04ArrayListReturn {
	public static void main(String[] args) {
		ArrayList<Integer> bigList = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < 20; i++) {
			int num = rnd.nextInt(100) + 1; // 1 ~ 100
			bigList.add(num);
		}
		ArrayList<Integer> smallList = getSmallList(bigList);
		System.out.println("�󼯺�������" + bigList.size());
		System.out.println("�󼯺ϣ�" + bigList);
		System.out.println("ż��������" + smallList.size());
		System.out.println("С���ϣ�" + smallList);
	}
	
	// ������������մ󼯺ϲ���������С����
	public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
		// ����һ��С���ϣ�����װż�����
		ArrayList<Integer> smallList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if (num % 2 == 0) {
				smallList.add(num);
			}
		}
		return smallList;
	}
}

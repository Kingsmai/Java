package tut.demo02.d4arraylist;

import java.util.ArrayList;
import java.util.Random;

/*
 * ����6��1~33֮����������,��ӵ�����,������
 * 
 * ˼·��
 * 1. ��Ҫ�洢6�����֣�����һ�����ϣ�<Integer>
 * 2. �������������ҪRandom
 * 3. ��forѭ��6�Σ�������6�������
 * 4. ѭ���ڵ���rnd.nextInt(int n)��������33��0~32������+1����1~33
 * 5. ��������ӵ������У�add()
 * 6. �������ϣ�forѭ����size(),get()
 */
public class Practise01ArrayListRandom {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < 6; i++) {
			nums.add(rnd.nextInt(33) + 1);
		}
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}
}

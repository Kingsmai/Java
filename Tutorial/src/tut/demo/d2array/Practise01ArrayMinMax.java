package tut.demo.d2array;
/*
 * ��ȡ��ֵ��
 * ˼·��
 * 1. �����������������0�����ϵ�Ԫ��
 * 2. �������飬��ȡ�������е�ÿ��Ԫ�أ�����forѭ������foreach��
 * 3. ����������Ԫ�غͱ����Ԫ�����Ƚ�
 * 4. ����ȽϽ��Ϊ�棬��ô�ͽ���ǰԪ�ظ�ֵ������Ԫ��
 * 5. ���������������Ԫ�ؾ��ǱȽϺ��Ԫ��
 */
public class Practise01ArrayMinMax {
	public static void main(String[] args) {
		int[] nums = {5, 15, -20, 30, 10000, 25};
		int max = nums[0];
		int min = nums[0];
		for (int num : nums) {
			max = num > max ? num : max;
			min = num < min ? num : min;
		}
		System.out.println("���ֵ�ǣ�" + max);
		System.out.println("��Сֵ�ǣ�" + min);
	}
}

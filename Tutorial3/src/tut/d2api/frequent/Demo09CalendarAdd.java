package tut.d2api.frequent;

import java.util.Calendar;

public class Demo09CalendarAdd {

	public static void main(String[] args) {
		// ʹ��getInstance��ȡCalander����
		Calendar calendar = Calendar.getInstance();

		/*
		 * public abstract void add(int field, int amount) ���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ����
		 * ��ָ�����ֶ����ӡ�����ָ����ֵ
		 * ������
		 * int field: ����ָ���������ֶ�(YEAR, MONTH, ...) 
		 * int amount: ���Ӽ���ָ����ֵ������������
		 */
		calendar.add(Calendar.YEAR, 2);
		System.out.println(calendar.get(Calendar.YEAR)); // 20
		calendar.add(Calendar.MONTH, -3); // �������Ǹ����Ļ����ȥ���
		System.out.println(calendar.get(Calendar.MONTH)); // 8
	}
}

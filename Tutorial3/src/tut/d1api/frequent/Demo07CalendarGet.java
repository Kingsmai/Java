package tut.d1api.frequent;

import java.util.Calendar;

public class Demo07CalendarGet {

	public static void main(String[] args) {
		// ʹ��getInstance��ȡCalander����
		Calendar calendar = Calendar.getInstance();
		
		/*
		 * public int get(int field) ���ظ��������ֶε�ֵ
		 * ������
		 * 	int field: ����ָ���������ֶ�(YEAR, MONTH, ...)
		 * ����ֵ�������ֶδ�������ֵ
		 */
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year); // 2020
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month); // 8 (+1 ���£�Java��һ�� = 0)
		int date = calendar.get(Calendar.DATE);
		System.out.println(date); // 3
		int hour = calendar.get(Calendar.HOUR);
		System.out.println(hour); // 1
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println(minute); // 0
		int second = calendar.get(Calendar.SECOND);
		System.out.println(second); // 47
		int ampm = calendar.get(Calendar.AM_PM);
		System.out.println(ampm); // 1 (PM)
	}
}

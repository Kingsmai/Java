package tut.d2api.frequent;

import java.util.Calendar;
import java.util.Date;

public class Demo10CalendarGetTime {

	public static void main(String[] args) {
		// ʹ��getInstance��ȡCalander����
		Calendar calendar = Calendar.getInstance();

		/*
		 * public Date getTime() ����һ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
		 * ����������ת��Ϊ���ڶ���
		 */
		calendar = Calendar.getInstance(); // ��ȡ��ǰ������
		Date time = calendar.getTime();
		System.out.println(time); // Thu Sep 03 13:29:37 SGT 2020
	}
}

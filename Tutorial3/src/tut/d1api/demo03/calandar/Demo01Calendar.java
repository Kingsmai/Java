package tut.d1api.demo03.calandar;

import java.util.Calendar;
import java.util.Date;

/*
 * java.util.Calandar�ࣺ������
 * Calandar���ǳ����࣬�����ṩ�˺ܶ����������ķ�����YEAR, MONTH, DAY_OF_MONTH, HOUR��
 * Calandar���޷�ֱ�Ӵ�������ʹ�ã������һ����̬������getInstance()���÷���������Calandar����������
 * static Calandar getInstance() ʹ��Ĭ��ʱ�������Ի������һ������
 * 
 * ��Ա������
 * 	public int get(int field) ���ظ��������ֶε�ֵ
 * 	public void set(int field, int value) �������������ֶ�����Ϊ����ֵ
 * 	public abstract void add(int field, int amount) ���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ����
 * 	public Date getTime() ����һ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
 * ��Ա����������
 * 	int field ��������ֶΣ�����ʹ��Calendar��ľ�̬��Ա������ȡ
 * 		public static final int YEAR = 1; 	// ��
 * 		public static final int MONTH = 2; 	// ��
 * 		public static final int DATE = 5; 	// ��
 * 		public static final int DAY_OF_MONTH = 5;	// ��
 * 		public static final int HOUR = 10;	// ʱ
 * 		public static final int MINUTE = 12;	// ��
 * 		public static final int SECOND = 13;	// ��
 * 		public static final int AM_PM = 9;	// AM��PM
 */
public class Demo01Calendar {

	public static void main(String[] args) {
		// ʹ��getInstance��ȡCalander����
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
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
		System.out.println("=================");
		
		/*
		 * public void set(int field, int value) �������������ֶ�����Ϊ����ֵ
		 * ������
		 * 	int field: ����ָ���������ֶ�(YEAR, MONTH, ...)
		 * 	int value: ��ָ���ֶ����õ�ֵ
		 */
		calendar.set(Calendar.YEAR, 2018);
		System.out.println(calendar.get(Calendar.YEAR)); // 2018
		calendar.set(Calendar.MONTH, 4);
		System.out.println(calendar.get(Calendar.MONTH)); // 4
		calendar.set(Calendar.DATE, 16);
		System.out.println(calendar.get(Calendar.DATE)); // 16
		System.out.println("=================");
		
		// ͬʱ���������տ���ʹ��set�����ط���
		calendar.set(2077, 10, 19);
		System.out.println(calendar.get(Calendar.YEAR)); // 2077
		System.out.println(calendar.get(Calendar.MONTH)); // 10
		System.out.println(calendar.get(Calendar.DATE)); // 19
		System.out.println("=================");
		
		// ͬʱ����������ʱ�������ʹ��set�����ط���
		calendar.set(2019, 11, 12, 6, 33, 28);
		System.out.println(calendar.get(Calendar.YEAR)); // 2019
		System.out.println(calendar.get(Calendar.MONTH)); // 11
		System.out.println(calendar.get(Calendar.DATE)); // 12
		System.out.println(calendar.get(Calendar.HOUR)); // 6
		System.out.println(calendar.get(Calendar.MINUTE)); // 33
		System.out.println(calendar.get(Calendar.SECOND)); // 28
		System.out.println(calendar.get(Calendar.AM_PM)); // 0 ����
		System.out.println("=================");
		
		/*
		 * public abstract void add(int field, int amount) ���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ����
		 * ��ָ�����ֶ����ӡ�����ָ����ֵ
		 * ������
		 * 	int field: ����ָ���������ֶ�(YEAR, MONTH, ...)
		 * 	int amount: ���Ӽ���ָ����ֵ������������
		 */
		calendar.add(Calendar.YEAR,	2);
		System.out.println(calendar.get(Calendar.YEAR)); // 20
		calendar.add(Calendar.MONTH, -3); // �������Ǹ����Ļ����ȥ���
		System.out.println(calendar.get(Calendar.MONTH)); // 8
		System.out.println("=================");
		
		/*
		 * public Date getTime() ����һ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
		 * ����������ת��Ϊ���ڶ���
		 */
		calendar = Calendar.getInstance(); // ��ȡ��ǰ������
		Date time = calendar.getTime();
		System.out.println(time); // Thu Sep 03 13:29:37 SGT 2020
	}
}

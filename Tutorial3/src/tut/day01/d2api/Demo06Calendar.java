package tut.day01.d2api;

import java.util.Calendar;

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
public class Demo06Calendar {

	public static void main(String[] args) {
		// ʹ��getInstance��ȡCalander����
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	}
}

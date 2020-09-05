package tut.d2api.frequent;

import java.util.Date;

/*
 * java.util.Date����ʾ���ں�ʱ�����
 * Date��ʾ�ض���˲�䣬��ȷ������
 * ���룺ǧ��֮һ�� 1000ms = 1s
 * �ض���˲�䣺һ��ʱ��㣬һɲ��
 * 2077-11-19 09:55:33:246 ˲��
 * 
 * ����ֵ�����ã����Զ�ʱ������ڽ��м���
 * �����ڻ��¼�ת��Ϊ���룬������ϣ��ٰѺ���ת��Ϊʱ��
 * 
 * ������ת��Ϊ���룺
 * 	ʱ��ԭ�� (0ms): 1970��1��1�� 00:00:00 (GMT + 0)
 * ���Ǽ��㵱ǰ���ڵ�ʱ��ԭ��֮��һ�������˶��ٺ���
 * 
 * �й��Ƕ�������GMT +8��:
 * 1970��1��1�� 08:00:00
 * 
 * �Ѻ���ת��Ϊ���ڣ�
 * 1day = 24 * 60 * 60 * 1000 = 86400000ms
 */
public class Demo04Date {

	public static void main(String[] args) {
		// ��ȡ��ǰϵͳʱ�䵽ʱ��ԭ��֮��ĺ���
		System.out.println(System.currentTimeMillis()); // 1599046476688
		
		Date d1 = new Date();
		System.out.println(d1); // Wed Sep 02 19:50:22 SGT 2020
		// SGT ��ʾ���¼��±�׼ʱ��
		// CST ��ʾ������ʱ��
		
		Date d2 = new Date(0L); // ����ֵ��long���ͣ�Ҫ��L
		Date d3 = new Date(1599046476688L);
		System.out.println(d3); // Wed Sep 02 19:34:36 SGT 2020
		System.out.println(d2); // Thu Jan 01 07:30:00 SGT 1970��ʱ��ԭ�㣩
		
		// long getTime() ������ת��Ϊ����ֵ������ڣ�System.currentTimeMillis()����
		Date d4 = new Date();
		System.out.println(d4.getTime()); // 1599048198739
	}
	
}

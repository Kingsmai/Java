package tut.d2api.frequent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.text.DateFormat �����ڡ�ʱ���ʽ������ĳ�����
 * ���ã�
 * 	��ʽ�������� -> �ı������������ı� -> ���ڣ�
 * ��Ա������
 *  String format(Date date) ����ָ���ĸ�ʽ����Date���ڸ�ʽ��Ϊ����ģʽ���ַ���
 *  Date parse(String source) �ѷ���ģʽ���ַ���������ΪDate����
 * DateFormat���Ǹ������࣬�޷�ֱ�Ӵ�������ʹ�ã�������DateFormat�������
 * 
 * java.text.SimpleDateFormat extends DateFormat
 * 
 * ���췽����
 * SimpleDateFormat(String pattern)
 * 	�ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDataFormat
 * ������
 * String pattern������ָ����ģʽ
 * ģʽ�����ִ�Сд
 * y	��
 * M	��
 * d	��
 * H	ʱ
 * m	��
 * s	��
 * д��Ӧ��ģʽ�����ģʽ�滻Ϊ��Ӧ��ʱ��
 * "yyyy-MM-dd HH:mm:ss"
 * ע�⣺ģʽ�е���ĸ�����Ըģ�����ģʽ���ַ����Ը�
 */
public class Demo05DateFormat {

	public static void main(String[] args) throws ParseException {
		/*
		 * ʹ��DateFormat�еķ���format�������ڸ�ʽ��Ϊ�ı�
		 * ʹ�ò��裺
		 * 1. ����SimpleDataFormat���󣬹��췽���д���ָ����ģʽ
		 * 2. ����SimpleDataFormat�����еķ���format�����չ��췽����ָ����ģʽ����Date���ڸ�ʽ��Ϊ����ģʽ���ַ���
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		Date d1 = new Date(); // ������ǰʱ�����
		String format1 = sdf1.format(d1); // ��Date����ת��Ϊ��ʽ���ַ���
		System.out.println(d1); // Thu Sep 03 01:31:37 SGT 2020
		System.out.println(format1); // 2020��09��03�� 01ʱ31��37��
		
		/*
		 * ʹ��DateFormat�еķ���parse�����ı�����Ϊ����
		 * ʹ�ò��裺
		 * 1. ����SimpleDataFormat���󣬹��췽���д���ָ����ģʽ
		 * 2. ����SimpleDataFormat�����еķ���parse���ѷ��Ϲ��췽���е��ַ���������Ϊ����
		 * ע�����
		 * 	public Date parse(String source) throws ParseException
		 * 	parse����������һ���쳣ParseException
		 * 	����ַ����͹��췽���ĸ�ʽ��һ������ô����ͻ��׳��쳣
		 * 	����һ���׳����쳣�ķ������ͱ��봦������쳣
		 * 	Ҫôthrows�����׳�����쳣��Ҫôtry catch�Լ�����
		 */
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		Date d2 = sdf2.parse("2020��09��04�� 11ʱ08��33��");
		System.out.println(d2); // Fri Sep 04 11:08:33 SGT 2020
		d2 = sdf2.parse("2077-11-19 09:55:33"); // ���parse�ĸ�ʽ��ǰ�涨��Ĳ�һ���Ļ�������java.text.ParseException
	}
}

package tut.d2api.frequent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * ʹ��������ص�API�������һ�����Ѿ�����������
 * ������
 * 1. ʹ��Scanner���е�next��������ȡ��������
 * 2. ʹ��DateFormat�е�parse���������ַ�������ΪDate����
 * 3. ��Date��ʽ�ĳ�������ת��Ϊ����ֵ
 * 4. ����ǰ����ת��Ϊ����ֵ
 * 5. ʹ�õ�ǰ���ں���ֵ - �������ں���ֵ
 * 6. �Ѻ���ֵ�Ĳ�ֵת��Ϊ��(ms / 1000 / 60 / 60 / 24)
 */
public class Practise01CalcBirth {

	public static void main(String[] args) throws ParseException {
//		// 1. ʹ��Scanner���е�next��������ȡ��������
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���������ĳ������ڣ���ʽΪ��yyyy-mm-dd");
//		String birthday = sc.next();
//		// 2. ʹ��DateFormat�е�parse���������ַ�������ΪDate����
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//		Date birth = sdf.parse(birthday);
//		// 3. ��Date��ʽ�ĳ�������ת��Ϊ����ֵ
//		long birthTime = birth.getTime();
//		// 4. ����ǰ����ת��Ϊ����ֵ
//		Date today = new Date();
//		long currentTime = today.getTime();
//		// 5. ʹ�õ�ǰ���ں���ֵ - �������ں���ֵ
//		long time = currentTime - birthTime;
//		// 6. �Ѻ���ֵ�Ĳ�ֵת��Ϊ��(ms / 1000 / 60 / 60 / 24)
//		int day = (int) (time / 1000 / 60 / 60 / 24);
//		System.out.println(day);
		
		// �Ż�����
		System.out.println("���������ĳ������ڣ���ʽΪ��yyyy-mm-dd");
		String birthString = new Scanner(System.in).next();
		Date birthDate = new SimpleDateFormat("yyyy-mm-dd").parse(birthString);
		long birthTime = birthDate.getTime();
		long todayTime = new Date().getTime();
		long time = todayTime - birthTime;
		int day = (int) (time / 100 / 60 / 60 / 24);
		System.out.println(day);
	}
}

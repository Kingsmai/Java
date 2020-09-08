package tut.demo02.d4arraylist;

import java.util.ArrayList;
/*
 * ���ϣ���򼯺�ArrayList���д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�İ�װ��
 * 
 * ��������	��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * ��JDK1.5+��ʼ��֧���Զ�װ�䡢�Զ�����
 * 
 * �Զ�װ�䣺�������� -> ��װ���ͣ��������ͣ�
 * �Զ����䣺��װ���� -> ��������
 */
public class Demo04ArrayListBasic {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<>();
//		ArrayList<int> listB = new ArrayList<>(); // ����д��������ֻ�����������ͣ������ǻ�������
		
		ArrayList<Integer> listC = new ArrayList<>();
		listC.add(2);
		listC.add(4);
		listC.add(8);
		System.out.println(listC); // [2, 4, 8]
		
		int num = listC.get(1);
		System.out.println("��һ��Ԫ���ǣ�" + num); // 4
	}
}

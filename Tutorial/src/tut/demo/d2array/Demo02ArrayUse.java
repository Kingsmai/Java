package tut.demo.d2array;
/*
 * ��������Ԫ�صĸ�ʽ��
 * ��������[����ֵ]
 * ����ֵ��int��ֵ���������鵱��Ԫ�صı��
 * �� 0 ��ʼ��һֱ�����鳤�ȵ� -1 Ϊֹ
 * 
 * ʹ�ö�̬��ʼ�������ʱ������Ԫ�ؽ��Զ�ӵ��һ��Ĭ��ֵ��
 * Ĭ��ֵ�������£�
 * byte short int long: 0;
 * double float: 0.0;
 * char: '\u0000'; // Unicode
 * boolean: false;
 *.�������ͣ� null;
 *
 *��̬��ʼ��Ҳ��Ĭ��ֵ�������Զ����ϱ��������ڵ����ݸ�����
 *�������ǲ����ٵģ�����Ĭ��ֵ�����д����ŵ����ݣ�
 */
public class Demo02ArrayUse {
	public static void main(String[] args) {
		// ��̬��ʼ��һ�����飨ʡ�԰棩
		int[] ArrayA = {2, 4, 8};
		// ֱ�Ӵ�ӡ���飬�õ����������Ӧ�ġ��ڴ��ַ��ϣֵ��
		System.out.println(ArrayA); // [I@15db9742 �ڴ��ַ��ϣֵ
		// [ ������������
		// I �������������� Interger
		// 15db9742 ��ʮ�����ƣ��ڴ��ֵַ��
		
		// ���������Ԫ��
		System.out.println(ArrayA[0]); // 2 ��ӡ0�ţ���һ����Ԫ��
		System.out.println(ArrayA[1]); // 4 ��ӡ1�ţ��ڶ�����Ԫ��
		System.out.println(ArrayA[2]); // 8 ��ӡ2�ţ���������Ԫ��
		
		// ʹ��
		int num = ArrayA[1];
		System.out.println(num); // 4
		
		
		
		// ��̬��ʼ��һ������
		int[] ArrayB = new int[3];
		System.out.println(ArrayB); // [I@6d06d69c
		System.out.println(ArrayB[0]); // 0
		System.out.println(ArrayB[1]); // 0
		System.out.println(ArrayB[2]); // 0
//		System.out.println(ArrayB[3]); // �������鳤��Ϊ3���±����ֵӦΪ2
		
		System.out.println("===============");
		ArrayB[1] = 256;
		System.out.println(ArrayB[0]); // 0
		System.out.println(ArrayB[1]); // 256
		System.out.println(ArrayB[2]); // 0
	}
}

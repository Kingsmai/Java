package tut.demo.d1method;
/*
 * ���������ɸ����ܵõ�����
 * 
 * ���������뷽��������
 * ����ֵ������������ֵ
 * 
 * ���巽����ʽ��
 * ���η� ����ֵ���� �������ƣ��������� �������ƣ������� {
 * 	������
 * return;
 * }
 * 
 * ���η����ֽ׶ι̶�д����public static
 * ����ֵ���ͣ�Ҳ���Ƿ������ղ�����return�������ݽ������
 * �������ƣ���������ͱ���һ����С�շ�
 * �������ͣ����뷽����������ʲô����
 * �������ƣ����뷽���ĵ����ݶ�Ӧ�ı�������
 * PS: ��������ж����ʹ�ö��Ž��зָ�
 * �����壺������Ҫ�������飬�����д���
 * return��ֹͣ��ǰ��������������ŵ����ݻ������ô�
 * ����ֵ�����ǰ�涨�巵��ֵ���͵�һ��
 */
public class Demo02MethodDefine {
	public static void main(String[] args) {
		// ��������
		rect(5, 20); // ͨ������û�з���ֵ�ĺ���
		
		// ��ӡ����
		System.out.println(sum(5, 20)); // 25
		
		// ��ֵ����
		int result = sum(5, 20);
		System.out.println(result); // 25
	}
	
	// �޷���ֵ������һ������
	private static void rect(int x, int y) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <y; j++) {
				System.out.print("*"); // ���������
			}
			System.out.println(); // ����
		}	
	}
	
	// �з���ֵ���������������
	private static int sum(int a, int b) {
		int result = a + b;
		return result;
		// ���ߣ�ֱ��return a + b;
	}
}

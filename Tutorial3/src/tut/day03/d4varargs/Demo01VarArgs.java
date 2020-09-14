package tut.day03.d4varargs;

/*
 * �ɱ������JDK 1.5֮����ֵ�������
 * ʹ��ǰ�᣺
 *     �������Ĳ����б�����������Ѿ�ȷ�������ǲ���������ȷ�����Ϳ���ʹ�ÿɱ����
 * ʹ�ø�ʽ�����巽��ʱʹ��
 *     ���η� ����ֵ���� ������(��������... ������) {} // û������...����ʡ�Ժ�
 * �ɱ������ԭ��
 *     �ɱ�����ĵײ����һ�����飬���ݴ��ݲ���������ͬ�����ᴴ����ͬ���ȵ����飬���洢��Щ����
 *     ���ݵĲ���������������0���������ݣ�����
 *     
 * ע�����
 * 1. һ�������Ĳ����б�ֻ����һ���ɱ����
 * 2. ��������Ĳ����ж������ô�ɱ��������д�ڲ����б��ĩβ
 */
public class Demo01VarArgs {

	public static void main(String[] args) {
		int i = add(); // [I@2d363fb3
		System.out.println(i); // 0
		i = add(10);
		System.out.println(i); // 10
		i = add(10, 20);
		System.out.println(i); // 30
		i = add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println(i); // 550
	}
	
	/*
	 * ������㣨0-n�������͵ķ���
	 * ��֪�����������ĺͣ����������Ѿ�ȷ����int����
	 * ���ǲ���������ȷ������֪��Ҫ���㼸�������ĺͣ��Ϳ���ʹ�ÿɱ����
	 * ����add()���ͻᴴ��һ������Ϊ0�����飬new int[0]
	 * ����add(10)���ͻᴴ��һ������Ϊ1�����飬�洢���ݹ����Ĳ�����new int[]{10}
	 * ����add(20)���ͻᴴ��һ������Ϊ2�����飬�洢���ݹ����Ĳ�����new int[]{10, 20}
	 */
	public static int add (int...num) {
		System.out.println(num); // �ײ���һ������
		System.out.println(num.length);
		int sum = 0;
		// ͨ����ǿforѭ��
		for (int i : num) {
			sum += i;
		}
		return sum;
	}
	
	// ����һ����������������int���������ĺ�
//	public static int add (int a, int b, int c) {
//		return a + b + c;
//	}
	
	// ����һ����������������int���������ĺ�
//	public static int add (int a, int b) {
//		return a + b;
//	}
	
	/*
	 * ע�����
	 * 1. һ�������Ĳ����б�ֻ����һ���ɱ����
	 * 2. ��������Ĳ����ж������ô�ɱ��������д�ڲ����б��ĩβ
	 */
//	public static void method(int...a, String...b) {}; // The variable argument type int of the method method must be the last parameter
//	public static void method(int...a, String b, double c) {}; //
	public static void method(String b, double c, int...a) {};
	
	// �ɱ���������⣨�ռ���д����
	public static void function(Object...obj) {}; // ���Խ�����������
}

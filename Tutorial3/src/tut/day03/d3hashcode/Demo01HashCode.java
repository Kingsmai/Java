package tut.day03.d3hashcode;

/*
 * ��ϣֵ����һ��ʮ���Ƶ���������ϵͳ�������������һ������ĵ�ֵַ����һ���߼���ַ����ģ������ĵ�ַ����������ʵ�ʴ洢�������ַ��
 * ��Object����һ�����������Ի�ȡ����Ĺ�ϣֵ
 *     int hashCode() ���ض���Ĺ�ϣ��ֵ��  
 * hashCode������Դ�룺
 *     public native int hashCode();
 *     native������÷������õ��Ǳ��ز���ϵͳ�ķ���
 */
public class Demo01HashCode {

	public static void main(String[] args) {
		// Person��̳���Object�࣬���Կ���ʹ��Object���hashCode����
		Person p1 = new Person();
		int h1 = p1.hashCode();
		System.out.println(h1); // 2104457164 | 1
		
		Person p2 = new Person();
		int h2 = p2.hashCode();
		System.out.println(h2); // 1521118594 | 1
		
		/*
		 * toString������Դ�룺
		 *     public String toString() {
		 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 *     }
		 * ֱ��������������Ƿ��ظö����ϣֵ��ʮ��������ʽ
		 */
		System.out.println(p1); // tut.day03.d3hashcode.Person@7d6f77cc
		System.out.println(p2); // tut.day03.d3hashcode.Person@5aaa6d82
		System.out.println(p1==p2); // ��дhashCode����֮����Ȼ��false
		
		/*
		 * String��Ĺ�ϣֵ
		 * String����д��Object���hashCode����
		 *     public int hashCode() {
		 *         int h = hash;
		 *         if (h == 0 && value.length > 0) {
		 *             hash = h = isLatin1() ? StringLatin1.hashCode(value) : StringUTF16.hashCode(value);
		 *         }
		 *         return h;
		 *     }
		 */
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode()); // 96354
		System.out.println(s2.hashCode()); // 96354
		
		// �������������ɺϣ��ַ�����һ������ϣֵ��һ����
		System.out.println("�ص�".hashCode()); // 1179395
		System.out.println("ͨ��".hashCode()); // 1179395
	}
}

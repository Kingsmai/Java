package tut.demo01.d4objectoriented;
/*
 * private �ؼ���
 * 
 * ��������������person������ageʱ���޷���ֹ���������ֵ�����ý���
 * �����������private�ؼ��ֽ���Ҫ�����ĳ�Ա������������
 * 
 * һ��ʹ��private�������Σ���ô���൱����Ȼ����������ʣ�
 * ���������෶Χ֮��Ͳ����١�ֱ�ӷ��ʡ���
 * 
 * ��ӷ���private��Ա���������Ƕ���һ��Getter/Setter����
 */
public class Person {
	String name;
	private int age;
	
	public void show() {
		System.out.println("�ҽУ�" + name + "�����䣺" + age);
	}
	
	/*
	 * ��ӷ���
	 * �����Ա������ר��������age��������
	 * �����в����޷��أ��������͵ú���Ҫset�����ݱ���һ��
	 * ���ƹ��� set����ĸ���д
	 */
	public void setAge(int num) {
		// �ж��Ƿ�Ϊ������ֵ
		if (num < 100 && num > 0) { // �������
			age = num;			
		} else {
			System.out.println("���ݲ�����");
		}
	}
	
	/*
	 * ����ֵ�����age��Ա����һ��
	 * �����Ա������ר�����ڻ�ȡage������
	 * ����û�в����з���ֵ�� �������͵ú���Ҫget�����ݱ���һ��
	 * ���ƹ��� get����ĸ���д
	 */
	public int getAge() {
		return age;
	}
}

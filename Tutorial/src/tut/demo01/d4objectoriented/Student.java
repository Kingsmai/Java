package tut.demo01.d4objectoriented;
/*
 * ���ڻ������͵��е�Booleanֵ��Getter����һ��Ҫд��isXxx��ʽ����setXxx���򲻱�
 */
public class Student {
	private String name; // ����
	private int age; // ����
	private boolean male; // �ǲ����е�
	
	public void setName(String str) {
		name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int num) {
		age = num;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMale(boolean b) {
		male = b;
	}
	
	public boolean isMale() {
		return male;
	}
}

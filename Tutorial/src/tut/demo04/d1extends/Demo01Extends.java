package tut.demo04.d1extends;

/*
 * �ڼ̳й�ϵ�У����������һ�����ࡱ��Ҳ����˵��������Ա��������࿴��
 * ���磺������Ա���������Ǹ���ʦ����ô����ʦ����һ��Ա��������ϵ��is-a
 * 
 * ���常��ĸ�ʽ��
 * public class �������� {
 * 	// ...
 * }
 * 
 * ��������ĸ�ʽ��
 * public class �������� extends �������� {
 * 	// ...
 * }
 */
public class Demo01Extends {
	public static void main(String[] args) {
		// ����һ���������
		Teacher teacher = new Teacher();
		// ���и�����ĺ���
		// Teacher����ʲô��ûд�����ǻ�̳����Ը���method����
		teacher.method();
		
		Assistance assistance = new Assistance();
		assistance.method();
	}
}

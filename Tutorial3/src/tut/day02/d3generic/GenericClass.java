package tut.day02.d3generic;

/*
 * ����һ�����з��͵��࣬ģ��ArrayList����
 * ������һ��δ֪���������ͣ������ǲ�ȷ��ʹ��ʲô�������͵�ʱ�򣬿���ʹ�÷���
 * ���Ϳ��Խ����������������
 * ���������ʱ��ȷ�����͵���������
 */
public class GenericClass<E> {

	private E name;

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
}

package tut.day02.d3generic;

/*
 * ���з��͵Ľӿڣ��ڶ���ʹ�÷�ʽ���ӿ�ʹ��ʲô���ͣ�ʵ�����ʹ��ʲô���ͣ�����Žӿ���
 * ���൱�ڶ�����һ�����з��͵��࣬���������ʱ��ȷ�����͵�����
 * public interface List<E> {
 *     boolean add(E e);
 *     E get (int Index);
 * }
 * 
 * public class ArrayList<E> implements List<E> {
 *     public boolean add(E e) {}
 *     public E get(int Index) {}
 * }
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {

	@Override
	public void method(I i) {
		System.out.println(i);
	}
}

package tut.day02.d3generic;

/*
 * ���з��͵Ľӿڣ���һ��ʹ�÷�ʽ������ӿڵ�ʵ���࣬ʵ�ֽӿڣ�����ָ���ӿڵķ���
 * public interface Iterator<E> {
 * 	   E next();
 * }
 * Scanner ��ʵ����Iterator�ӿڣ���ָ���ӿڵķ���Ϊ�ַ�����������д��next��������Ĭ�Ͼ����ַ���
 * public final class Scanner implements Iterator<String> {
 * 	   public String next() {}
 * }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {

	@Override
	public void method(String i) {
		System.out.println(i);
	}
}

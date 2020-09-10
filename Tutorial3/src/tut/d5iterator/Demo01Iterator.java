package tut.d5iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * java.util.Iterator�ӿڣ�Ҳ��Ϊ���������Լ��Ͻ��б�����
 * ���÷�����
 * boolean hasNext() ����������и���Ԫ�أ��򷵻� true
 * 	�жϼ����л���û����һ��Ԫ�أ��з���true��û�з���false
 * E next() ���ص����е���һ��Ԫ��
 * 	ȡ�������е���һ��Ԫ��
 * 
 * Iterator��������һ���ӿڣ��޷�ֱ��ʹ�ã���Ҫʹ��Iterator�ӿڵ�ʵ�������
 * ��ȡʵ����ķ�ʽ�Ƚ����⣺Collection�ӿ����и���������iterator()���˷������ص��ǵ�������ʵ�������
 * 	Iterator<E> iterator() ���ش˼�����Ԫ�صĵ�����
 * 
 * ������ʹ�ò��裺
 * 1. ʹ�ü����еķ���iterator()��ȡ��������ʵ�������ʹ��Iterator�ӿڽ��գ���̬��
 * 2. ʹ��Iterator�ӿ��еķ���hasNext()�ж���û����һ��Ԫ��
 * 3. ʹ��Iterator�ӿ��еķ���next()ȡ�������е���һ��Ԫ��
 */
public class Demo01Iterator {

	public static void main(String[] args) {
		// ����һ�����϶���
		Collection<String> coll = new ArrayList<String>();
		// �����������Ԫ��
		coll.add("����");
		coll.add("����");
		coll.add("����");
		coll.add("����");
		
		/*
		 * 1. ʹ�ü����еķ���iterator()��ȡ��������ʵ�������ʹ��Iterator�ӿڽ��գ���̬��
		 * ע�⣺
		 * 	Iterator<E> �ӿ�Ҳ���з��͵ģ��������ķ��͸��ż�����
		 */
		Iterator<String> it = coll.iterator(); // ��̬
		
		// 2. ʹ��Iterator�ӿ��еķ���hasNext()�ж���û����һ��Ԫ��
		System.out.println(it.hasNext()); // true
		
		// 3. ʹ��Iterator�ӿ��еķ���next()ȡ�������е���һ��Ԫ��
		String str = it.next();
		System.out.println(str); // ����
		
		// ��whileѭ����������������е�Ԫ��
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ��������������Ѿ�û��Ԫ����
		System.out.println(it.hasNext()); // false
//		System.out.println(it.next()); // java.util.NoSuchElementException�쳣
		System.out.println("============");
		
		// ��forѭ�����������Ƽ���
		for(Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}
}

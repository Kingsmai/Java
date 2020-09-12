package tut.day02.d1collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java.util.Collection�ӿ�
 * 	���е��м��ϵ����ӿڣ���߶��������е��м��Ϲ��Եķ���
 * 	����ĵ��м��϶�����ʹ��Collection�ӿ��еķ�����
 * 
 * ���Եķ�����
 * public boolean add(E e)`��  �Ѹ����Ķ�����ӵ���ǰ������ ��
 * public void clear()` :��ռ��������е�Ԫ�ء�
 * public boolean remove(E e)`: �Ѹ����Ķ����ڵ�ǰ������ɾ����
 * public boolean contains(E e)`: �жϵ�ǰ�������Ƿ���������Ķ���
 * public boolean isEmpty()`: �жϵ�ǰ�����Ƿ�Ϊ�ա�
 * public int size()`: ���ؼ�����Ԫ�صĸ�����
 * public Object[] toArray()`: �Ѽ����е�Ԫ�أ��洢�������С�
 */
public class Demo01Collection {

	public static void main(String[] args) {
		// �������϶��󣬿���ʹ�ö�̬
		Collection<String> collection = new ArrayList<>();
		System.out.println(collection); // [], toString��������д��
		
		/*
		 * public boolean add(E e)��  �Ѹ����Ķ�����ӵ���ǰ������
		 * ����ֵ�ǲ���ֵ��һ�㶼����true�����Կ��Բ��ý���
		 */
		boolean b1 = collection.add("��һ");
		System.out.println("b1: " + b1); // b1: true
		System.out.println(collection); // [����]
		collection.add("�¶�");
		collection.add("����");
		collection.add("����");
		collection.add("����");
		collection.add("����");
		collection.add("����");
		collection.add("�ܰ�");
		collection.add("���");
		collection.add("֣ʮ");
		System.out.println(collection); // [��һ, �¶�, ����, ����, ����, ����, ����, �ܰ�, ���, ֣ʮ]
		System.out.println("==================");
		
		/*
		 * public boolean remove(E e): �Ѹ����Ķ����ڵ�ǰ������ɾ��
		 * ����ֵ��һ��Booleanֵ��
		 * 	�����д���Ԫ�أ�ɾ��Ԫ�أ�����true��
		 * 	�����в�����Ԫ�أ�ɾ��ʧ�ܣ�����false
		 */
		boolean b2 = collection.remove("����");
		System.out.println("b2: " + b2); // b2: true
		System.out.println(collection); // [��һ, �¶�, ����, ����, ����, ����, �ܰ�, ���, ֣ʮ]
		
		boolean b3 = collection.remove("����"); // û�д�Ԫ��
		System.out.println("b3: " + b3); // b3: false
		System.out.println(collection); // [��һ, �¶�, ����, ����, ����, ����, �ܰ�, ���, ֣ʮ]
		System.out.println("==================");
		
		/*
		 * public boolean contains(E e): �жϵ�ǰ�������Ƿ���������Ķ���
		 * 	��������true
		 * 	����������false
		 */
		boolean b4 = collection.contains("����");
		System.out.println("b4: " + b4); // b4: true
		boolean b5 = collection.contains("����");
		System.out.println("b5: " + b5); // b5: false
		System.out.println("==================");
		
		/*
		 * public boolean isEmpty(): �жϵ�ǰ�����Ƿ�Ϊ��
		 * 	�գ�����true
		 * 	�ǿգ�����false
		 */
		boolean b6 = collection.isEmpty();
		System.out.println("b6: " + b6); // b6: false
		System.out.println("==================");
		
		/*
		 * public int size(): ���ؼ�����Ԫ�صĸ���
		 */
		int size = collection.size();
		System.out.println("size: " + size); // 9
		System.out.println("==================");
		
		/*
		 * public Object[] toArray()`: �Ѽ����е�Ԫ�أ��洢��������
		 */
		Object[] arr = collection.toArray();
		System.out.println(arr); // [Ljava.lang.Object;@2d363fb3
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * public void clear()����ռ��������е�Ԫ�أ����ǲ�ɾ������
		 */
		collection.clear();
		System.out.println(collection); // []
		System.out.println(collection.size()); // 0
		System.out.println(collection.isEmpty()); // true
	}
}

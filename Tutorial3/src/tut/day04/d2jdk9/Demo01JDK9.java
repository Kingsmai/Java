package tut.day04.d2jdk9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * JDK9�����ԣ�
 *     List�ӿڣ�Set�ӿڣ�Map�ӿڣ����������һ����̬����of�����Ը�����һ������Ӷ��Ԫ��
 *     static <E> Set<E> of(E... elements) ���ذ�����������Ԫ�صĲ����޸ļ���
 *     ʹ��ǰ�᣺
 *         �������д洢��Ԫ�ظ����Ѿ�ȷ���ˡ����ٸı�ʱʹ��
 * ע�⣺
 *     1. of����ֻ������List�ӿڣ�Set�ӿڣ�Map�ӿڣ��������ڽӿڵ�ʵ����
 *     2. of��������ֵ��һ�����ܸı�ļ��ϣ����ϲ�����ʹ��add��put�������Ԫ�أ����׳��쳣
 *     3. Set�ӿں�Map�ӿ��ڵ���of������ʱ�򣬲������ظ���Ԫ�أ�������׳��쳣
 *     
 * ���ã�1. ����һ����̬���ϣ���������ĳЩ��ʼ������߰�ȫ��
 */
public class Demo01JDK9 {

	public static void main(String[] args) {
		List<String> list = List.of("a", "b", "a", "c", "d");
		System.out.println(list); // [a, b, a, c, d, a]
//		list.add("w"); // java.lang.UnsupportedOperationException����֧�ֲ����쳣
		
//		Set<String> set = Set.of("a", "b", "a", "c", "d"); // java.lang.IllegalArgumentException���Ƿ������쳣�����ظ���Ԫ��
		Set<String> set = Set.of("a", "b", "c", "d");
		System.out.println(set); // [d, c, b, a]
//		set.add("w"); // java.lang.UnsupportedOperationException����֧�ֲ����쳣
		
//		Map<String, Integer> map = Map.of("����", 18, "����", 19, "����", 20, "����", 21); // java.lang.IllegalArgumentException: duplicate key: ����
		Map<String, Integer> map = Map.of("����", 18, "����", 19, "����", 20);
		System.out.println(map); // {����=19, ����=20, ����=18}
//		map.put("����", 21); // java.lang.UnsupportedOperationException����֧�ֲ����쳣
	}
}

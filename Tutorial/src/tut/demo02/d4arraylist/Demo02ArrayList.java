package tut.demo02.d4arraylist;

import java.util.ArrayList;

/*
 * ����ĳ��Ȳ��ɷ����ı�
 * ����ArrayList���ϵĳ����ǿ�������仯��
 * 
 * ����ArrayList��˵����һ��������<E>������
 * ���ͣ�װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһʲô����
 * ����ֻ�����������ͣ������ǻ�������
 * 
 * ע�����
 * ����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ����������
 * ��������ǿգ��õ�����һ���յ�������[]
 */
public class Demo02ArrayList {
	public static void main(String[] args) {
		// ����һ��ArrayList���ϣ����ϵ�������list������ȫ��String�ַ������͵�����
		// ��ע����JDK1.7 ��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>����ʡ��
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list); // []
		
		// �򼯺ϵ������һЩ���ݣ���Ҫ�õ�add����
		list.add("����");
		System.out.println(list); // [����]
		
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println(list); // [����, ����, ����, ����]
		
//		list.add(100); // ����д������Ϊ������ʱ��<>�Ѿ�������String��������ӽ�ȥ��Ԫ�ر������ַ���
	}
}

package tut.day02.d3generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {

	@SuppressWarnings({ "unchecked", "rawtypes" }) // ���Ծ���
	public static void main(String[] args) {
		/*
		 * �������󼯺ϣ���ʹ�÷���
		 * �ô������ϲ�ʹ�÷��ͣ�Ĭ�����;���Object���ͣ����Դ洢�������͵�����
		 * �׶ˣ�����ȫ���������쳣
		 */
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(123);
		
		// ʹ�õ���������list����
		// ��ȡ������
		Iterator it = list.iterator();
		// ʹ�õ������еķ��� next, hasNext
		while(it.hasNext()) {
			// ��ΪĬ����Object���ͣ�����ȡ����Ҳ��Object����
			Object obj = it.next();
			System.out.println(obj);
			
			// ��Ҫʹ��String�����еķ�����length��ȡ�ַ����ĳ��ȣ�����ʹ�ã���̬ Object = "abc"��
			// ��̬����ʹ���������еķ���
			// ��Ҫ����ת��
			// ���׳�ClassCastException����ת���쳣�����ܰ�Integer����ת��ΪString����
//			String s = (String)obj;
//			System.out.println(s.length());
			/*
			 * ������������Խ�������ǻ���鷳
			 */
			if (obj instanceof String) {
				String s = (String)obj;
				System.out.println("s.length(): " + s.length());
			}
		}
		
		/*
		 * �������󼯺ϣ�ʹ�÷���
		 * �ô���
		 * 1. ����������ת�����鷳���洢����ʲô���ͣ�ȡ���ľ��Ǿ���ʲô����
		 * 2. ���������쳣������������֮��Żᱨ���쳣���������˱����ڣ��ڱ�̹����оͻᱨ��
		 * �׶ˣ�
		 * 1. ������ʲô���ͣ�ֻ�ܴ洢ʲô���͵�����
		 */
		ArrayList<String> strs = new ArrayList<>();
		strs.add("def");
//		strs.add(1); // �������ᱨ��
		
		// ʹ�õ���������strs����
		Iterator<String> strsit = strs.iterator();
		while (strsit.hasNext()) {
			String str = strsit.next();
			System.out.println(str + " -> " + str.length());
		}
	}
}

package tut.d7interface.demo01;

import java.util.ArrayList;
import java.util.List;

/*
 * java.util.list����ArrayList��ʵ�ֵĽӿ�
 * 
 * �ӿ���Ϊ�����Ĳ����򷵻�ֵ
 */
public class DemoInterface {

	public static void main(String[] args) {
		// ����ǽӿ����ƣ��ұ���ʵ�������ƣ���̬д��
		List<String> list = new ArrayList<>();
		
		List<String> result = addnames(list);
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	public static List<String> addnames(List<String> list) {
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		return list;
	}
}

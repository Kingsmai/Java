package tut.day02.d3generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���͵������޶���? extends E  ����ʹ�õķ���ֻ���� E ���͵����� / ����
 * ���͵������޶���? super E    ����ʹ�õķ���ֻ���� E ���͵ĸ��� / ����
 */
public class Demo06Generic {

	public static void main(String[] args) {
		Collection<Integer> list1 = new ArrayList<Integer>();// ����,��Number�Ķ���
	    Collection<String> list2 = new ArrayList<String>(); // �ֵ�
	    Collection<Number> list3 = new ArrayList<Number>(); // �ֵ�
	    Collection<Object> list4 = new ArrayList<Object>(); // ��
	    
	    getElement(list1);
//	    getElement(list2); // ����
	    getElement(list3);
//	    getElement(list4); // ����
	  
//	    getElement2(list1); // ����
//	    getElement2(list2); // ����
	    getElement2(list3);
	    getElement2(list4);
	    
	    /*
	     * ������֮��ļ̳й�ϵ
	     * Integer extends Number extends Object
	     * String extends Object
	     */
	}
	// ���͵����ޣ���ʱ�ķ���?��������Number���ͻ���Number���͵�����
	// ? extends Number,�������Number�༰������,����
	public static void getElement(Collection<? extends Number> coll){}
	// ���͵����ޣ���ʱ�ķ���?��������Number���ͻ���Number���͵ĸ���
	// ? super Number,�������Number�༰�丸��,����
	public static void getElement2(Collection<? super Number> coll){}
}


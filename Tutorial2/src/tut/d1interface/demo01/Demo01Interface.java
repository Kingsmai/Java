package tut.d1interface.demo01;

/*
 * �ӿھ��Ƕ����Ĺ����淶
 * �ӿ���һ��������������
 * �ӿ�����Ҫ�����ݾ������еģ����󷽷�
 * 
 * ����һ���ӿڵĸ�ʽ��
 * public interface �ӿ����� {
 *     // �ӿ�����
 * }
 * 
 * ��ע�� һ���class����֮���׺���� .java -> .class
 * ����interface֮��������ɵ��ֽ����ļ���Ȼ�� .java -> .class
 * 
 * ����� Java7���ӿ��п��԰����������У�
 * 1. ����
 * 2. ���󷽷�
 * ����� Java8�������Զ�������У�
 * 3. Ĭ�Ϸ���
 * 4. ��̬����
 * ����� Java9�������Զ�������У�
 * 5. ˽�з���
 * 
 * �ӿ�ʹ�õĲ��裺
 * 1. �ӿڲ���ֱ��ʹ�ã�������һ����ʵ���ࡱ��ʵ�ָýӿ�
 * ��ʽ��
 * public class ʵ�������� implements �ӿ����� {
 *     // ����
 * }
 * 2. �ӿڵ�ʵ������븲����д�ӿ������еĳ��󷽷�
 * ʵ�֣�ȥ��abstract�ؼ��֣����Ϸ����������
 * 3. ����ʵ����Ķ���
 * 
 * ע�����
 * 1. ���ʵ���ಢû�и�����д�ӿ������еĳ��󷽷�����ô���ʵ�����Լ��ͱ����ǳ�����
 */
public class Demo01Interface {

	public static void main(String[] args) {
		// ����д��������ֱ��
//		MyInterfaceAbstract inter = new MyInterfaceAbstract();
		
		// ����ʵ����Ķ���ʹ��
		MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
		impl.methodAbs1();
		impl.methodAbs2();
		impl.methodAbs3();
		impl.methodAbs4();
	}
}

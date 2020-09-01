package tut.d5innerclass.demo03;

/*
 * ����ӿڵ�ʵ���ࣨ���߸�������ֻࣩ��Ҫʹ��Ψһ��һ�Ρ�
 * ��ô��������£��Ϳ���ʡ�Ե�����Ķ��壬����Ϊʹ�������ڲ���
 * 
 * �����ڲ���Ķ����ʽ��
 * �ӿ����� ������ = new �ӿ�����() {
 * 	// ������д�ӿ������г��󷽷�
 * }
 * 
 * �Ը�ʽ��new �ӿ�����() {...}�����н���:
 * 1. new ����������Ķ���
 * 2. �ӿ����ƾ��������ڲ�������Ҫʵ�ֵ��ĸ��ӿ�
 * 3. {...}����������ڲ��������
 * 
 * ���⻹Ҫע�⼸�����⣺
 * 1. �����ڲ����ڡ��������󡿵�ʱ��ֻ��ʹ��Ψһһ�Σ�
 * ���ϣ����δ������󣬶����������һ���Ļ�����ô�ͱ���ʹ�õ��������ʵ������
 * 2. ���������ڡ����÷�������ʱ��ֻ�ܵ���Ψһһ�Σ�
 * ���ϣ��ͬһ��������ö�η�������ô���������ȡ������
 * 3. �����ڲ�����ʡ���ˡ��ڲ��� / ���ࡿ����������������ʡ���ˡ��������ơ�
 * ǿ���������ڲ��������������һ����
 */
public class DemoMain {

	public static void main(String[] args) {
//		MyInterface impl = new MyInterfaceImpl(); // ��̬
//		impl.methodAbs();
		
//		MyInterface some = new MyInterface(); // ����д��
		
		// ʹ�������ڲ��࣬�������������󣬶������ƾ���objA
		MyInterface objA = new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ���˷�����1-A");
				System.out.println("��Ͳ��ô���MyInterfaceImplʵ������");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ���˷�����2-A");
			}
		};
		objA.methodAbs();
		objA.methodTwo();
		
		MyInterface objB = new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("�ֵ�����дһ�ߣ���������ֻ��ʹ��Ψһһ�Σ���1-B");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ���˷�����2-B");
			}
		};
		objB.methodAbs();
		objB.methodTwo();
		System.out.println("==============");
		
		// ʹ���������ڲ��࣬����ʡ���˶������ƣ�Ҳ����������
		new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("��Ҫ����������methodAbs - 1");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("Ҫ��͵��������methodTwo - 1");
			}
		}.methodAbs();
		// ��Ϊ���������޷����õڶ��η�����������Ҫ�ٴ���һ�������ڲ������������
		new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("��Ҫ����������methodAbs - 2");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("Ҫ��͵��������methodTwo - 2");
			}
		}.methodTwo();
	}
}

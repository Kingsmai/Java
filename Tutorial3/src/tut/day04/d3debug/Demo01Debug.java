package tut.day04.d3debug;

/*
 * Debug���Գ���
 *     �����ô�������ִ�У��鿴����ִ�еĹ��̣����Գ����г��ֵ�bug
 * ʹ�÷�ʽ��
 *     ��eclipse��
 *     ���кŵ��ұ�˫����������������Ӷϵ�
 *     λ�ã�
 *         ��ѧ�ߣ�����ÿ�������ĵ�һ��
 *         ���������Bug��������
 *     �Ҽ����ҵ�Debug As��Java Application�������Ϸ��ҵ�����ͼ��
 *     ����ͻ�ͣ������ӵĵ�һ���ϵ㴦
 * ִ�г���
 *     ��eclipse��
 *     Resume (F8): ������һ���ϵ㣬���û����һ���ϵ㣬�ͽ�������
 *     Suspend: ��ͣ����
 *     Terminate (Ctrl + F2): �˳�Debugģʽ��ֹͣ��������
 *     Step Into (F5): ���뵽������
 *     Step Over (F6): ����ִ�г���
 *     Step Return (F7): ��������
 * Eclipse�ʼǣ����Ͻ��и�ģʽ�л��������л���Debug��ͼ����Java������ͼ
 */
public class Demo01Debug {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
}

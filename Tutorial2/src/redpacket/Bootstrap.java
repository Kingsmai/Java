package redpacket;

/*
 * ����˵����
 * �������ȥ֮�������˶��к�������������֮�����һ�������Ⱥ���Լ�
 * ��������붼���ֳɵģ�����Ҫ���ľ��������
 * 
 * ����ַ����ԣ�
 * 1. ��ͨ�����ƽ������totalMoney / totalCount�������������һ���������
 * 2. ��������������������һ��Ǯ����಻����ƽ������2����Ӧ��Խ��Խ��
 */
public class Bootstrap {
	public static void main(String[] args) {
        Red myRed=new Red("����һ���������");
        //����Ⱥ������
        myRed.setOwnerName("��Ⱥ������");
        //��ͨ���
/*        OpenMode normal=new Normal();
        myRed.setOpenWay(normal);*/
       //�������
        OpenMode lucky=new Lucky();
        myRed.setOpenWay(lucky);
    }
}

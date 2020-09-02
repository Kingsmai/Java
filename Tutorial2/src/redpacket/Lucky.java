package redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {

	@Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        //������� ����1��Ǯ����಻����ʣ�µĽ��ƽ������2��
        //��һ�εĺ����1��(totalMoney/totalCount)*2
        //��Χ��ʽ���ǣ�1+random.nextInt(leftMoney/leftCount*2����
        Random r=new Random();//���������
        int leftMoney=totalMoney;
        int leftCount=totalCount;
        for (int i = 0; i <totalCount-1 ; i++) {
            int money=r.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}

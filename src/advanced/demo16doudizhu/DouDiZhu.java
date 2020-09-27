﻿package advanced.demo16doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * 斗地主综合案列：有序版本
 * 1. 准备?
 * 2. 洗牌
 * 3. 发牌
 * 4. 排序
 * 5. 看牌
 */
public class DouDiZhu {

    public static void main(String[] args) {
        // 1. 准备?
        // 创建一个Map集合，存储牌的索引和组装好的?
        HashMap<Integer, String> poker = new HashMap<>();
        // 创建一个List集合，存储牌的索?
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        // 定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        // 把大王和小王存储到集合中
        // 定义一个牌的索?
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        // 循环嵌套遍历两个集合，组?2张牌，存储到集合?
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
//		System.out.println(poker);
//		System.out.println(pokerIndex);

        /*
         * 2. 洗牌 使用Collections中的方法shuffle(list)
         */
        Collections.shuffle(pokerIndex);
//		System.out.println(pokerIndex);

        /*
         * 3. 发牌
         */
        // 定义4个集合，存储玩家牌的索引，和底牌的索?
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> deck = new ArrayList<>();
        // 遍历索引牌索引的List集合，获取每一个牌的索?
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            // 先判断底?
            if (i >= 51) {
                // 给底牌发?
                deck.add(in);
            } else {
                switch (i % 3) {
                    case 0:
                        player01.add(in);
                        break;
                    case 1:
                        player02.add(in);
                        break;
                    case 2:
                        player03.add(in);
                        break;
                }
            }
        }

        /*
         * 4. 排序
         * 使用Collections中的方法sort(list)
         * 默认是升序排?
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(deck);

        /*
         * 5. 看牌
         */
        lookPoker("刘德华", poker, player01);
        lookPoker("周润发", poker, player02);
        lookPoker("周星驰", poker, player03);
        lookPoker("底牌", poker, deck);

    }

    /*
     * 定义一个看牌的方法，提高代码的复用?
     * 参数?
     *     String name; 玩家名称
     *     HashMap<Integer, String> poker; 存储牌的poker集合
     *     ArrayList<Integer> list; 存储玩家或底牌的list集合
     * 查表发：
     *     遍历玩家获得底牌集合，获取到牌的索引
     *     使用牌的索引，去Map集合中找到对应的?
     */
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        // 输出玩家名称，不换行
        System.out.print(name + ": ");
        // 遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            // 使用牌的索引，去Map集合中，找到对应的牌
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println(); // 打印完每一个玩家的牌，换行
    }
}

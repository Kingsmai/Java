package tut.demo.d2array;

public class Demo04ArrayTwo {
	public static void main(String[] args) {
        int[] arrayA = new int[3]; // ��̬��ʼ��
        System.out.println(arrayA); // ��ֵַ
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("===========");
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); // ��ֵַ
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20

        System.out.println("===========");

        int[] arrayB = new int[3]; // ��̬��ʼ��
        System.out.println(arrayB); // ��ֵַ
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 0
        System.out.println(arrayB[2]); // 0
        System.out.println("===========");
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); // ��ֵַ
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
    }
}

package tut.demo02.d5string;
/*
 * ����һ��������������{1,2,3}����ָ������ʽƴ�ӳ�һ���ַ�������ʽ�������£�[word1#word2#word3]��
 * 
 * ������
 * 1. ����׼��һ��int[]���飬���ݣ�1, 2, 3
 * 2. ����һ���������������������ַ���
 * ��Ҫ��
 * ����ֵ���ͣ�String
 * �������ƣ�fromArrayToString
 * �����б�int[]
 * 3. ��ʽ�� [word1#word2#word3]
 * �õ���for, �ַ���ƴ�ӡ�ÿ������Ԫ��֮ǰ����һ��word�������ָ�ʹ�õ���#�������ǲ������һ��
 * 4. ���÷������õ�����ֵ������ӡ����ַ���
 */
public class Practise01StringCombine {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		String str = fromArrayToString(array);
		System.out.println(str);
	}
	
	public static String fromArrayToString (int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				result += "word" + array[i] + "]";
			} else {
				result += "word" + array[i] + "#";				
			}
		}
		return result;
	}
}

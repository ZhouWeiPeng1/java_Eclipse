package �ַ�������������;

import java.util.Arrays;

/*
 	����
 		��һ���ַ���:��91 27 46 38 50��,д����ʵ��������Ϊ��27 36 46 50 91��
 	˼·:
 		1.����һ���ַ���
 		2.���ַ����е��������ݴ洢��һ��int���͵�������
 			�õ����ַ�����ÿһ���������ݣ�
 				public String[] split(String regex)
 			����һ��int����,��String[]�����е�ÿһ��Ԫ�ش洢��int������
 				public static int parseInt(String s)
 		3.��int�����������
 		4.��������int�����е�Ԫ�ؽ���ƴ�ӵõ�һ���ַ���,����ƴ�Ӳ���StringBuilder��ʵ��
 		5.������
 */
public class IntegerTest {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "91 27 46 38 50";
		
		//���ַ����е��������ݴ洢��һ��int���͵�������
		String[] strArray = s.split(" ");
//		for(int i = 0;i<strArray.length;i++) {
//			System.out.println(strArray[i]);
//		}
		
		//����һ��int����,��String[]�����е�ÿһ��Ԫ�ش洢��int������
		int[] arr = new int[strArray.length];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//��int�����������
		Arrays.sort(arr);
		
		//��������int�����е�Ԫ�ؽ���ƴ�ӵõ�һ���ַ���������ƴ�Ӳ���StringBuilder��ʵ��
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<arr.length;i++) {
			if(i == arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(" ");
			}
		}
		String result = sb.toString();
		
		//������
		System.out.println("result:"+result);
	}
}

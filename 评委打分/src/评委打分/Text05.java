package ��ί���;
import java.util.Scanner;
/*
 		����
 		  �ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100����������
 		  ѡ�������÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ��4����ίƽ��ֵ��������С�����֣���
 		  ˼·��
 		  1.����һ�����飬�ö�̬��ʼ���������Ԫ�صĳ�ʼ��������Ϊ6��
 		  2.����¼����ί������
 		  3.������6����ί��֣����ԣ�������ί�����Ĳ�������ѭ���Ľ���
 		  4.���巽��ʵ�ֻ�ȡ�����е���߷֣��������ֵ�������÷�����
 		  5.���巽��ʵ�ֻ�ȡ�����е���Сֵ��������Сֵ�������÷�����
 		  6.���巽��ʵ�ֻ�ȡ�����е�����Ԫ�صĺͣ�����Ԫ�غͣ������÷�����
 		  7.���ռ��������м���õ�ƽ����
 		  8.���ƽ����
 */
public class Text05 {
		public static void main(String[] args) {
			int[] arr=new int[6];
			Scanner sc=new Scanner(System.in);
			for(int x=0;x<arr.length;x++)
			{
				System.out.println("�������"+(x+1)+"����ί�Ĵ�֣���");
				arr[x]=sc.nextInt();
			}
			sc.close();
			//printArray(arr);
			//���巽��ʵ�ֻ�ȡ�����е���߷֣��������ֵ�������÷���
			int max=getMax(arr);
			//���巽��ʵ�ֻ�ȡ�����е���Сֵ��������Сֵ�������÷���
			int min=getMin(arr);
			int sum=getSum(arr);
			int avg=(sum-max-min)/(arr.length-2);
			System.out.println("ѡ�ֵ����յ÷��ǣ�"+avg);
		}
		//�������
		public static void printArray(int[] arr) {
			System.out.println("[");
			for(int x=0;x<arr.length;x++)
			{
				if(x==arr.length-1) {
					System.out.print(arr[x]);
				}else {
					System.out.print(arr[x]+",");
				}
			}
		}
		//��ȡ�������ֵ
				public static int getMax(int[] arr) {
					int max=arr[0];
					for(int x=1;x<arr.length;x++) {
						if(arr[x]>max) {
							max=arr[x];
						}
					}
					return max;
				}
		//��ȡ������Сֵ
				public static int getMin(int[] arr) {
					int min=arr[0];
					for(int x=1;x<arr.length;x++) {
						if(arr[x]<min) {
							min=arr[x];
						}
					}
					return min;
				}
		//��ȡ����Ԫ��֮��
				public static int getSum(int[] arr) {
					int sum=0;
					for(int x=0;x<arr.length;x++) {
						sum+=arr[x];
					}
					return sum;
				}
}

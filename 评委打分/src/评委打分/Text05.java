package 评委打分;
import java.util.Scanner;
/*
 		需求：
 		  在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整分数。
 		  选手在最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）。
 		  思路：
 		  1.定义一个数组，用动态初始化完成数组元素的初始化，长度为6。
 		  2.键盘录入评委分数。
 		  3.由于是6个评委打分，所以，接受评委分数的操作，用循环改进。
 		  4.定义方法实现获取数组中的最高分（数组最大值），调用方法。
 		  5.定义方法实现获取数组中的最小值（数组最小值），调用方法。
 		  6.定义方法实现获取数组中的所有元素的和（数组元素和），调用方法。
 		  7.按照计算规则进行计算得到平均分
 		  8.输出平均分
 */
public class Text05 {
		public static void main(String[] args) {
			int[] arr=new int[6];
			Scanner sc=new Scanner(System.in);
			for(int x=0;x<arr.length;x++)
			{
				System.out.println("请输入第"+(x+1)+"个评委的打分：》");
				arr[x]=sc.nextInt();
			}
			sc.close();
			//printArray(arr);
			//定义方法实现获取数组中的最高分（数组最大值），调用方法
			int max=getMax(arr);
			//定义方法实现获取数组中的最小值（数组最小值），调用方法
			int min=getMin(arr);
			int sum=getSum(arr);
			int avg=(sum-max-min)/(arr.length-2);
			System.out.println("选手的最终得分是："+avg);
		}
		//数组遍历
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
		//获取数组最大值
				public static int getMax(int[] arr) {
					int max=arr[0];
					for(int x=1;x<arr.length;x++) {
						if(arr[x]>max) {
							max=arr[x];
						}
					}
					return max;
				}
		//获取数组最小值
				public static int getMin(int[] arr) {
					int min=arr[0];
					for(int x=1;x<arr.length;x++) {
						if(arr[x]<min) {
							min=arr[x];
						}
					}
					return min;
				}
		//获取数组元素之和
				public static int getSum(int[] arr) {
					int sum=0;
					for(int x=0;x<arr.length;x++) {
						sum+=arr[x];
					}
					return sum;
				}
}

package 数组;
/*
 	索引越界，访问了数组中不存在的索引对应元素，造成索引越界问题
 	Array IndexOut Of Bounds Exception
 	
 	空指针异常，访问的数组已经不再指向堆内存的数据，造成空指针异常
 	NuLL Pointer Exception
 	null 空值，引用数据类型的默认值，表示不指向任何有效对象
 	数组名.length       获取数组元素个数
 	      
 	      获取最值
 	      思路：
 	      1、定义一个变量，用于保存最大值
 	      2、取数组中的第一个数据作为变量的初始值
 	      3、与数组中剩余的数据逐个比对，每次将比对将最大值保存在变量中
 	      4、循环结束后打印变量值
 */
public class Arr {
	public static void main(String[] args) {
		int[] arr= {10,9,8,7,6,4,5,3,2,1};
		int max=arr[0];
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]>max)
			{
				max=arr[x];
			}
		}
		System.out.println("max="+max);
	}
}

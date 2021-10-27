package 查找;

import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		int x=0;
		int a=0;
		Scanner sc=new Scanner(System.in);
		int[] arr= {19,28,37,46,50};
		System.out.println("请输入你要查找的元素：》");
		int find=sc.nextInt();
		sc.close();
		for(x=0;x<arr.length;x++)
		{
			if(find==arr[x])
			{
				a=1;
				System.out.println("在数组中找到了元素："+find+"在数组中的下标为："+x);
				
			}
		}
		if(a==0)
		{
			System.out.println("数组中找不到此元素");
		}
	}
}

package 反转;
/*
  		数组首尾反转
 */
public class reverse {
	public static void main(String[] args) {
		int[] arr= {19,28,37,46,50};
		System.out.print("反转前的数组：》 ");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		int left=0;//数组首元素下标
		int right=arr.length-1;//数组末尾元素下标
		int tmp=0;
		for(;left<right;left++,right--)//每交换一次left++,right--;一直到left>right||left==right;
		{
		if(left<right)
		   {
			tmp=arr[left];
			arr[left]=arr[right];
			arr[right]=tmp;
		   }	
	    }
		System.out.println(" ");
		System.out.print("反转后的数组：》 ");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}
}

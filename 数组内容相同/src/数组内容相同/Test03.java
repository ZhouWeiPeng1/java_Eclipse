package 数组内容相同;
/*
 		设计一个方法，比较两个数组的内容是否完全相同
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {10,20,30,40,50};
		boolean get=compare(arr1,arr2);
		if(get==false)
		{
			System.out.println("数组内容不相同");
		}
		else
		{
			System.out.println("数组内容完全相同");
		}
	}
	public static boolean compare(int[] arr1,int[] arr2) {
		if(arr1.length!=arr2.length) {
			return false;
		}
		for(int x=0;x<arr1.length;x++) {
			if(arr1[x]!=arr2[x])
			{
				return false;
			}
		}
		return true;
	}
}

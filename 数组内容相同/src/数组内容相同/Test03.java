package ����������ͬ;
/*
 		���һ���������Ƚ���������������Ƿ���ȫ��ͬ
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {10,20,30,40,50};
		boolean get=compare(arr1,arr2);
		if(get==false)
		{
			System.out.println("�������ݲ���ͬ");
		}
		else
		{
			System.out.println("����������ȫ��ͬ");
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

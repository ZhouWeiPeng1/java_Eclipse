package ��ת;
/*
  		������β��ת
 */
public class reverse {
	public static void main(String[] args) {
		int[] arr= {19,28,37,46,50};
		System.out.print("��תǰ�����飺�� ");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		int left=0;//������Ԫ���±�
		int right=arr.length-1;//����ĩβԪ���±�
		int tmp=0;
		for(;left<right;left++,right--)//ÿ����һ��left++,right--;һֱ��left>right||left==right;
		{
		if(left<right)
		   {
			tmp=arr[left];
			arr[left]=arr[right];
			arr[right]=tmp;
		   }	
	    }
		System.out.println(" ");
		System.out.print("��ת������飺�� ");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}
}

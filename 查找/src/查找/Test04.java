package ����;

import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		int x=0;
		int a=0;
		Scanner sc=new Scanner(System.in);
		int[] arr= {19,28,37,46,50};
		System.out.println("��������Ҫ���ҵ�Ԫ�أ���");
		int find=sc.nextInt();
		sc.close();
		for(x=0;x<arr.length;x++)
		{
			if(find==arr[x])
			{
				a=1;
				System.out.println("���������ҵ���Ԫ�أ�"+find+"�������е��±�Ϊ��"+x);
				
			}
		}
		if(a==0)
		{
			System.out.println("�������Ҳ�����Ԫ��");
		}
	}
}

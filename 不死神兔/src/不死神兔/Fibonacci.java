package ��������;
/*
    	����
    		��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ�����3���º�ÿ��������һ�����ӣ��������Ӷ�����
    		���ʵڶ�ʮ���µ����Ӷ���Ϊ���٣�
    		쳲��������У�1 1 2 3 5 8 13 21 34������������
 */


public class Fibonacci {
       public static void main(String[] args) {
    	   int[] arr=new int[20];//����һ������洢����µ����Ӷ���
    	   arr[0]=1;//��һ�ڶ����µ����Ӷ�������֪��Ϊ1
    	   arr[1]=1;
    	   //arr[2]=arr[0]+arr[1]
    	   //arr[3]=arr[1]+arr[2]
    	   for(int x=2;x<arr.length;x++) 
    	   {
    		   arr[x]=arr[x-2]+arr[x-1];
    	   }
    	   System.out.println("�ڶ�ʮ�������ӵĶ����ǣ�"+arr[arr.length-1]);
       }      
}

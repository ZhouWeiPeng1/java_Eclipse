package 不死神兔;
/*
    	需求：
    		有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第3个月后每个月又生一对兔子，假如兔子都不死
    		，问第二十个月的兔子对数为多少？
    		斐波那契数列：1 1 2 3 5 8 13 21 34······
 */


public class Fibonacci {
       public static void main(String[] args) {
    	   int[] arr=new int[20];//定义一个数组存储多个月的兔子对数
    	   arr[0]=1;//第一第二个月的兔子对数是已知的为1
    	   arr[1]=1;
    	   //arr[2]=arr[0]+arr[1]
    	   //arr[3]=arr[1]+arr[2]
    	   for(int x=2;x<arr.length;x++) 
    	   {
    		   arr[x]=arr[x-2]+arr[x-1];
    	   }
    	   System.out.println("第二十个月兔子的对数是："+arr[arr.length-1]);
       }      
}

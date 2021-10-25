package 奇数偶数判断;
import java.util.Scanner;
public class Judge_number {
          public static void main(String[] arges) {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("请输入一个整数:");	  
        	  int number=sc.nextInt();
        	  sc.close();
        	  if(number%2==0) {
        		  System.out.println("输入的数为偶数");
    		  }else {
        		  System.out.println("输入的数为奇数");
    		  }
          }
}

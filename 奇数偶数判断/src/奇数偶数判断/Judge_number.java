package ����ż���ж�;
import java.util.Scanner;
public class Judge_number {
          public static void main(String[] arges) {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("������һ������:");	  
        	  int number=sc.nextInt();
        	  sc.close();
        	  if(number%2==0) {
        		  System.out.println("�������Ϊż��");
    		  }else {
        		  System.out.println("�������Ϊ����");
    		  }
          }
}

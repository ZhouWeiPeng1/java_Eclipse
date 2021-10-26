package xxBT;
import java.util.Scanner;
public class AA {
     public static void main(String[] args) {
    	 System.out.println("请输入3个人的身高，用空格隔开:");
    	 Scanner sc=new Scanner(System.in);
    	 int heigh1=sc.nextInt();
    	 int heigh2=sc.nextInt();
    	 int heigh3=sc.nextInt();
    	 sc.close();
    	 int a=heigh1>heigh2?heigh1:heigh2;
    	 int max=heigh3>a?heigh3:a;
    	 System.out.println("max="+max+"cm");
     }
}

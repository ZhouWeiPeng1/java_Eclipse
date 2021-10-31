package ±éÀú×Ö·û´®;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®:");
		String line=sc.nextLine();
		for(int i=0;i<line.length();i++) {
			System.out.println(line.charAt(i));
		}
	}
}

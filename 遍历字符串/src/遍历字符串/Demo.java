package �����ַ���;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String line=sc.nextLine();
		for(int i=0;i<line.length();i++) {
			System.out.println(line.charAt(i));
		}
	}
}

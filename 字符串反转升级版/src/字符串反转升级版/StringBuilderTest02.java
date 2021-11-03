package 字符串反转升级版;
/*
 		需求：
 			定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
 			例如，键盘录入abc，输出结果cba
 		思路：
 		1.在键盘录入一个字符串，用Scanner实现
 		2.定义一个方法，实现字符串反转。返回值类型String，参数String s
 		3.在方法中用StringBuilder实现字符串的反转，并把结果转换成String类型返回
 		4.调用方法，用一个变量接收结果
 		5.输出结果
 */
import java.util.Scanner;
public class StringBuilderTest02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line=sc.nextLine();
		String s=myReverse(line);
		System.out.println("s:"+s);
	}
	public static String myReverse(String s) {
//		StringBuilder sb=new StringBuilder(s);
//		sb.reverse();
//		String ss=sb.toString();
//		return ss;
		return new StringBuilder(s).reverse().toString();
	}
}

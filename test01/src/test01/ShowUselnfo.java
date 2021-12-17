package test01;

import java.util.Scanner;
public class ShowUselnfo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name = sc.nextLine();
		System.out.println("请输入你的性别");
		String sex = sc.nextLine();
		System.out.println("请输入你的年龄");
		int age = sc.nextInt();
		System.out.println("姓名： "+name+"\n"+"性别： "+sex+"\n"+"年龄： "+age);
	}
}

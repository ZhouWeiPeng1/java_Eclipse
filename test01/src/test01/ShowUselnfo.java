package test01;

import java.util.Scanner;
public class ShowUselnfo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		String name = sc.nextLine();
		System.out.println("����������Ա�");
		String sex = sc.nextLine();
		System.out.println("�������������");
		int age = sc.nextInt();
		System.out.println("������ "+name+"\n"+"�Ա� "+sex+"\n"+"���䣺 "+age);
	}
}

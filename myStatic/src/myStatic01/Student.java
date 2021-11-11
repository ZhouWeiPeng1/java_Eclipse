package myStatic01;
/*
 	非静态的成员方法：
 		·能访问静态的成员变量
 		·能访问非静态的成员变量
 		·能访问静态的成员方法
 		·能访问非静态的成员方法
 	
 	静态的成员方法:
 		·能访问静态的成员变量
 		·能访问静态的成员方法
 	总结：静态成员方法只能访问静态成员
 */
public class Student {
	//非静态成员变量
	private String name="林青霞";
	//静态成员变量
	private static String university="java大学";
	
	//非静态成员方法
	public void show1() {
		
	}
	
	//非静态成员方法
	public void show2() {
		System.out.println(name);
		System.out.println(university);
		show1();
		show3();
		
	}
	
	//静态成员方法
	public static void show3() {
		
	}
	
	//静态成员方法
	public static void show4() {
//		System.out.println(name);
		System.out.println(university);
//		show1();
		show3();
	}
}

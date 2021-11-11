package myFinal;
/*
 	测试类
 */
/*
 	final关键字是最终的意思，可以修饰成员变量，成员方法，类
 	
 		final修饰的特点：
 			修饰方法：表明该方法为最终方法，不能被重写
 			修饰变量：表明该变量为常量，不能再次赋值
 			修饰类：表明该类为最终类，不能被继承
 		
 		
 	变量是基本类型：final修饰指的是基本类型的数据值不能发生改变
 	变量是引用类型：final修饰指的是引用类型的地址值不能发生改变，但是地址
 	里面的内容是可以发生改变的
 */
public class FinalDemo {
	public static void main(String[] args) {
		//final修饰基本类型变量
		final int age=20;
//		age=100;
		System.out.println(age);
		
		//final修饰引用类型变量
		final Student s=new Student();//s地址不能变，s里的引用内容可以改变
		s.age=100;
		System.out.println(s.age);
		
//		s=new Student();
	}
}

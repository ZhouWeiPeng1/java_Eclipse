package itheima_01;
/*
 	测试类
 */
/*
 	局部内部类：
 		局部内部类是在方法中定义的类，所以外界无法直接使用，需要在方法内部创建
 		对象并使用。
 		该类可以直接访问外部类的成员，也可以访问方法内的局部变量。
 */
public class OuterDemo {
	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		o.method();
		
	}
}

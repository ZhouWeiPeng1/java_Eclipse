package 成员内部类;
/*
 	测试类
 	
 */
/*
 	成员内部类
 	按照内部类在类中定义的位置不同，可以分为如下两种形式
 		·在类的成员位置：成员内部类
 		·在类的局部位置：局部内部类
 		
 	成员内部类，外界如何创建对象使用呢？
 		·格式：外部类名.内部类名 对象名 = 外部类对象。内部类对象;
 		·范例：Outer.Inner oi = new Outer().new Inner();
 */
public class InnerDemo {
	public static void main(String[] args) {
		//创建内部类对象，并调用方法
//		Innter i = new Innter();
		
//		Outer.Inner oi = new Outer().new Inner();
//		oi.show();
		
		
		Outer o = new Outer();
		o.method();
		
	}
}

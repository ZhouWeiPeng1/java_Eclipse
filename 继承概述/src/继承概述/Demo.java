package 继承概述;
/*
 	测试类
 */
/*
 	继承格式：
 		格式：public class 子类名 extends 父类名{}
 		范例：public calss Zi  extends Fu{}
 		Fu:是父类，也被称为基类、超类
 		Zi:是子类，也是被称为派生类
 		
 		继承子类中的特点:
 			子类可以有父类的内容
 			子类还可以有自己特有的内容
 		
 		继承好处:
 		    提高了代码的复用性(多个类相同的成员可以放到同一个类中)
 		    提高了代码的维护性(如果方法的代码需要修改，修改一处即可)
 		    
 		继承弊端:
 		  继承可以让类与类之间产生了关系，类的耦合性增强了，当父类发生变化时子类实现也
 		  不得不跟着变化，削弱了子类的独立性
 		  
 		什么时候使用继承?
 			继承体现的关系： is a
 			假设法:我有两个类A和B，如果他们满足A是B的一种，或者B是A的一种，就说明他
 			们存在继承关系，这个时候就可以考虑使用继承来体现，否则就不能滥用继承
 		举例：苹果和水果、猫和动物······
 		
 		在子类方法中访问一个变量
 			子类局部范围找
 			子类成员范围找
 			父类成员范围找
 			如果都没有就报错（不考虑父亲的父亲······）
 */
public class Demo {
	public static void main(String[] args) {
		//创建对象，调用方法
		Fu f=new Fu();
		f.show();
		
		Zi z=new Zi();
		z.method();
		z.show();
	}
}

package myextends01;
/*
 * 测试类
 */
/*
 	方法重写
 		子类中出现了和父类中一模一样的方法声明
 		
 	方法重写
 	 	当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中
 	 	的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容
 	 	
 	 @Override
 	 	是一个注解(注解后面会学习)
 	 	可以帮助我们检查重写方法的方法声明的正确性
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p=new Phone();
		p.call("林青霞");
		 System.out.println("-----------");
		 
		 NewPhone np=new NewPhone();
		 np.call("林青霞");
	}
}

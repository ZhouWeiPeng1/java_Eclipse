package 多态中成员访问特点;
/*
 		测试类
 */
/*
 	多态中成员访问特点：
 		成员变量：编译看父类(左边)，执行也看父类(左边)
 		成员方法：编译看父类(左边)，执行看子类(右边)
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//有父类引用指向子类对象
		Animal a=new Cat();
		System.out.println(a.age);
//		  System.out.println(a.weight);
		
		a.eat();
//		a.playgame();
	}
}

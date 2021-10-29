package 封装;
/*
 		1.封装概述：
 		是面向对象三大特征之一（封装，继承，多态）
 		是面向对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界无法直接操作
 		
 		2.封装的原则：
 		将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的
 		操作和访问成员变量private,提供对应的getXxx()/setXxx()方法
 		
 		3.封装的好处：
 		通过方法来控制成员变量的操作，提高了代码的安全性
 		把代码用方法进行封装，提高了代码的复用性
 */
public class Text09 {
		String name;
		private int age;
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void show() {
			System.out.println(name+"---"+age);
		}
}

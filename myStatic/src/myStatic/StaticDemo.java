package myStatic;
/*
 	static
 		static关键字是静态的意思，可以修饰成员方法，成员变量
 		
 	static修饰的特点
 		被类的所有对象共享
 			这也是我们判断是否使用静态关键字的条件
 		可以通过类名调用
 			当然，也可以通过对象名调用
 */
public class StaticDemo {
	public static void main(String[] args) {
		Student.university="翻斗花园大学";
		
		Student s=new Student();
		s.name="胡图图";
		s.age=8;
//		s.university="翻斗花园大学";
		s.show();
		
		Student s2=new Student();
		s2.name="甘雨";
		s2.age=7;
//		s2.university="翻斗花园大学";
		s2.show();
	}
}

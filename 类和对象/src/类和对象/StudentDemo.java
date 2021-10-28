package 类和对象;
/*
 	  学生测试类
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建第一个对象并使用
		Text06 s=new Text06();
		
		//使用对象
//		System.out.println(s);
//		System.out.println(s.name+","+s.age);
		
		s.name="林青霞";
//		s.age=30;
		s.setAge(30);
//		System.out.println(s.name+","+s.age);
		
//		s.study();
//		s.doHomework();
		//创建第二个对象并使用
		Text06 s2=new Text06();
		s2.name="张曼玉";
//		s2.age=28;
		s2.setAge(28);
//		System.out.println(s2.name+","+s2.age);
//		s2.study();
//		s2.doHomework();
		s.show();
		s2.show();
	}
}

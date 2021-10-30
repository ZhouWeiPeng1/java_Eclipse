package 标准类的制作;
/*
 	1、成员变量：
 		使用private修饰
 	2、构造方法：
 	    1.提供一个无参构造方法
 	    2.提供一个带多个参数的构造方法
 	3、成员方法：
 		1.提供每一个成员变量对应的setXxx()/getXxx()
 		2.提供一个显示对象信息的show()
 	4、创建对象并为其成员变量赋值的两种方式
 		1.无参构造方法创建对象后使用setXxx()赋值
 		2.使用带参构造方法直接创建带有属性值的对象
 */
public class Student {
	//成员变量
		private String name;
		private int age;
	//构造方法
		public Student() {
			
		}
		public Student(String name,int age) {
			this.name=name;
			this.age=age;
		}
		//成员方法
		public  void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		//show()方法
		public void show() {
			System.out.println(name+","+age);
		}
}

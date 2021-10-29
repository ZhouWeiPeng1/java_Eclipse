package this关键字;
/*
 		this修饰的变量用于指代成员变量
 		*方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
 		*方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
 		所以this是用来解决局部变量隐藏成员变量的问题
 */
public class Student {
		private String name;
		private int age;
		
//		public void setName(String n) {
//			name=n;
//		}
		public void setName(String name) {
			this.name=name;//this.name指代成员变量
		}
		public String getName() {
			return name;
		}
//		public void setAge(int a) {
//			age=a;
//		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void show() {
			System.out.println(name+","+age);
		}
}

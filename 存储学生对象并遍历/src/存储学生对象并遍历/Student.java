package 存储学生对象并遍历;
/*
 	学生类
 */
public class Student {
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setNmae(String name) {
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
}

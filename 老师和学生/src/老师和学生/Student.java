package 老师和学生;

public class Student extends Person {
	
	public void study() {
		System.out.println("好好学习，天天向上");
	}
	public Student() {
		
	}
	public Student(String name,int age) {
		super(name,age);
	}
}

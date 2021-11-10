package 老师和学生;

public class Teacher extends Person {
	
	public void teach() {
		System.out.println("用爱成就每一位学员");
	}
	public Teacher() {
		
	}
	public Teacher(String name,int age) {
//		this.name=name;
//		this.age=age;
		super(name,age);
	}
}

package ��ʦ��ѧ��;

public class Teacher extends Person {
	
	public void teach() {
		System.out.println("�ð��ɾ�ÿһλѧԱ");
	}
	public Teacher() {
		
	}
	public Teacher(String name,int age) {
//		this.name=name;
//		this.age=age;
		super(name,age);
	}
}

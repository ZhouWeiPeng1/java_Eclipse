package ������01;

public abstract class Animal {
	private int age=20;
	private final String city="����";
	
	public Animal() {
		
	}
	
	public Animal(int age) {
		this.age = age;
	}

	public void show() {
		age=40;
		System.out.println(age);
//	    city="�Ϻ�";
		System.out.println(city);
	}
	public abstract void eat();
	
}

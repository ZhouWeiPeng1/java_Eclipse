package cat_and_dog;

public class Cat extends Animal implements Jumpping{
	public Cat() {
		
	}
	public Cat(String name, int age) {
		super(name, age);
		
	}
	
	@Override
	public void eat() {
		System.out.println("è����");
	}
	@Override
	public void jump() {
		System.out.println("è����������");
	}
	
	
}

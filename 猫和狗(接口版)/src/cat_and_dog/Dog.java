package cat_and_dog;

public class Dog extends Animal implements Jumpping{
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	public void jump() {
		System.out.println("狗可以跳高了");
	}
}

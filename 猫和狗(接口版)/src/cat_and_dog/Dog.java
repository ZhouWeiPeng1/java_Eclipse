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
		System.out.println("���Թ�ͷ");
	}
	public void jump() {
		System.out.println("������������");
	}
}

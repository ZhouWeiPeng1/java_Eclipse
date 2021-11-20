package myInterface03;

//抽象运动员类
public abstract class Player extends Person{

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void study();
}

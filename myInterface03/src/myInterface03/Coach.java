package myInterface03;

//³éÏó½ÌÁ·Àà
public abstract class Coach extends Person{
	
	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void teach();
}

package myInterface03;

public class BasketballCoach extends Coach{
	
	public BasketballCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasketballCoach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("篮球教练教如何运球和投篮");
	}
	public void eat() {
		System.out.println("篮球教练吃羊肉，喝羊奶");
	};
}

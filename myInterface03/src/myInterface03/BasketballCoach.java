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
		System.out.println("�����������������Ͷ��");
	}
	public void eat() {
		System.out.println("������������⣬������");
	};
}

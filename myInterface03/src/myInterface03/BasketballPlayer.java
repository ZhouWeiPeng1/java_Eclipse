package myInterface03;

public class BasketballPlayer extends Player{
	
	public BasketballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasketballPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("�����˶�Աѧϰ��������Ͷ��");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�����˶�Ա��ţ�⣬��ţ��");
	}
}

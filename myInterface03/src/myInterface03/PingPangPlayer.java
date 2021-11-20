package myInterface03;

public class PingPangPlayer extends Player implements SpeakEnglish{
	
	public PingPangPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PingPangPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员学习如何发球和接球");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员吃大白菜，喝小米粥");
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员说英语");
	}
}

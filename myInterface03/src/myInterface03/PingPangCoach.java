package myInterface03;

public class PingPangCoach extends Coach implements SpeakEnglish{
	
	public PingPangCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PingPangCoach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球教练教如何发球和接球");
	};
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球教练吃小白菜，喝大米粥");
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球教练说英语");
	}
}

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
		System.out.println("ƹ�����������η���ͽ���");
	};
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ƹ���������С�ײˣ��ȴ�����");
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�������˵Ӣ��");
	}
}

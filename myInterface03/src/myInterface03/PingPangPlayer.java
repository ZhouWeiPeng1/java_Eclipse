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
		System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}
}

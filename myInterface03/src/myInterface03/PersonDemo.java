package myInterface03;
/*
 	������
 */
public class PersonDemo {
	public static void main(String[] args) {
		//��������
		PingPangPlayer ppp=new PingPangPlayer();
		ppp.setName("����");
		ppp.setAge(30);
		System.out.println(ppp.getName()+","+ppp.getAge());
		ppp.eat();
		ppp.study();
		ppp.speak();
		System.out.println("-----------------");
		
		BasketballPlayer bp=new BasketballPlayer("Ҧ��",35);
		System.out.println(bp.getName()+","+bp.getAge());
		bp.eat();
		bp.study();
	}
}

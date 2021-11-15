package myDuoTai02;
/*
 	测试类
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//创建猫类对象进行测试
		Animal a=new Cat();
		a.setName("加菲");
		a.setAge(6);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		a=new Cat("加菲",6);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		//创建狗类对象进行测试
		Animal d=new Dog();
		d.setName("史迪仔");
		d.setAge(8);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
		
		a=new Cat("史迪仔",8);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
	}
}

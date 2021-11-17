package myStatic01;
/*
 	测试类
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//创建对象，按照多态的方式
		Animal a=new Cat("加菲猫",8);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("-----------");
		Animal d=new Dog("旺财",6);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
	}
}

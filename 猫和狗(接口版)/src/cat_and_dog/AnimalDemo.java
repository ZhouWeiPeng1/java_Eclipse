package cat_and_dog;
/*
 	测试类
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//创建对象，调用方法
		Jumpping j=new Cat();
		j.jump();
		System.out.println("-----------");
		
		Animal c=new Cat();
		c.setName("加菲");
		c.setAge(5);
		System.out.println(c.getName()+","+c.getAge());
		c.eat();
 		c.jump();
		System.out.println("-----------");
		Cat a=new Cat("啊布",5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		a.jump();
		
		System.out.println("-----------");
		
		Animal d=new Dog("旺财",8);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
		d.jump();
		
	}
}

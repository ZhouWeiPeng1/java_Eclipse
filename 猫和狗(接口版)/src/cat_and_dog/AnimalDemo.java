package cat_and_dog;
/*
 	������
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//�������󣬵��÷���
		Jumpping j=new Cat();
		j.jump();
		System.out.println("-----------");
		
		Animal c=new Cat();
		c.setName("�ӷ�");
		c.setAge(5);
		System.out.println(c.getName()+","+c.getAge());
		c.eat();
 		c.jump();
		System.out.println("-----------");
		Cat a=new Cat("����",5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		a.jump();
		
		System.out.println("-----------");
		
		Animal d=new Dog("����",8);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
		d.jump();
		
	}
}

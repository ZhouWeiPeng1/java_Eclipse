package myStatic01;
/*
 	������
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//�������󣬰��ն�̬�ķ�ʽ
		Animal a=new Cat("�ӷ�è",8);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("-----------");
		Animal d=new Dog("����",6);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
	}
}

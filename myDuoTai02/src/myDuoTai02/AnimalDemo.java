package myDuoTai02;
/*
 	������
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//����è�������в���
		Animal a=new Cat();
		a.setName("�ӷ�");
		a.setAge(6);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		a=new Cat("�ӷ�",6);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		//�������������в���
		Animal d=new Dog();
		d.setName("ʷ����");
		d.setAge(8);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
		
		a=new Cat("ʷ����",8);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
	}
}

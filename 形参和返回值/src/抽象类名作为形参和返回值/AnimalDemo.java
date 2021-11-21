package 抽象类名作为形参和返回值;
/*
	测试类
 */
/*
 	1.2抽象类名作为形参和返回值
 		·方法的形参是抽象类名，其实需要的是该抽象类的子类对象
 		·方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
 */
public class AnimalDemo {

	public static void main(String[] args) {
		//创建操作类对象，并调用方法
		AnimalOperator ao=new AnimalOperator();
		Animal a=new Cat();
		ao.useAnimal(a);
		
		Animal a2 = ao.getAnimal();
		a2.eat();
	}
}

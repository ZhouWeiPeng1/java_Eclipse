package 形参和返回值;

/*
 	测试类
 */
/*
 	1.1类名作为形参和返回值
 		·方法的形参是类名，其实是需要的是该类的对象
 		·方法的返回值是类名，其实返回的是该类的对象
 */
public class CatDemo {
	
	public static void main(String[] args) {
		//创建操作类对象，并调用方法
		CatOperator co=new CatOperator();
		Cat c = new Cat();
		co.useCat(c);
		
		Cat c2 = co.getCat();
		c2.eat();
	}
}

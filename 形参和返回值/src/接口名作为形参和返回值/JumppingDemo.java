package 接口名作为形参和返回值;
/*
 	测试类
 */
/*
	1.3接口名作为形参和返回值
		·方法的形参是接口名，其实需要的是该接口的实现类对象
		·方法的返回值是接口名，其实返回的是该类接口的实现类对象
		
 */
public class JumppingDemo {
	public static void main(String[] args) {
		//创建操作类对象，并调用方法
		JumppingOperator jo = new JumppingOperator();
		Jumpping j = new Cat();
		jo.useJumpping(j);
		
		Jumpping j2 = jo.getJumpping();
		j2.jump();
	}
}

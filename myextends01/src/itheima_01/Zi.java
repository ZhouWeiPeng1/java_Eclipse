package itheima_01;
/*
 	方法重写的注意事项：
 		私有方法不能被重写(父类私有成员子类是不能继承的)
 		子类方法访问权限不能更低(public>默认>私有)
 	
 	java中继承的注意事项：
 		java中类只支持单继承，不支持多继承
 		java中类支持多层继承
 		例如public class Granddad{}
 		public class Father extends Granddad{}
 		public class Son extends Father{}
 */
public class Zi extends Fu{
	//父类中的私有方法子类不可能重写
//	@Override
//	private void show() {
//		System.out.println("Zi中show()方法被调用");
//	}
	
//	@Override
//	public void method() {
//		System.out.println("Zi中methond()方法被调用");
//	}
	
	void method() {
		System.out.println("Zi中methond()方法被调用");
	}
}

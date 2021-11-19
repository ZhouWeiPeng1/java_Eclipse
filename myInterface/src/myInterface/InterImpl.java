package myInterface;

//public class InterImpl implements Inter {
public class InterImpl extends Object implements Inter{
	public InterImpl() {
		super();//这个super用的是Object类中的构造方法	
		}
	@Override
	public void method() {
		System.out.println("method");
	}
	public void show() {
		System.out.println("show");
	}
}

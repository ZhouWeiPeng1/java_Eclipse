package myInterface;

//public class InterImpl implements Inter {
public class InterImpl extends Object implements Inter{
	public InterImpl() {
		super();//���super�õ���Object���еĹ��췽��	
		}
	@Override
	public void method() {
		System.out.println("method");
	}
	public void show() {
		System.out.println("show");
	}
}

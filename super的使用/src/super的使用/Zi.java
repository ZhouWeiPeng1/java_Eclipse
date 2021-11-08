package super的使用;

public class Zi extends Fu {
	public int age=30;
	
	public void show() {
		int age=20;
		System.out.println(age);
		//我要访问成员变量age,怎么办呢?
		System.out.println(this.age);
		//我要访问父类的成员变量age,怎么bane呢?
		System.out.println(super.age);
	}
}

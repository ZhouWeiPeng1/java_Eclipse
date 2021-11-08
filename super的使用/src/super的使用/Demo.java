package super的使用;
/*
 	测试类
 */
/*
 	super关键字的用法和this关键字的用法相似
 		this:代表本类对象的引用
 		super:代表父类存储空间的标识(可以理解为父类对象引用)
 		
 	关键字	访问成员变量		访问构造方法		访问成员方法
 	this	this.成员变量		this(...)		this.成员方法
 			访问本类成员变量		访问本类构造方法		访问本类成员方法
 	super	super.成员变量		super(...)		super.成员方法
 			访问父类成员变量		访问父类构造方法		访问父类成员方法
 */
public class Demo {
	public static void main(String[] args) {
		//创建对象，调用方法
		Zi z=new Zi();
		z.show();
	}
}

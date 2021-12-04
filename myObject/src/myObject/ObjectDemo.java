package myObject;

/*
 	Object 是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或间接的继承自该类
 	建议所有子类重写此方法
 	如何重写呢？自动生成即可
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(30);
		System.out.println(s);//myObject.Student@279f2327
		System.out.println(s.toString());//myObject.Student@279f2327
		System.out.println(s.getName()+","+s.getAge());
	}
}

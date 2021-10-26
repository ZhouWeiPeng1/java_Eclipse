package 方法;

/*
 方法(method) 是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集
    注意：
    1、方法必须先创建后才能使用，该过程称为方法定义
    2、方法创建后并不是直接运行的，需要手动使用后才执行，该过程称为方法调用
    3、方法不能嵌套定义
    4、void表示无返回值,可以省略return，也可以单独的书写return,后面不加数据
  格式：
  			public static 返回值类型 方法名（）{
  			    方法体
  			    return 数据;
  			}
  调用格式：
  			方法名（）;
  		带参数的方法定义：
  		格式：
  		         public static 返回值类型  方法名（参数）{......}
  		         public static 返回值类型  方法名(数据类型 变量名,数据类型 变量名){......}
  		         
  		         两个明确：明确返回值类型，明确参数的类型和数量
  		调用:
  		 		方法名（参数）;
  		 		方法名(变量名1/常量值1，变量名2/常量值2)
  		 		
  		 方法重载：方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
  		 *多个方法在同一个类中
  		 *多个方法具有相同的方法名
  		 *多个方法的参数不相同，类型不同或者数量不同
  		 (与返回值无关，在调用的时候，java虚拟机会通过参数的不同来区分同名的方法）
  		 
  		 方法参数传递：对于基本数据类型的参数，形式参数的改变，不影响实际参数的值；
  		                         对于引用类型的参数，形式参数的改变，影响实际参数的值。
 */
public class way {
//	public static void main(String[] args) {
//		//调用方法
//		isEvenNumber();
//	}
//	public static void isEvenNumber() {
//		//定义变量
//		int number=10;
//		
//		//判断该数据是否为偶数
//		if(number%2==0) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//	}
//		public static void main(String[] args) {
//			int a=getMax(10,20);
//			int b=getMax(30,50);
//			System.out.println(a);
//			System.out.println(b);
//		}
//		public static int getMax(int a,int b) {
//			int a=10;
//			int b=20;
//			return a>b?a:b;
//		}
	
	
//	public static void main(String[] args) {
//		boolean flag=isEvenNumber(11);
//		System.out.println(flag);
//	}
//	public static boolean isEvenNumber(int number) {
//		if(number%2==0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	//方法重载
//	public static void main(String[] args) {
//		System.out.println(Sum(10,20));
//		System.out.println(Sum(10.12,20.21));
//		System.out.println(Sum(10,20,30));
//	}
//	public static int Sum(int a,int b) {
//		return a+b;
//	}
//	public static double Sum(double a,double b) {
//		return a+b;
//	}
//	public static int Sum(int a,int b,int c) {
//		return a+b+c;
//	}
	//使用方法重载，设计比较两个整数是否相同，兼容全类型（byte,short,int,long)
//	public static void main(String[] args) {
//		System.out.println(compare(10,20));
//		System.out.println(compare((byte)10,(byte)20));
//		System.out.println(compare((short)10,(short)20));
//		System.out.println(compare((long)10,(long)20));
//	}
//	public static boolean compare(int a,int b) {
//		System.out.println("int");
//		return a==b;
//	}
//	public static boolean compare(long a,long b) {
//		System.out.println("long");
//		return a==b;
//	}
//	public static boolean compare(byte a,byte b) {
//		System.out.println("byte");
//		return a==b;
//	}
//	public static boolean compare(short a,short b) {
//		System.out.println("short");
//		return a==b;
//	}
	 //方法参数的传递（引用类型）
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		System.out.println("调用change方法前："+arr[1]);
		change(arr);
		System.out.println("调用change方法后："+arr[1]);
	}
	public static void change(int[] arr) {
		arr[1]=200;
	}
}

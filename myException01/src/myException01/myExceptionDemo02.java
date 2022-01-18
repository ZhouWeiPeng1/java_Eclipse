package myException01;

/*
 	public String getMessage():返回此 throwable 的详细消息字符串
 	public String toString():返回此可抛出的简短描述
 	public void printStackTrance():把异常的错误信息输出在控制台
 */
public class myExceptionDemo02 {
	public static void main(String[] args) {
		System.out.println("开始");
		method();
		System.out.println("结束");
	}
	
	public static void method() {
		try {
			int[] arr = {1,2,3};//new ArrayIndexOutOfBoundsException
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			
			//public String getMessage():返回此 throwable 的详细消息字符串
//			System.out.println(e.getMessage());
			//Index 3 out of bounds for length 3
			
			//public String toString():返回此可抛出的简短描述
//			System.out.println(e.toString());
			
			//public void printStackTrance():把异常的错误信息输出在控制台
			e.printStackTrace();
		}
	}
}

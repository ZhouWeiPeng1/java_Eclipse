package myException01;

/*
 	try{
 			���ܳ����쳣�Ĵ��룻
 	} catch(�쳣���� ������){
 		�쳣�Ĵ������;
 	}
 */
public class myExceptionDemo {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		method();
		System.out.println("����");
	}
	
	public static void method() {
		try {
			int[] arr = {1,2,3};//new ArrayIndexOutOfBoundsException
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("����ʵ���������������");
			e.printStackTrace();
		}
	}
}

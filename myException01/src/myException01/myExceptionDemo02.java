package myException01;

/*
 	public String getMessage():���ش� throwable ����ϸ��Ϣ�ַ���
 	public String toString():���ش˿��׳��ļ������
 	public void printStackTrance():���쳣�Ĵ�����Ϣ����ڿ���̨
 */
public class myExceptionDemo02 {
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
			
			
			//public String getMessage():���ش� throwable ����ϸ��Ϣ�ַ���
//			System.out.println(e.getMessage());
			//Index 3 out of bounds for length 3
			
			//public String toString():���ش˿��׳��ļ������
//			System.out.println(e.toString());
			
			//public void printStackTrance():���쳣�Ĵ�����Ϣ����ڿ���̨
			e.printStackTrace();
		}
	}
}

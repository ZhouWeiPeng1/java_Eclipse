package ����;

/*
 ����(method) �ǽ����ж������ܵĴ������֯��Ϊһ�����壬ʹ��������⹦�ܵĴ��뼯
    ע�⣺
    1�����������ȴ��������ʹ�ã��ù��̳�Ϊ��������
    2�����������󲢲���ֱ�����еģ���Ҫ�ֶ�ʹ�ú��ִ�У��ù��̳�Ϊ��������
    3����������Ƕ�׶���
    4��void��ʾ�޷���ֵ,����ʡ��return��Ҳ���Ե�������дreturn,���治������
  ��ʽ��
  			public static ����ֵ���� ����������{
  			    ������
  			    return ����;
  			}
  ���ø�ʽ��
  			����������;
  		�������ķ������壺
  		��ʽ��
  		         public static ����ֵ����  ��������������{......}
  		         public static ����ֵ����  ������(�������� ������,�������� ������){......}
  		         
  		         ������ȷ����ȷ����ֵ���ͣ���ȷ���������ͺ�����
  		����:
  		 		��������������;
  		 		������(������1/����ֵ1��������2/����ֵ2)
  		 		
  		 �������أ���������ָͬһ�����ж���Ķ������֮��Ĺ�ϵ���������������Ķ�������໥��������
  		 *���������ͬһ������
  		 *�������������ͬ�ķ�����
  		 *��������Ĳ�������ͬ�����Ͳ�ͬ����������ͬ
  		 (�뷵��ֵ�޹أ��ڵ��õ�ʱ��java�������ͨ�������Ĳ�ͬ������ͬ���ķ�����
  		 
  		 �����������ݣ����ڻ����������͵Ĳ�������ʽ�����ĸı䣬��Ӱ��ʵ�ʲ�����ֵ��
  		                         �����������͵Ĳ�������ʽ�����ĸı䣬Ӱ��ʵ�ʲ�����ֵ��
 */
public class way {
//	public static void main(String[] args) {
//		//���÷���
//		isEvenNumber();
//	}
//	public static void isEvenNumber() {
//		//�������
//		int number=10;
//		
//		//�жϸ������Ƿ�Ϊż��
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
	//��������
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
	//ʹ�÷������أ���ƱȽ����������Ƿ���ͬ������ȫ���ͣ�byte,short,int,long)
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
	 //���������Ĵ��ݣ��������ͣ�
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		System.out.println("����change����ǰ��"+arr[1]);
		change(arr);
		System.out.println("����change������"+arr[1]);
	}
	public static void change(int[] arr) {
		arr[1]=200;
	}
}

package myMath;

public class MathDemo {
	public static void main(String[] args) {
		//public static int abs (int a); ���ز����ľ���ֵ
		System.out.println(Math.abs(88));
		System.out.println(Math.abs(-88));
		System.out.println("--------");
		
		//public static double ceil (double a); ���ش��ڻ���ڲ�������Сdoubleֵ,����һ������
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));
		System.out.println("--------");
		
		//public static double floor(double a);����С�ڻ���ڲ��������doubleֵ,����һ������
		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));
		System.out.println("--------");
		
		//public static int round(float a); �����������뷵����ӽ�������int
		System.out.println(Math.round(12.34f));
		System.out.println(Math.round(12.56f));
		System.out.println("--------");
		
		//public static int max(int a,int b);��������intֵ�нϴ�ֵ
		System.out.println(Math.max(66,88));
		System.out.println("--------");
		
		//public static int min(int a, int b);��������intֵ�н�Сֵ
		System.out.println(Math.min(66,88));
		System.out.println("--------");
		
		//public static double pow(double a,double b); ����a��b���ݵ�ֵ
		System.out.println(Math.pow(3.0,2.0));
		System.out.println("--------");
		
		//public static double random();����ֵΪdouble����ֵ��[0.0,1.0)
//		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100)+1);
	}
}

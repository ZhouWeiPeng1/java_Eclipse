package string������ص�;
/*
 		ͨ��new�������ַ�������ÿһ��new��������һ���ڴ�ռ䣬��Ȼ�ڴ���ͬ�����ǵ�ֵַ��ͬ
 		
 		char[] chs={'a','b','c'};
 		String s1=new String(chs);
 		String s2=new String(chs);
 		��������У�JVM�����ȴ���һ���ַ����飬Ȼ��ÿһ��new��ʱ�򶼻���һ���µĵ�ַ��ֻ����s1��
 		s2�ο����ַ�����������ͬ��
 		
 		
 		��""��ʽ�������ַ�����ֻҪ�ַ�������ͬ��˳��ʹ�Сд���������ڳ�������г��ּ��Σ�
 		JVM��ֻ�Ὠ��һ��String����,�����ַ�������ά��
 		
 		String s3="abc";
 		String s4="abc";
 		
 		������Ĵ����У���Ե�һ�д��룬JVM�Ὠ��һ��String��������ַ������У�����s3�ο���
 		�ڶ�������s4ֱ�Ӳο��ַ������е�String����Ҳ����˵���Ǳ�������ͬһ������
 */
public class Demo {
		public static void main(String[] args) {
			//���췽���ķ�ʽ�õ�����
			char[] chs= {'a','b','c'};
			String s1=new String(chs);
			String s2=new String(chs);
			System.out.println(s1==s2);
			//ֱ�Ӹ�ֵ�ķ�ʽ�õ�����
			String s3="abc";
			String s4="abc";
			System.out.println(s3==s4);
			//�Ƚ��ַ��������ַ�Ƿ���ͬ
			System.out.println(s1==s3);
		}
}

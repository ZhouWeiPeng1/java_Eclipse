package �����ַ���;
/*
  	����:
  	����¼��һ���ַ�����ʹ�ó���ʵ���ڿ���̨�������ַ���
  	˼·��
  	1.����¼��һ���ַ�������Scannerʵ��
  	2.�����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ���ַ�
  	    *public char charAit(int index):����ָ����������charֵ���ַ���������Ҳ�Ǵ�0��ʼ��
  	3.�����ַ��������Ҫ�ܹ���ȡ���ַ����ĳ���
  	    *public int length():���ش��ַ����ĳ���
  	    *����ĳ��ȣ�������.length()
  	    *�ַ����ĳ��ȣ��ַ�������.length()
  	4.�����ַ�����ͨ�ø�ʽ
  		for(int i=0;i<s.length();i++){
  			s.charAit(i);//����ָ�����������ַ�ֵ
  		}
 */
import java.util.Scanner;
public class StringText02 {
	public static void main(String[] args) {
		//�Ӽ���¼��һ���ַ�������Scannerʵ��
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������һ���ַ�����");
		String line=sc.nextLine();
		
		//�����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ���ַ�
//		System.out.println(line.charAt(0));
//		System.out.println(line.charAt(1));
//		System.out.println(line.charAt(2));
	
//		for(int i=0;i<3;i++) {
//			System.out.println(line.charAt(i));
//		}
//		System.out.println(line.length());
		for(int i=0;i<line.length();i++) {
			System.out.println(line.charAt(i));
		}
	}
}

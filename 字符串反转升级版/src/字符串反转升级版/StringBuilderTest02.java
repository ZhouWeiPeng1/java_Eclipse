package �ַ�����ת������;
/*
 		����
 			����һ��������ʵ���ַ�����ת������¼��һ���ַ��������ø÷������ڿ���̨������
 			���磬����¼��abc��������cba
 		˼·��
 		1.�ڼ���¼��һ���ַ�������Scannerʵ��
 		2.����һ��������ʵ���ַ�����ת������ֵ����String������String s
 		3.�ڷ�������StringBuilderʵ���ַ����ķ�ת�����ѽ��ת����String���ͷ���
 		4.���÷�������һ���������ս��
 		5.������
 */
import java.util.Scanner;
public class StringBuilderTest02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line=sc.nextLine();
		String s=myReverse(line);
		System.out.println("s:"+s);
	}
	public static String myReverse(String s) {
//		StringBuilder sb=new StringBuilder(s);
//		sb.reverse();
//		String ss=sb.toString();
//		return ss;
		return new StringBuilder(s).reverse().toString();
	}
}

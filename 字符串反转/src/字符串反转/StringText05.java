package �ַ�����ת;
import java.util.Scanner;
public class StringText05 {
			public static void main(String[] args) {
				//�ü���¼��һ���ַ�������Scannerʵ��
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				
				System.out.println("������һ���ַ�����");
				String line=sc.nextLine();
				//���÷�������һ���������ս��
				String s=reverse(line);
				//������
				System.out.println("s:"+s);
			}
		//����һ��������ʵ���ַ�����ת
			public static String reverse(String s) {
				//�ڷ����а��ַ������ű�����Ȼ���ÿһ���õ����ַ�ƴ�ӳ�һ���ַ�����
				String ss="";
				for(int i=s.length()-1;i>=0;i--)
				{
					ss+=s.charAt(i);
				}
				return ss;
			}
}

package �û���¼;

/*
 		����
 		��֪�û��������룬���ó���ʵ��ģ���û���¼���ܹ������λ��ᣬ��¼֮�󣬸�����Ӧ����ʾ
 		˼·��
 		1.��֪�û��������룬���������ַ�����ʾ����
 		2.����¼��Ҫ��¼���û��������룬��Scannerʵ��
 		3.�ü���¼����û������������֪���û�����������бȽϣ�������Ӧ����ʾ��
 		�ַ��������ݱȽϣ���equals()����ʵ��
 		4.��ѭ��ʵ�ֶ�λ��ᣬ����Ĵ�����ȷ������forѭ��ʵ�֣����ڵ�¼�ɹ���ʱ��
 		ʹ��break����ѭ��
 */
import java.util.Scanner;
public class StringText01 {
	public static void main(String[] args) {
		//��֪�û��������룬���������ַ�����ʾ����
		String username="ZHOUWEIPENG";
		String password="12581";
		
		//��ѭ��ʵ�ֶ�λ��ᣬ����Ĵ�����ȷ������forѭ��ʵ�֣����ڵ�¼�ɹ���ʱ��
 		//ʹ��break����ѭ��
 		for(int i=0;i<3;i++) {
 		
		//����¼��Ҫ��¼���û��������룬��Scannerʵ��
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û�����");
		String name=sc.nextLine();
		
		System.out.println("���������룺");
		String pwd=sc.nextLine();
		//�ü���¼����û������������֪���û�����������бȽϣ�������Ӧ����ʾ��
 		//�ַ��������ݱȽϣ���equals()����ʵ��
 		if(name.equals(username)&&pwd.equals(password)) {
 			System.out.println("��¼�ɹ�!");
 			break;
 		}else {
 			if(2-i==0) {
 				System.out.println("����˻����������������Ա��ϵ");
 			}else {
 			System.out.println("��¼ʧ�ܣ��㻹��"+(2-i)+"�λ���");
 			}
 		}		
 	  }
	}
}

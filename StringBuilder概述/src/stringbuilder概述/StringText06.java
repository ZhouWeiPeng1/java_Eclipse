package stringbuilder����;
/*
 		StringBuilder��һ���ɱ���ַ����࣬���ǿ��԰���������һ������
 		����Ŀɱ�ָ����StringBuilder�����е������ǿɱ��
 		
 		String��StringBuilder������
 		 String�������ݲ��ɱ��
 		 StringBuilder�������ǿɱ��
 		 
 		 StringBuilder�Ĺ��췽��
 		 ������ 							˵��
 	public StringBuilder()			����һ���հ׿ɱ��ַ������󣬲������κ�����
 	public StringBuilder(String str) �����ַ��������ݣ��������ɱ��ַ�������
 */
public class StringText06 {
		public static void main(String[] args) {
			//public StringBuilder():����һ���հ׿ɱ��ַ������󣬲������κ�����
			StringBuilder sb=new StringBuilder();
			System.out.println("sb:"+sb);
			System.out.println("sb.length():"+sb.length());
			
			//public StringBuilder(String str):�����ַ��������ݣ��������ɱ��ַ�������
			StringBuilder sb2=new StringBuilder("hello");
			System.out.println("sb2:"+sb2);
			System.out.println("sb2.length():"+sb2.length());
			
		}
}

package stringbuilder����;
/*
 	StringBuilder����Ӻͷ�ת����
 	 public StringBuilder append(��������):������ݣ������ض�����
 	 public StringBuilder reverse():�����෴���ַ�����
 */
public class StringText07 {
		public static void main(String[] args) {
			//��������
			StringBuilder sb=new StringBuilder();
			
			//public StringBuilder append(��������):������ݣ������ض�����
//			StringBuilder sb2=sb.append("hello");
//			
//			System.out.println("sb:"+sb);
//			System.out.println("sb2:"+sb2);
//			System.out.println(sb==sb2);
			
//			sb.append("hello");
//			sb.append("world");
//			sb.append("java");
//			sb.append(100);
			
			//��ʽ���
			sb.append("hello").append("world").append("java").append(100);
			System.out.println("sb:"+sb);
			
			//public StringBuilder reverse():�����෴���ַ�����
			sb.reverse();
			System.out.println("sb:"+sb);
		}
}

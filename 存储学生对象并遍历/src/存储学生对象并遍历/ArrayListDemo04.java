package �洢ѧ�����󲢱���;
/*
 		���󣺴���һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 		˼·��
 			1.����ѧ����
 			2.�������϶���
 			3.����ѧ������
 			4.���ѧ�����󵽼�����
 			5.�������ϣ�����ͨ�ñ�����ʽ
 */
import java.util.ArrayList;
public class ArrayListDemo04 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<Student> array=new ArrayList<Student>();
		
		//����ѧ������
		Student s1=new Student("��ͼͼ",8);
		Student s2=new Student("��Ӣ��",27);
		Student s3=new Student("��С��",29);
		
		//���ѧ�����󵽺ͼ�����
		array.add(s1);
		array.add(s2);
		array.add(s3);
		//�������ϣ�����ͨ�ñ�����ʽʵ��
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
			
	}
}

package studentManager;
/*
 	һ������������д
 	 ˼·��
 	    1.�����������������ı�д
 		2.��Scannerʵ�ּ���¼������
 		3.��switch�����ɲ�����ѡ��
 		4.��ѭ������ٴλص�������
 	�������ѧ���Ĵ����д
 	 ˼·��
 		1.�ü���¼��ѡ�����ѧ��
 		2.����һ���������������ѧ��
 		3.����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
 		4.��ѧ��������ӵ�������(����)
 		5.������ӳɹ���ʾ
 		6.���÷���
 	�����鿴ѧ���Ĵ����д
 	˼·��
 		1.�ü���¼��ѡ��鿴����ѧ����Ϣ
 		2.����һ�����������ڲ鿴ѧ����Ϣ
 			1�жϼ������Ƿ������ݣ����û����ʾ��ʾ��Ϣ
 		    2��ʾ��ͷ��Ϣ
 		    3������������ȡ�����ն�Ӧ��ʽ��ʾѧ����Ϣ��������ʾ���䡰�ꡱ
 		3.���÷���    
 	�ġ�ɾ��ѧ���Ĵ����д
 	 ˼·��
 	 1.�ü���¼��ѡ��ɾ��ѧ����Ϣ
 	 2.����һ������������ɾ��ѧ����Ϣ
 	      1��ʾ��ʾ��Ϣ
 	      2����¼��Ҫɾ����ѧ��ѧ��
 	      3�������Ͻ���Ӧѧ������Ӽ�����ɾ��
 	      4����ɾ���ɹ���ʾ
 	 3.���÷���
 	 �塢�޸�ѧ���Ĵ����д
 	  ˼·��
 	  1.�ü���¼��ѡ���޸�ѧ����Ϣ
 	  2.����һ�������������޸�ѧ����Ϣ
 	    1��ʾ��ʾ��Ϣ
 	    2����¼��Ҫ�޸ĵ�ѧ��ѧ��
 	    3����¼��Ҫ�޸ĵ�ѧ����Ϣ
 	    4���������޸Ķ�Ӧ��ѧ����Ϣ
 	    5�����޸ĳɹ�����ʾ
 	  3.���÷���
 	  �������ѧ�����ѧ���ظ�����Ĵ����д
 	  ˼·��
 	  1.����һ����������ѧ���Ƿ�ʹ�ý����ж�
 	       ����뼯���е�ĳһ��ѧ��ѧ����ͬ������true
 	       ���������ͬ������false
 	  2.�����ѧ��¼��ѧ�ź���ø÷���
 	  		1�������ture,������ʾ����������ѧ��
 	  		2�������false���������ѧ������
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagerDemo {
/* 		1.�����������������ı�д
 		2.��Scannerʵ�ּ���¼������
 		3.��switch�����ɲ�����ѡ��
 		4.��ѭ������ٴλص�������
 */
	public static void main(String[] args) {
		//�������϶������ڴ洢ѧ������
		ArrayList<Student> array=new ArrayList<Student>();
		
		//��ѭ������ٴλص�������
		boolean ture=true;
		while(ture) {
			//�����������������ı�д
		System.out.println("--------��ӭ����ѧ������ϵͳ--------");
		System.out.println("1 ���ѧ��");
		System.out.println("2 ɾ��ѧ��");
		System.out.println("3 �޸�ѧ��");
		System.out.println("4 �鿴����ѧ��");
		System.out.println("5 �˳�");
		System.out.println("���������ѡ��");			
		//��Scannerʵ�ּ���¼������
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		
		//��switch�����ɲ�����ѡ��
		switch(line) {
		case "1":
			//System.out.println("��ӳ�ѧ��");
			addStudent(array);
			break;
		case "2":
			//System.out.println("ɾ��ѧ��");
			deleteStudent(array);
			break;
		case "3":
			//System.out.println("�޸�ѧ��");
			updateStudent(array);
			break;
		case "4":
			//System.out.println("�鿴����ѧ��");
			findAllStudent(array);
			break;
		case "5":
			System.out.println("ллʹ��");
			//break;
			System.exit(0);//JVM�˳�
		default:
			System.out.println("ѡ�����������ѡ��");
			break;
		 	}
		}	
		

	}
	//����һ���������������ѧ����Ϣ
	public static void addStudent(ArrayList<Student> array) {
		//�ü���¼��ѡ�����ѧ��
		Scanner sc=new Scanner(System.in);
		
		//Ϊ����sid��ѭ�����汻���ʵ������ǰ���������ѭ���ⲿ
		String sid;
		//Ϊ���ó���ص��������ʹ��ѭ��ʵ��
		while(true) {
		System.out.println("������ѧ��ѧ�ţ�");
		 sid=sc.nextLine();
		
		boolean flag=isUsed(array,sid);
		
		if(flag) {
			System.out.println("�������ѧ���Ѿ���ʹ�ã�����������");
		}else
		 {
			break;
		 }
	}
		System.out.println("������ѧ��������");
		String name=sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age=sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address=sc.nextLine();
		//����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
		Student s=new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//��ѧ��������ӵ�������
		array.add(s);
		//������ӳɹ���ʾ
		System.out.println("���ѧ���ɹ�");
	}
	//����һ���������ж�ѧ���Ƿ�ʹ��
	public static boolean isUsed(ArrayList<Student> array,String sid) {
		//����뼯���е�ĳһ��ѧ��ѧ����ͬ������true�����������ͬ������false
		boolean flag=false;
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			if(s.getSid().equals(sid)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	//����һ�����������ڲ鿴ѧ����Ϣ
	public static void findAllStudent(ArrayList<Student> array) {
		//�жϼ������Ƿ������ݣ����û����ʾ��ʾ��Ϣ
		if(0==array.size()) {
			System.out.println("����Ϣ�����������Ϣ�ٲ�ѯ");
		}else {
		
		//��ʾ��ͷ��Ϣ
		//  \t��ʵ����Tab����λ��
		System.out.println("ѧ��\t\t����\t����\t��ס��");
		
		//������������ȡ�����ն�Ӧ��ʽ��ʾѧ����Ϣ��������ʾ���䡰�ꡱ
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println(s.getSid()+"\t"+s.getName()
			+"\t"+s.getAge()+"��\t"+s.getAddress());
		}
	  }
	}
	//����һ������������ɾ��ѧ����Ϣ
	public static void deleteStudent(ArrayList<Student> array) {
		//����¼��Ҫɾ����ѧ��ѧ��,��ʾ��ʾ��Ϣ
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��������Ҫɾ����ѧ��ѧ�ţ�");
		String sid=sc.nextLine();
		
		//��ɾ��/�޸�ѧ������ǰ����ѧ���Ƿ���ڽ����ж�
		//��������ڣ���ʾ��ʾ��Ϣ
		//������ڣ�ִ��ɾ�����޸Ĳ���
		int index=-1;
	
		//�������Ͻ���Ӧѧ������Ӽ�����ɾ��
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			if(s.getSid().equals(sid)) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("����Ϣ�����ڣ�����������");
		}else {
			array.remove(index);
			//����ɾ���ɹ���ʾ
			System.out.println("ɾ��ѧ���ɹ�");
		}
		
		
		
	}
	//����һ�������������޸�ѧ����Ϣ
	public static void updateStudent(ArrayList<Student> array) {
		//����¼��Ҫ�޸ĵ�ѧ��ѧ��,��ʾ��ʾ��Ϣ
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
		String sid=sc.nextLine();
		//��ɾ��/�޸�ѧ������ǰ����ѧ���Ƿ���ڽ����ж�
				//��������ڣ���ʾ��ʾ��Ϣ
				//������ڣ�ִ��ɾ�����޸Ĳ���
				int index=-1;
			
				//�������Ͻ���Ӧѧ������Ӽ�����ɾ��
				for(int i=0;i<array.size();i++) {
					Student s=array.get(i);
					if(s.getSid().equals(sid)) {
						index=i;
						break;
					}
				}
				if(index==-1) {
					System.out.println("����Ϣ�����ڣ�����������");
				}else {		
		//����¼��Ҫ�޸ĵ�ѧ����Ϣ
		System.out.println("������ѧ����������");
		String name=sc.nextLine();
		System.out.println("������ѧ�������䣺");
		String age=sc.nextLine();
		System.out.println("������ѧ���¾�ס�أ�");
		String address=sc.nextLine();
		
		//����ѧ������
		Student s=new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//���������޸Ķ�Ӧ��ѧ����Ϣ
		for(int i=0;i<array.size();i++) {
			Student student=array.get(i);
			if(0==array.size()) {
				System.out.println("����Ϣ�����������Ϣ�ٲ�ѯ");
			}
			if(student.getSid().equals(sid)) {
				array.set(i,s);
				break;
			}
		}
		//�����޸ĳɹ�����ʾ
		System.out.println("ѧ����Ϣ�޸ĳɹ�");
				}
		
		
	}
}

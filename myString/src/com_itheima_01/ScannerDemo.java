package com_itheima_01;
/*
  		Scanner:
 				���ڻ�ȡ����¼������ݡ��������������ͣ��ַ������ݣ�
 		public String nextLine();
 			��ȡ����¼���ַ�������
 */
import java.util.Scanner;
public class ScannerDemo {
		public static void main(String[] args) {
			//��������
			Scanner sc=new Scanner(System.in);
			
			//��������
			System.out.println("������һ���ַ������ݣ�");
			String line =sc.nextLine();
			sc.close();
			//������
			System.out.println("������������ǣ�"+line);
			
		}
}

package itheima_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 	����:
 		����һ��ArrayList����,�洢����Ԫ��,ÿһ��Ԫ�ض���HashMap,ÿһ��HashMap�ļ���ֵ����String,������
 	˼·:
 		1:����ArrayList����
 		2:����HashMap����,����Ӽ�ֵ��Ԫ��
 		3:��HashMap��ΪԪ����ӵ�ArrayList����
 		4:����ArrayList����
 		
 	�������µ�����:
 		��һ��HashMap���ϵ�Ԫ��:
 			���		����
 			���		С��
 		�ڶ���HashMap���ϵ�Ԫ��:
 			����		����
 			���		С��Ů
 		������HashMap���ϵ�Ԫ��:
 			�����	��ӯӯ
 			��ƽ֮	�����
 			
 */
public class ArrayListIncludeHashMapDemo {
	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
		
		//����HashMap����,����Ӽ�ֵ��Ԫ��
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("���","����");
		hm1.put("���","С��");
		
		//��HashMap��ΪԪ����ӵ�ArrayList����
		array.add(hm1);
		
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("����","����");
		hm2.put("���","С��Ů");
		
		//��HashMap��ΪԪ����ӵ�ArrayList����
		array.add(hm2);
		
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("�����","��ӯӯ");
		hm3.put("��ƽ֮","�����");
		
		//��HashMap��ΪԪ����ӵ�ArrayList����
		array.add(hm3);
		
		//����ArrayList����
		for(HashMap<String,String> hm : array) {
			Set<String> keySet = hm.keySet();
			for(String key : keySet) {
				String value = hm.get(key);
				System.out.println(key+","+value);
			}
		}
	}
}

package itheima_02;

import java.util.HashMap;
import java.util.Map;

/*
 	Map���ϵĻ������ܣ�
 		V put(K key,V value): ���Ԫ��
 		V remove(Object key): ���ݼ�ɾ����ֵ��Ԫ��
 		void clear(): �Ƴ����еļ�ֵ��Ԫ��
 		boolean containsKey(Object key): �жϼ����Ƿ����ָ���ļ�
 		boolean containsValue(Object value): �жϼ����Ƿ����ָ����ֵ
 		boolean isEmpty(): �жϼ����Ƿ�Ϊ��
 		int size(): ���ϵĳ���,Ҳ���Ǽ����м�ֵ�Եĸ���
 */
public class MapDemo02 {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		
//		V put(K key,V value): ���Ԫ��
		map.put("���޼�","����");
		map.put("����","����");
		map.put("���","С��Ů");
		
		
		
// 		V remove(Object key): ���ݼ�ɾ����ֵ��Ԫ��
//		System.out.println(map.remove("����"));
//		System.out.println(map.remove("����"));
		
// 		void clear(): �Ƴ����еļ�ֵ��Ԫ��
//		map.clear();
		
// 		boolean containsKey(Object key): �жϼ����Ƿ����ָ���ļ�
//		System.out.println(map.containsKey("����"));
//		System.out.println(map.containsKey("����"));
		
// 		boolean containsValue(Object value): �жϼ����Ƿ����ָ����ֵ
//		System.out.println(map.containsValue("����"));
//		System.out.println(map.containsValue("�ƻ�"));
		
// 		boolean isEmpty(): �жϼ����Ƿ�Ϊ��
//		System.out.println(map.isEmpty());
//		
//		map.clear();
//		System.out.println(map.isEmpty());
		
// 		int size(): ���ϵĳ���,Ҳ���Ǽ����м�ֵ�Եĸ���
		
		System.out.println(map.size());
		
		//������϶���
		System.out.println(map);
	}
}

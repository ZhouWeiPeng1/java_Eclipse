package itheima_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 	Map���ϵı���(��ʽ2)��
 		��ȡ���м�ֵ�Զ���ļ���
 		Set<Map.Entry<K,V>>entrySet():��ȡ���м�ֵ�Զ���ļ���
 		
 		������ֵ�Զ���ļ���,�õ�ÿһ����ֵ�Զ���
 			����ǿforʵ��,�õ�ÿһ��Map.Entry
 		
 		���ݼ�ֵ�Զ����ȡ����ֵ
 			��getKey()�õ���
 			��getValue()�õ�ֵ
 */
public class MapDemo05 {
	public static void main(String[] args) {
		//�������϶���
			Map<String,String> map = new HashMap<String,String>();
				
		//���Ԫ��
			map.put("���޼�","����");
			map.put("����","����");
			map.put("���","С��Ů");
				
		//��ȡ���м�ֵ�Զ���ļ���
			Set<Map.Entry<String,String>> entrySet = map.entrySet();
			
		//������ֵ�Զ���ļ���,�õ�ÿһ����ֵ�Զ���
			for(Map.Entry<String,String> me : entrySet) {
			//���ݼ�ֵ�Զ����ȡ����ֵ
				String key = me.getKey();
				String value = me.getValue();
				System.out.println(key+","+value);
			}
	}
}

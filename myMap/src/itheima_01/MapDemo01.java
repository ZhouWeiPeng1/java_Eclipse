package itheima_01;

import java.util.HashMap;
import java.util.Map;

/*
 	Map集合概述：
 		Interface Map<K,V> K - 由此地图维护的键的类型  V - 映射值的类型 
 		将键映射到值的对象。 地图不能包含重复的键; 每个键可以映射到最多一个值。 
 		
 	举例:学生的学号和姓名
 		itheima001		林青霞
 		itheima002		张曼玉
 		itheima003		王祖贤
 	
 	创建Map集合的对象
 		多态的方式
 		具体的实现类HashMap
 		
 */
public class MapDemo01 {
	public static void main(String[] args) {
		//创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		//V put(K key, V value) 将指定的值与此映射中的指定键相关联。
		map.put("itheima001","林青霞");
		map.put("itheima002","张曼玉");
		map.put("itheima003","王祖贤");
		map.put("itheima003","柳岩");//当键重复时，会把这个键以前的值给替代掉
		
		//输出集合对象
		System.out.println(map);
		//HashMap重写了toString()方法
	}
}

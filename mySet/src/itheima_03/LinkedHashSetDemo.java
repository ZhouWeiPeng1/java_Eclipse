package itheima_03;

import java.util.LinkedHashSet;

/*
 	LinkedHashSet集合特点
 		哈希表和链表实现的Set接口,具有可预测的迭代次序
 		由链表保证元素有序,也就是说元素的存储和取出顺序是一致的
 		由哈希表保证元素唯一，也就是说没有重复的元素
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//创建LinkedHashSet对象
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		//添加字符串到集合
		lh.add("java");
		lh.add("world");
		lh.add("hello");
		
		//lh.add("world");
		
		//循环遍历
		for(String s : lh) {
			System.out.println(s);
		}
	}
}

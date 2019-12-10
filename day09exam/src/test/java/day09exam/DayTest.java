package day09exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DayTest {
	@Test
	public void test() throws Exception{
		File file = new File("C:\\Users\\asus\\Desktop\\新建文本文档 (4).txt");
		FileInputStream fis = new FileInputStream(file);
		
		int len = 0;
		byte[] b = new byte[1024];
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		while ((len = fis.read(b)) != -1) {
			String string = new String(b, 0, len);
			char[] charArray = string.toCharArray();
			for (char c : charArray) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}else {
					map.put(c, 1);
				}
			}
			String lowerCase = string.toLowerCase();
			char[] charArray2 = lowerCase.toCharArray();
			for (char c : charArray2) {
				if (map2.containsKey(c)) {
					map2.put(c, map2.get(c)+1);
				}else {
					map2.put(c, 1);
				}
			}
			
		}
		
		
//		第一种遍历方式
		System.out.println("-----------------------------第一种遍历方式-------------------------");
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			System.out.println(character+"出现了"+map.get(character)+"次");
			
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
//		第二种遍历方式
		System.out.println("-----------------------------第二种遍历方式-------------------------");
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		Set<Entry<Character, Integer>> entrySet1 = map.entrySet();
		
//		第三种遍历方式
		Iterator<Entry<Character, Integer>> iterator = entrySet1.iterator();
		System.out.println("-----------------------------第三种遍历方式-------------------------");

		while(iterator.hasNext()){
			Entry<Character, Integer> next = iterator.next();
			System.out.println(next);
		}
		

		System.out.println();
		System.out.println();
		System.out.println();
		
		Collection<Integer> values = map.values();
		Set<Character> keySet3 = map.keySet();
		
		
		
		
//		4、打印出现次数超过3次的单词（大小写不敏感）。
			System.out.println("---------------------------------------------------------------------");
		Set<Character> keySet2 = map2.keySet();
		for (Character character : keySet2) {
			if (map.get(character) > 3) {
				System.out.println(character+"出现了"+map2.get(character)+"次");
			}
		}
		
	}
	
}

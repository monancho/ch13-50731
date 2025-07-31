package com.monancho.ch13.pt01.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("이름", "홍길동");
		map.put("직업", "개발자");
		map.put("직장", "서울자동차");
		
		Iterator<String> iter = map.keySet().iterator();
		
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
		System.out.println("==============");
	
		Iterator<Map.Entry<String, String>> iter2 = map.entrySet().iterator();
		while (iter2.hasNext()) {
			Map.Entry<String, String> entry = iter2.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	
	}
}

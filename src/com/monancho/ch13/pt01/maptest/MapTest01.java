package com.monancho.ch13.pt01.maptest;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("이름", "홍길동");
		map1.put("직업", "개발자");
		map1.put("성별", "남자");
		

		System.out.println(map1.get("이름"));
		System.out.println(map1.get("직업"));
		System.out.println(map1.get("성별"));
		
	}

}

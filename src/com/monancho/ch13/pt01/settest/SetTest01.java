package com.monancho.ch13.pt01.settest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Kor");
		set1.add("Jap");
		set1.add("China");
		set1.add("USA");
		
		System.out.println(set1.size()); // set1에 들어간 총 객체 수 -> 4
		
		set1.add("Jap");
		set1.add("China");
		set1.add("Rusia");
		
		System.out.println(set1.size()); // set1에 들어간 총 객체 수 -> 5
		
		Iterator<String> iter = set1.iterator(); //set1 전용 iterator 생성
		while(iter.hasNext()) { // 다음 set 요소(객체)가 존재하면 true 없으면 false 반환
			
			String str = iter.next(); // set 요소(객체)를 꺼내고 iterator 이동
			System.out.println(str);
			System.out.println(set1);
			if (str.equals("Rusia")) {
				iter.remove();
			}
		}
		System.out.println("=======================");
	}

}

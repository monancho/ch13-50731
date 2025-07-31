package com.monancho.ch13.pt01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		
		strList.add("Kor");
		strList.add("Jap");
		strList.add(1,"USA");
	
		
		strList.get(0);
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
//		System.out.println(strList.get(2)); // out of bounds 에러 발생

		
		strList.remove(1);
		System.out.println(strList);
		
		
		for(int i=0; i <strList.size();i++) {
			System.out.println(strList.get(i));
		}

		
		for(String str : strList) {
			System.out.println(str);
		}
		
	}

}

package com.monancho.ch13.pt01.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String>map = new HashMap<String, String>();
		
		map.put("tiger", "12345"); //id, pw
		map.put("kion", "88888"); //id, pw
		map.put("blackcatr", "9999"); //id, pw
		map.put("whitedog", "11134"); //id, pw
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			System.out.println("비밀번호 : ");
			String pw = scanner.nextLine();
			

			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("");
					System.out.println("로그인 성공");
				} else {
					System.out.println("");
					System.out.println("로그인 실패 (비밀번호 틀림)");
				}
			} else {
				System.out.println("");
				System.out.println("로그인 실패 (아이디 없음)");
			}
			System.out.println("======================");
			scanner.close();
			}
		
	}

}

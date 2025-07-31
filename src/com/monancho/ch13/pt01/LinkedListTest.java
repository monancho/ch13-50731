package com.monancho.ch13.pt01;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list1 = new ArrayList<Board>();
		List<Board> list2 = new LinkedList<Board>();
		
		Date nowDate = new Date();
		Board board = new Board("김강찬", "안녕하세요", "안녕하세요 첫 글 입니다", new Timestamp(nowDate.getTime()));
		
		
		long startTime; // 작업 시작 시간
		long endTime; // 작업 종료 시간
		
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000 ; i++) {
			list1.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 작업시간: " + (endTime - startTime));

		
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000 ; i++) {
			list2.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 작업시간: " + (endTime - startTime));
	}
	
}
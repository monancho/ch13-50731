package com.monancho.ch13.pt01;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> boardList = new ArrayList<Board>();
		Date nowDate = new Date();
		
		
		Board board1 = new Board();
		board1.setWriter("홍길동");
		board1.setSubject("안녕하세요!");
		board1.setContent("가입인사드립니다. 반갑습니다.");
		board1.setDate(new Timestamp(nowDate.getTime()));
		boardList.add(board1);
		
		boardList.add(new Board("이순신","저는 이순신 입니다.","저는 조선의 해군 장군입니다", new Timestamp(nowDate.getTime())));
		
		Board board2 = new Board("김윤신", "저는 김유신입니다.", "저는 신라의 장군입니다.", new Timestamp(nowDate.getTime()));
		boardList.add(board2);
		
		System.out.println("____________________________________________________________________________");
		System.out.println("          제 목          /          글 내용        /     글쓴이     /     날짜    ");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < boardList.size(); i++) {
			Board board = boardList.get(i);
			System.out.println(board.getSubject() + " / " + board.getContent() + " / " + board.getWriter() + " / " + board.getDate() );
			System.out.println("----------------------------------------------------------------------------");
		}
		System.out.println("                         이전 페이지 / 다음 페이지                                ");
		System.out.println("____________________________________________________________________________");
		
		
		
	}

}

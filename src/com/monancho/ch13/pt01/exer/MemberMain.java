package com.monancho.ch13.pt01.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberDao dao = new MemberDao();
		List<MemberDto> memberList = dao.getMemberList();
		
		Iterator<MemberDto> iterator = memberList.iterator(); 
		
		while (iterator.hasNext()) {
			MemberDto memberValue = iterator.next();
			System.out.println(memberValue.getId() + " - "+ memberValue.getPw() + " - "+memberValue.getName() + " - "+ memberValue.getEmail());
			
		}
		
		
		
	}

}

package com.monancho.ch13.pt01.exer;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	
	
	public List<MemberDto> getMemberList() {
		List<MemberDto> memberList = new ArrayList<MemberDto>();
		memberList.add(new MemberDto("tiger", "12345", "홍길동", "tiger@abc.com"));
		memberList.add(new MemberDto("lion", "54321", "이순신", "lion@abc.com"));
		memberList.add(new MemberDto("blackcat", "88888", "김유신", "blackcat@abc.com"));
		memberList.add(new MemberDto("whitedog", "99999", "강감찬", "whitedog@abc.com"));
		
		return memberList;

	}
	
}

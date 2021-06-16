package com.kh.home.repository;

import com.kh.home.entity.MemberDto;

public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto login(MemberDto memberDto);
	MemberDto myinfo(int memberNo);
	void changePw(int memberNo, String curPw, String newPw);
	void changeInfo(MemberDto memberDto);
	void exit(int memberNo);
}

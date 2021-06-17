package com.kh.home.repository;

import com.kh.home.entity.MemberDto;

public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto login(MemberDto memberDto);
	MemberDto get(int memberNo);
	boolean changePw(int memberNo, String curPw, String newPw);
	boolean changeInfo(MemberDto memberDto);
	boolean delete(int memberNo);
}

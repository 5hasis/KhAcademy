package com.kh.spring11.service;

import java.io.IOException;

import com.kh.spring11.entity.StudentVO;

public interface StudentService {
	//등록 메소드
	void studentRegistration(StudentVO studentVO) throws IllegalStateException, IOException;
}

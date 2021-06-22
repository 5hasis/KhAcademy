package com.kh.spring11.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class StudentVO {
	//Dto는 데이터베이스와 똑같아야함
	//VO가 더 큰개념
	
	private String studentName;
	private String studentEmail;
	private MultipartFile studentProfile;
}

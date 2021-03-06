package com.kh.spring18.repository;

import java.io.IOException;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring18.entity.StudentProfileDto;

public interface StudentProfileDao {
	StudentProfileDto add(StudentProfileDto studentProfileDto);
	void save(String fileName, MultipartFile file) throws IllegalStateException, IOException; //repository -> 영속성
	StudentProfileDto get(int profileNo);
	ByteArrayResource getFile(String fileName) throws IOException;
}

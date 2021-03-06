package com.kh.spring11.comtroller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring11.entity.StudentVO;
import com.kh.spring11.service.StudentService;

@Controller
public class FileUploadController {
	
	@GetMapping("/upload")
	public String upload() {
		return "upload";
	}
	
	/**
	 * Spring에서는 파일을 MultipartFile 이라는 형태로 수신. 
	 * = MultipartResolver가 등록되어있어야 수신 가능
	 * = cos.jar와는 다르게 먼저 저장을 하지 않고 명령을 통해 저장
	 **/
	
	@PostMapping("/upload1")
	public String upload1(@RequestParam(required = false) MultipartFile f) throws IllegalStateException, IOException {
		System.out.println("f = " + f);
		System.out.println("파일없어? : " + f.isEmpty());
		
		if(!f.isEmpty()) {
			System.out.println("name = " + f.getName()); //f
			System.out.println("originalFilename = " + f.getOriginalFilename()); //dog.png
			System.out.println("size = " + f.getSize()); //345197
			System.out.println("contentType = " + f.getContentType()); //image/png
			
			File dir = new File("E:/Kh/upload");
			File target = new File(dir, f.getOriginalFilename());
			f.transferTo(target); //저장
		}
		
		return "redirect:upload";
	}
	
	/**
	 * 여러개의 파일이 같은 이름으로 업로드 되는 상황
	 **/
	@PostMapping("/upload2")
	//public String upload2(@RequestParam MultipartFile[] f) {
	public String upload2(@RequestParam List<MultipartFile> f) { //없어도 한개는 비어있는 상태로 들어옴
		
		if(!f.get(0).isEmpty()) {
			for(MultipartFile mf : f) {
				System.out.println("파일 발견!");
				System.out.println("name = " + mf.getName()); //f
				System.out.println("originalFilename = " + mf.getOriginalFilename());
				System.out.println("size = " + mf.getSize());
				System.out.println("contentType = " + mf.getContentType());
			}
		}
		
		return "redirect:upload";
	}
	
	@PostMapping("/upload3")
	public String upload3(
			@RequestParam String studentName, 
			@RequestParam String studentEmail, 
			@RequestParam MultipartFile studentProfile) {
		
		System.out.println("이름 = " + studentName);
		System.out.println("name = " + studentProfile.getName()); //studentProfile
		System.out.println("originalFilename = " + studentProfile.getOriginalFilename());
		System.out.println("size = " + studentProfile.getSize());
		System.out.println("contentType = " + studentProfile.getContentType());
		System.out.println("점수 = " + studentEmail);
		return "redirect:upload";
	}
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/upload4")
	public String upload4(@ModelAttribute StudentVO studentVO) throws IllegalStateException, IOException {
		studentService.studentRegistration(studentVO);
		return "redirect:upload";
	}
	
	//--------------------(과정)------------------------
	@PostMapping("/upload4")
	public String upload5(@ModelAttribute StudentVO studentVO) {
		//1-4. <학생 등록 트랜잭션(서비스)>
		//	1.학생 번호를 획득
		//	2.학생 등록
		//	3.학생 프로필 파일 등록
		//	= 파일 이름을 학생 번호로 설정(학생당 파일 하나이기 때문에)
		//	4.학생 프로필 정보 등록
		return "redirect:upload";
	}
}

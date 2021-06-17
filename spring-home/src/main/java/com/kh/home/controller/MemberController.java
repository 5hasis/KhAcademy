package com.kh.home.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.home.entity.MemberDto;
import com.kh.home.repository.MemberDao;

@Controller
//공용 주소 설정. GetMapping, PostMapping 사용 불가
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	//회원 가입 관련 요청 처리
	@GetMapping("/regist")
	public String regist() {
		return "member/regist";
	}
	
	@PostMapping("/regist")
	public String regist(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "redirect:regist_success"; 
	}
	
	@GetMapping("/regist_success")
	public String registSuccess() {
		return "member/registSuccess";
	}
	
	//로그인 요청 처리
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	//세션이 처리상 필요할 경우 컨트롤러 메소드의 매개변수에 작성하면 자동으로 할당
	@PostMapping("/login")
	public String loging(@ModelAttribute MemberDto memberDto, HttpSession session) {
		MemberDto find = memberDao.login(memberDto);
		if(find != null) { //성공
			//세션에 memberNo라는 이름으로 회원번호를 추가
			session.setAttribute("memberNo", find.getMemberNo());
			return "redirect:/"; //root로 이동(context path 생략)
		}
		else { //실패
			return "redirect:login?error";
		}
	}
	
	//로그아웃 구현
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("memberNo");
		//session.invalidate(); //세션 만료(사라짐)
		return "redirect:/";
	}
	
	//내정보
	//@GetMapping("/myinfo")
	@RequestMapping("/myinfo")
	public String myinfo(HttpSession session, Model model) {
		int memberNo = (int)session.getAttribute("memberNo");
		MemberDto memberDto = memberDao.get(memberNo);

		model.addAttribute("memberDto", memberDto);
		return "member/myinfo";
	}
	
	@GetMapping("/change_pw")
	public String change_pw() {
		return "member/change_pw";
	}
	
	@PostMapping("/change_pw")
	public String change_pw(@RequestParam String curPw, @RequestParam String newPw, HttpSession session) {
		int memberNo = (int)session.getAttribute("memberNo");
		memberDao.changePw(memberNo, curPw, newPw);
		return "redirect:/";
	}
	
	@GetMapping("/change_info")
	public String change_info(HttpSession session, Model model) {
		int memberNo = (int)session.getAttribute("memberNo");
		MemberDto memberDto = memberDao.get(memberNo);
		model.addAttribute("memberDto", memberDto);
		return "member/change_info";
	}

	@PostMapping("/change_info")
	public String change_info(@ModelAttribute MemberDto memberDto) {
		memberDao.changeInfo(memberDto);
		return "redirect:change_infoSuccess";
	}
	
	
	@GetMapping("/exit")
	public String exit(HttpSession session) {
		int memberNo = (int)session.getAttribute("memberNo");
		memberDao.exit(memberNo);
		return "index";
	}
}

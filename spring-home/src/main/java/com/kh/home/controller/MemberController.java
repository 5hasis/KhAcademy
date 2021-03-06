package com.kh.home.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
	public String loging(
			@ModelAttribute MemberDto memberDto, 
			@RequestParam(required = false) String saveId,
			HttpSession session,
			HttpServletResponse response) {
		
		MemberDto find = memberDao.login(memberDto);
		if(find != null) { //성공
			//세션에 memberNo라는 이름으로 회원번호를 추가
			session.setAttribute("memberNo", find.getMemberNo());
			
			//아이디 저장하기에 대한 쿠키 작업 추가
			Cookie cookie = new Cookie("saveId", find.getMemberId());
			if(saveId != null) { //체크한 경우
//				cookie.setMaxAge(Integer.MAX_VALUE); //평생
				cookie.setMaxAge(4*7*24*60*60); //4주
			}
			else { //체크 안한 경우
				cookie.setMaxAge(0); 
			}
			response.addCookie(cookie);
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
	
	//비밀번호 변경
	@GetMapping("/change_pw")
	public String changePw() {
		return "member/changePw";
	}
	
	@PostMapping("/change_pw")
	public String changePw(
			@RequestParam(value="curPw") String curPassword, 
			@RequestParam(value="newPw") String newPassword, 
			HttpSession session) {
		
		int memberNo = (int)session.getAttribute("memberNo");
		boolean result = memberDao.changePw(memberNo, curPassword, newPassword);
		
		if(result) {
			return "redirect:change_pw_success";
		}
		else {
			return "redirect:changePw?error";
		}
	}
	
	@GetMapping("/change_pw_success")
	public String changePwSuccess() {
		return "member/changePwSuccess";
	}
	
	//회원 정보 변경
	@GetMapping("/change_info")
	public String change_info(HttpSession session, Model model) {
		int memberNo = (int)session.getAttribute("memberNo");
		MemberDto memberDto = memberDao.get(memberNo);
		
		model.addAttribute("memberDto", memberDto);
		
		//return "/WEB_INF/views/member/changeInfo.jsp";
		return "member/changeInfo";
	}

	@PostMapping("/change_info")
	public String change_info(@ModelAttribute MemberDto memberDto, HttpSession session) { //@ModelAttribute 이 안에다가 받아라?
		int memberNo = (int)session.getAttribute("memberNo");
		memberDto.setMemberNo(memberNo);
		
		boolean result = memberDao.changeInfo(memberDto);
		if(result) {
			return "redirec:change_info_success";
		}
		else {
			return "redirect:change_info?error";
		}
	}
	
	@GetMapping("/change_info_success")
	public String changeInfoSuccess() {
		return "member/changeInfoSuccess";
	}
	
	//회원 탈퇴
	@RequestMapping("/exit")
	public String exit(HttpSession session) {
		int memberNo = (int)session.getAttribute("memberNo");
		
		memberDao.delete(memberNo);
		session.removeAttribute("memberNo");
		
		return "redirect:goodbye";
	}
	
	@GetMapping("/goodbye")
	public String goodbye() {
		return "member/goodbye";
	}
}

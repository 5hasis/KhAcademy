package api.lang.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("우편번호 입력 : ");
		String address = sc.next();
		
		String addRegex = "^[0-9]{5,6}$";
		//String addRegex = "^\\d{5,6}$";
		
		if(Pattern.matches(addRegex, address)) {
			System.out.println("우편번호 : " + address);
		}
		else {
			System.out.println("신주소 - 5자리 숫자, 구주소 - 6자리 숫자");
		}
		
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		
		String pwdRegex = "^[A-Za-z0-9!@#$]{8,16}$";
		
		if(Pattern.matches(pwdRegex, pwd)) {
			System.out.println("비밀번호 : " + pwd);
		}
		else {
			System.out.println("영문 대문자 , 영문 소문자 , 숫자 , 특수문자(!@#$) 중에서 8~16자 이내로 작성");
		}
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		String nameRegex = "^[가-힣]{2,10}$";
		
		if(Pattern.matches(nameRegex, name)) {
			System.out.println("이름 : " + name);
		}
		else {
			System.out.println("한글 2글자 ~ 10글자");
		}
		
		System.out.print("전화번호 입력 : ");
		String phone = sc.next();
		
		//String phoneRegex = "^(010-)[1-9][0-1]{3}-[0-9]{4}$";
		//String phoneRegex = "^010([1-9]\\d{7}|-[1-9]\\d{3}-\\d{4})$";
		String phoneRegex = "^010([1-9][0-1]{3}[0-9]{4})$";
		
		if(Pattern.matches(phoneRegex, phone)) {
			System.out.println("전화번호 : " + phone);
		}
		else {
			System.out.println("010-XXXX-XXXX 형태");
		}
		
		System.out.print("생년월일 입력 : ");
		String birth = sc.next();
		
		//1900-01-01 부터 2099-12-31
		//String birthRegex = "^((19|20)[0-9]{2})-((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01])|(0[469]|11)-(0[1-9]|[12][0-9]|30)|02-(0[1-9]|[12][0-9]))$";
		String birthRegex = "^(19|20)[0-9][0-9]-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[0-1])$";
		
		if(Pattern.matches(birthRegex, birth)) {
			System.out.println("생년월일(1900~2099) : " + birth);
		}
		else {
			System.out.println("YYYY-MM-DD 형태.");
		}
		
		
		
		sc.close();
	}
}

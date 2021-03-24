package api.lang.string;

import java.util.regex.Pattern;

public class Test11 {
	public static void main(String[] args) {
		//정규표현식(Regular Expression, regex)
		//=문자열의 형식을 검사하는 식
		//=http://www.regexper.com

		String id = "khstudent1234";
		
		String regex = "^[a-z0-9-_]{5,20}$"; //검사식
		
		//System.out.println(Pattern.matches(regex, id));
		if(Pattern.matches(regex, id)) {
			System.out.println("올바른 아이디입니다.");
		}
		else {
			System.out.println("아이디는 영문소문자,숫자,-,_로 구성된 5~20자로 작성하세요");
		}
		
	}
}

package output;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		//System.out을 이용한 출력 방법과 주의사항
		//-System.out.print() : 글자 혹은 값을 있는 그대로 출력
		//-System.out.println() : 글자 혹은 값을 있는 그대로 출력 후 개행
		
		System.out.print("안");
		System.out.print("녕");
		System.out.println("하");
		System.out.println("세");
		System.out.println("요");
		
		//주의사항 : 문자열의 특성상 특수문자(Escape sequence)가 존재
		//- '\'는 뒤에 있는 글자가 특수한 글자임을 표시하는 기호(단독 사용 불가)
		//- 뒤에 있는 글자에 따라 역할이 달라짐
		//-\n은 개행(new line), \t는 탭(tab)
		
		//Q : 화면에 다음 글자를 출력해보세요
		//- 나는 지금 "피자"가 먹고 싶어요
		System.out.println("나는 지금 \"피자\"가 먹고 싶어요");

		System.out.println("배	고	파"); //추천
		System.out.println("배\t고\t파"); //비추천 
		
		//System.out.println("C:\Windows\system32"); // '\'단독사용시 오류
		System.out.println("C:\\Windows\\system32");
		
	}

}

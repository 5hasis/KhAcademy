package api.lang.string;

public class Test10 {
	public static void main(String[] args) {
		//문자열을 이용해 형식 검사
		//ex) 사용자에게 회원 아이디 입력받기 (형식 지켜야댐)
//		1. 네이버 기준으로 아이디는 5~20글자
//		2. 영문 소문자, 숫자와 특수문자 중에서 -, _ 만 사용 가능
		
//		= 안되는건 아닌데 매우 복잡하다!
		String id = "khstudent1234";
		
		boolean first = id.length() >= 5 && id.length() <= 20;
		
//		boolean second = id.length() == 영문소문자+숫자+특수문자 개수;
		int count = 0;
		for(int i=0; i < id.length(); i++) {
			char ch = id.charAt(i);//한 글자를 꺼내서
			if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '-' || ch == '_') {
				count++;
			}
		}
//		System.out.println("length = " + id.length());
//		System.out.println("count = " + count);
		boolean second = id.length() == count;
		
		if(first && second) {
			System.out.println("올바른 아이디 형식입니다");
		}
		else {
			System.out.println("아이디는 영문소문자, 특수문자, -, _ 를 이용하여 5~20자 이내로 작성하세요");
		}
		
	}

}

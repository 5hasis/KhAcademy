package api.lang.string;

public class Test03 {
	public static void main(String[] args) {
		String url = "http://www.naver.com";
		
		//1.글자수는 얼마입니까?
		System.out.println(url.length());
		
		//2.http로 시작합니까?(올바른 홈페이지 주소 형식인가요?)
		System.out.println(url.startsWith("http"));
		System.out.println(url.startsWith("http", 0));//+5지점부터 확인하겠슴
		
		//3..com으로 끝나나요?
		System.out.println(url.endsWith(".com"));
		
		//4.naver라는 글자가 있나요?
		System.out.println(url.contains("naver"));
		//CharSequence 업캐스팅
		
		//5.naver라는 단어가 어디에 있나요?
		System.out.println(url.indexOf("naver"));
		
		//6.11번째 글자가 무엇인가요?
		System.out.println(url.charAt(11));
	}
}

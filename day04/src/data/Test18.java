package data;

public class Test18 {

	public static void main(String[] args) {
		//UTF-8 : 여러개의 글자가 섞였을때 좋아요... => 웹(다양한 운영체제?라서)
		// 조립형한글 : 안뿌셔도되요. 하지만 용량이 커요
		// 완성형한글 : 전송할때 뿌셔야댐. 파괴코드, 조합코드 CP949 -> window(MS)
		
		//Q : 다음 변수가 영어 글자인지 판정하여 출력
		char ch = '가';
		boolean alpha = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
		
		System.out.println("영어 글자 인가요?");
		System.out.println(alpha);
	}

}

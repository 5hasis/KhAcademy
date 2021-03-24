package api.lang.string;

public class Test07_1 {
	public static void main(String[] args) {
		
//		준비
		String chat = "이런 시베리아 십장생같은 경우를 보았나!!!";
		
		String[] filter = new String[] {
			"개나리", "신발끈", "십장생", "식빵", "시베리아"
		};
		
//		꼼수 : 인덱스와 별 개수를 일치시켜 불러오도록 구현(확장성 떨어짐)
		String[] star = new String[] {
				"",
				"*",
				"**",
				"***",
				"****",
				"*****",
				"******"
		};
		
//		계산
		for(int i=0; i < filter.length; i++) {
			int len = filter[i].length();
			chat = chat.replace(filter[i], star[len]);
		}
		
//		출력
		System.out.println(chat);
		
	}
}
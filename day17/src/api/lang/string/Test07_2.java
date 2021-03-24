package api.lang.string;

public class Test07_2 {
	public static void main(String[] args) {
		
//		준비
		String chat = "이런 시베리아 십장생같은 경우를 보았나!!!";
		
		String[] filter = new String[] {
			"개나리", "신발끈", "십장생", "식빵", "시베리아"
		};
		
//		계산
		for(int i=0; i < filter.length; i++) {
			//외부에 별 생성 메소드를 만들고 불러서 생성(확장성 good)
			int len = filter[i].length();
			chat = chat.replace(filter[i], StarGenerator.generate(len));
		}
		
//		출력
		System.out.println(chat);
		
	}
}
package api.lang.string;

public class Test09 {
	public static void main(String[] args) {
		//문자열의 단점과 보완방법 탐색
		//= 문자열의 가장 큰 장점이며 단점은 불변이라는 것!
		//= 문자열 합성이 매우 느림
		
		//ex : hello\n 를 10000번 더해서 출력하는 프로그램
		String text = "";
		
		long start = System.currentTimeMillis();//시작 시각 측정
		
		for(int i=0; i < 100000; i++) {
			text += "hello\n";
		}
		
		long finish = System.currentTimeMillis();//종료 시각 측정

		System.out.println(text);
		
		System.out.println("소요시간 : "+(finish - start) + "ms");
	}
}
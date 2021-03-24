package api.lang.string;

public class Test09_1 {
	public static void main(String[] args) {
		//문자열 합성이 느리므로 이를 처리할 수 있는 별도의 도우미 클래스가 존재
		//= StringBuffer, StringBuilder 둘 중에 하나를 상황에 맞게 이용한다.
		
		//ex : hello\n 를 10000번 더해서 출력하는 프로그램
		StringBuffer buffer = new StringBuffer();
		
		long start = System.currentTimeMillis();//시작 시각 측정
		
		for(int i=0; i < 1000000; i++) {
			buffer.append("hello\n");
		}
		
		long finish = System.currentTimeMillis();//종료 시각 측정

		System.out.println(buffer.toString());
		
		System.out.println("소요시간 : "+(finish - start) + "ms");
	}
}

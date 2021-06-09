package exception;

public class Calculator {
	
	//나누기 메소드
	//= 이 메소드는 예외가 발생할 수 있는 메소드(위험한 메소드, 폭탄 신입사원)
	//= throws를 이용해서 "위험한 메소드"임을 표시(어떤 위험인지도 표시)
	//= 예외 전가 키워드
	public static int div(int a, int b) throws Exception {
		return a / b;
	}
	
}
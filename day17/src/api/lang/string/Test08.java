package api.lang.string;

public class Test08 {
	public static void main(String[] args) {
//		문자열과 원시 자료형간의 변환
//		ex ) int를 String으로 변환 또는 String을 int로 변환해야 하는 경우
		
		int a = 100;
//		String b = a;
//		String b = (String)a;
//		String b = "" + a;//편법 : 문자열은 어떤값과 더해도 문자열이 된다는 특징을 이용
		String b = String.valueOf(a);//정식 방법 : String에서 제공하는 메소드 이용
		
		System.out.println(b);
		
		String c = "12345";
		int d = Integer.parseInt(c);
		
		System.out.println(d);
		
	}
}
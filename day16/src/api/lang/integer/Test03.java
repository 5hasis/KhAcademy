package api.lang.integer;

public class Test03 {
	public static void main(String[] args) {
		//참조형에만 있을 수 있는 데이터가 있다.
		//= null
		//= null은 "참조 대상이 없음"이라는 뜻이기 때문에 원시형에서 사용이 불가능
		//= cf) void는 "반환값이 없음"이라는 뜻
		
		//= null이 나올 수 있는 환경이라면 int는 못쓴다는 의미
		
		//int a = null;
		Integer b = null;
		
		//아래 코드는 Integer일 경우만 가능하다.
		Integer[] c = new Integer[] {10, 20, null, 30, 40};
	}
}
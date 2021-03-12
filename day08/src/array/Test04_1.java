package array;
import java.lang.*;
public class Test04_1 {
	public static void main(String[] args) {
//		10일동안 첫날은 10개, 둘째날부터 전날보다 3개씩 개수를 늘려서 푸시업을 할 때,
//		매일매일 하게 되는 푸시업 개수를 배열에 저장한 뒤 한번에 출력해보세요
		
//		한 번에 배열의 칸수를 고쳐서 프로그램을 변경시킬까?
//		1. 칸 수를 변수로 설정(period)
		int period = 10;
		
//		배열 생성
		int[] day = new int[period];
		
//		초기화 - 0부터 (period-1)까지 반복을 적용(for)
		int pushup = 10;
		for(int i=0; i<period; i++) {
			//day[i] = (i * 3) + 10;
			day[i] = pushup;
			pushup += 3;
		}
		
//		출력 - 0부터 (period-1)까지 반복을 적용(for)
		for(int i=0; i<period; i++) {
			System.out.println(day[i]);
		}
	}
}
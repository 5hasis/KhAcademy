package array;
import java.lang.*;
public class Test04_2 {
	public static void main(String[] args) {
//		한 번에 배열의 칸수를 고쳐서 프로그램을 변경시킬까?
//		2. 배열에 내장된 값을 활용
		
//		배열 생성
		int[] day = new int[15];
		
//		System.out.println(day.length);//배열에 자동으로 포함되는 길이 정보 버튼
		
//		초기화 - 0부터 (day.length-1)까지 반복을 적용(for)
		int pushup = 10;
		for(int i=0; i<day.length; i++) {
			//day[i] = (i * 3) + 10;
			day[i] = pushup;
			pushup += 3;
		}
		
//		출력 - 0부터 (day.length-1)까지 반복을 적용(for)
		for(int i=0; i<day.length; i++) {
			System.out.println(day[i]);
		}
	}
}

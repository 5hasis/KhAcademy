package array2d;
//import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//2차원 배열의 생성과 출력
		//= 표와 같은 구조이므로 줄, 칸으로 이해하면 편하다
		
		//생성
		int[][] data = new int[2][3];
		
		//초기화
		data[0][0] = 9;
		data[0][1] = 6;
		data[0][2] = 5;
		//data[0][3] = 4;
		data[1][0] = 4;
		data[1][1] = 2;
		data[1][2] = 3;
		
		//출력
		System.out.println(data.length);
		System.out.println(data[0].length);
		System.out.println(data[1].length);
		
		for(int i=0; i <= 2; i++) {
			System.out.print(data[0][i]+"\t");		
		}
		System.out.println();
		for(int i=0; i <= 2; i++) {
			System.out.print(data[1][i]+"\t");
		}
		System.out.println();
		
	}
}
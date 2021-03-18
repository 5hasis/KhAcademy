package array;
//import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
		//배열에서의 데이터 교체(swap)
		
		int[] data = new int[] { 30 , 50 , 20 , 10 , 40 };
		
		//1번 위치와 3번 위치를 교체
		int temp = data[1];
		data[1] = data[3];
		data[3] = temp;
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
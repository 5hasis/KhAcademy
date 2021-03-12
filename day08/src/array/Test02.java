package array;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//배열을 종류별로 생성해보자!
		//= new 를 이용하여 생성하면 자동으로 초기값이 설정된다.
		
		//10, 20, 30, 40, 50 을 저장하기 위한 배열 생성
		//= 정수(int) 배열을 만들어 저장
		
		int[] a = new int[5];
		//int a[] = new int[5];
		//a -----> [ 0 ][ 0 ][ 0 ][ 0 ][ 0 ]
		
		//a = 10;//불가능한 코드
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		//a[5] = 60;//불가능한 코드(범위 초과)
		
		System.out.println(a);//리모컨 정보(일련번호가 나옴)
		System.out.println(a[0]);//기준점에서 +0 지점
		System.out.println(a[1]);//기준점에서 +1 지점
		System.out.println(a[2]);//기준점에서 +2 지점
		System.out.println(a[3]);//기준점에서 +3 지점
		System.out.println(a[4]);//기준점에서 +4 지점
	}
}
package array;

public class Test12 {
	public static void main(String[] args) {
		// 선택 정렬(selection sort)
		// =가장 작은 값을 왼쪽 부터 채우는 정렬 방식

		int[] data = new int[] { 30, 50, 20, 10, 40 };

		int idx = 0;

		//최소값을 찾아서 왼쪽과 교체하는 코드를 다음 범위에 맞게 수행
		//(1회차 : +0~+4) -> (2회차 : +1~+4) -> (3회차 : +2~+4) -> (4회차 : +3~+4) -> 완료
				
		for (int k = 0; k < data.length - 1; k++) {
			for (int i = k+1; i < data.length; i++) {
				if (data[idx] > data[i]) {
					idx = i;
				}
			}
			int temp = data[k];
			data[k] = data[idx];
			data[idx] = temp;
		}

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}

}

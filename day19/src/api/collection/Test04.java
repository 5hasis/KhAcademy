package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		arr.add("철수");
		arr.add("영희");
		arr.add("영수");
		arr.add("민지");
		arr.add("미영");
		arr.add("민수");

		Random r = new Random();


		for (int i = 0; i < 2; i++) {
			int index = r.nextInt(arr.size());
			System.out.println(arr.get(index));
			arr.remove(index);
		}

	}
}

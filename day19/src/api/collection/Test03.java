package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Random r = new Random();
	
		
		for(int i = 0; i < 6; i++) {
			
			int lotto = r.nextInt(45) + 1; //1-45
			list.add(lotto);
			
			for(int j = 0; j < i; j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(i);
					i--;
				}
			}
		}
		
		System.out.println(list);
		
		
	}
}

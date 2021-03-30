package api.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("블랙");
		list.add("블랙");
		list.add("블랙");
		list.add("블랙");
		list.add("화이트");
		list.add("화이트");
		
		Set<String> set = new TreeSet<>(list);
		System.out.println(set);
	}

}

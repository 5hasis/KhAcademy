package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		Set<String> iPhone = new TreeSet<>();
		
		iPhone.add("블랙");
		iPhone.add("그린");
		iPhone.add("옐로우");
		iPhone.add("퍼플");
		iPhone.add("레드");
		iPhone.add("화이트");
		

		Set<String> galaxy = new TreeSet<>();
		
		galaxy.add("블랙");
		galaxy.add("화이트");
		galaxy.add("팬텀 그레이");
		galaxy.add("팬텀 핑크");
		
		//공통 색상(교집합)
		Set<String> commonColor = new TreeSet<>();
		commonColor.addAll(iPhone);
		commonColor.retainAll(galaxy);
		System.out.println("공통색상 : " + commonColor);
		
		//아이폰 고유 색상(차집합)
		Set<String> iPhoneOnly = new TreeSet<>(iPhone);
		iPhoneOnly.removeAll(galaxy);
		System.out.println(iPhoneOnly);
		
		Set<String> galaxyOnly = new TreeSet<>(galaxy);
		galaxyOnly.removeAll(iPhone);
		System.out.println(galaxyOnly);
		
		Set<String> d = new TreeSet<>();
		d.addAll(iPhone);
		d.addAll(galaxy);
		
		for(String item : d)
			System.out.println(item);
	}
}

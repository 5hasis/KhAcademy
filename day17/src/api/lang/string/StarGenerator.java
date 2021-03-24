package api.lang.string;

public class StarGenerator {
	
	public static String generate(int size) {
		String str = "";
		//str에 *을 계속 더해넣는다(size 횟수만큼)
		for(int i=0; i < size; i++) {
			str += "*";
		}
		return str;
	}
}
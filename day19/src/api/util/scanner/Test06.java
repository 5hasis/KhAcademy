package api.util.scanner;

import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test06 {
	public static void main(String[] args) {
//		Scanner를 이용한 웹페이지 불러오기(크롤링:crawling의 시작)
		try {
			URL url = new URL("https://www.melon.com");
			Scanner sc = new Scanner(url.openStream());
			
			String regex = ".*?(https?:\\/\\/)?www\\..*";//주소가 포함되었는지 확인하는 정규표현식
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				
				if(Pattern.matches(regex, line)) {
					System.out.println(line.trim());//불필요한 여백을 제거하고 출력
				}
			}
			
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
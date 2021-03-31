package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//ArrayList는 Serializable 상속 : 출력가능
		
		
		List<Integer> base = new ArrayList<>();
		for (int i = 1; i <= 45; i++) {
			base.add(i);
		}
		Collections.shuffle(base);

		List<Integer> lotto = base.subList(0, 6);
		Collections.sort(lotto);
		
		//lotto라는 객체를 파일에 출력
		File target = new File("kh", "object2.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream obout = new ObjectOutputStream(buffer);
		
		
		obout.writeObject(lotto); 
		
		
		obout.close();
	}

}

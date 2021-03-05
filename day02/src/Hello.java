//import는 준비 명령이다
// = 원하는 개수만큼 할 수 있으며 * 를 통해 전부 다 불러올 수 있다.
// = 준비되지 않은 내용들은 사용할 수 없다.
// = 단, java.lang 이라는 패키지(폴더)는 무조건 있어야 되서 안써도 자동으로 써준다

import java.lang.*;
 
public class Hello {//Hello.java를 대표하는 영역
    public static void main(String[] args) {//프로그램의 시작지점(main 메소드)
        //첫 번째 프로그램
        //System.out.println("Hello Java!");
        
        //출력 명령
        //= 화면에 글자를 표시해준다.
        //= 하나의 명령이 한 줄씩 나온다.
        System.out.println("Hello Java!");
        System.out.println("안녕하세요!");
    }
}
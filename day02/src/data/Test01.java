package data;
 
import java.lang.*;
 
public class Test01 {
    public static void main(String[] args) {//main 메소드
        
        //Q : 한그릇에 5000원인 자장면 3그릇은 얼마입니까?
        
        //좋지 않은 답변(개발자가 풀었음)
        //System.out.println("15000원입니다!");
        
        //바람직한 답변(계산을 프로그램이 수행)
        System.out.println(5000 * 3);
        
        //Q : 한그릇에 5000원인 자장면 3그릇을 주문하고 3천원 할인 쿠폰을 내면 결제금액은?
        
        //좋지 않은 답변(반복되는 계산 코드가 등장)
        System.out.println(5000 * 3);//할인 전
        System.out.println(5000 * 3 - 3000);//할인 후
        
        //바람직한 답변
        int a = 5000 * 3;//a라는 저장공간(변수,variable)을 만들고 5000 * 3을 저장!
        System.out.println(a);
        System.out.println(a - 3000);
    }
}
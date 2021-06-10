package exception;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class Student {
	//멤버 변수
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//생성자
	public Student() {
		super();
	}
	public Student(String name, int korean, int english, int math) {
		super();
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	//세터&게터
	public String getName() {
		return name;
	}
	//이름은 한글 2~7자만 설정이 되어야 한다. 그런데 아니면 어떻할까?
	//= 설정을 안하는 것도 중요하지만 오류라는 사실을 알려줘야 하지 않을까?
	public void setName(String name) throws InputMismatchException {
		String nameRegex = "^[가-힣]{2,7}$";
		if(!Pattern.matches(nameRegex, name)) {
			//종료시켜버린다(외부에서 문제가 발생했음을 알 수 없다)
			//return;
			
			//오류가 발생했음을 동네방네 소문낸다(강제 예외 발생)
			throw new InputMismatchException("이름은 한글 2~7자로 설정하세요");
		}
		
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) throws InputMismatchException {
		if(!(korean >= 0 && korean <= 100)) {
			//return;
			throw new InputMismatchException("국어점수는 0~100점 사이로 설정하세요");
		}
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) throws InputMismatchException {
		if(!(english >= 0 && english <= 100)) {
			//return;
			throw new InputMismatchException("영어점수는 0~100점 사이로 설정하세요");
		}
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) throws InputMismatchException {
		if(!(math >= 0 && math <= 100)) {
			//return;
			throw new InputMismatchException("수학점수는 0~100점 사이로 설정하세요");
		}
		this.math = math;
	}
	
	//가상의 getter
	public int getTotal() {
		return this.korean + this.english + this.math;
	}
	public double getAverage() {
		return this.getTotal() / 3.0;
	}
	
}


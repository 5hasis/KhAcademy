package oop.keyword1;

public class Student {
	//목표 : 이름을 설정하면 변경이 불가능하게 하고 싶은 경우
	//= 한 번 조차 설정이 안되면 뭐하러 만드냐! 라고 하면서 오류가 발생
	//= 생성자에 반드시 이름이 설정되도록 만들면 문제가 해결됨
	//= final 항목은 setter 메소드를 못만든다
	private final String name;
	private int score;
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int score) {
		this.name = name;
		this.setScore(score);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
}
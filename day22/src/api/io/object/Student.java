package api.io.object;

import java.io.Serializable;

//클래스를 만들때, 입/출력 계획이 있다면 다음 상속을 받아야함
public class Student implements Serializable{
	
	private String name;
	private int score;
	
	//입출력에서 배제시키고 싶은 경우 : transient 키워드 사용
	private transient String phone;
	
	public Student() {
		super();
	}

	public Student(String name, int score, String phone) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	
	
}

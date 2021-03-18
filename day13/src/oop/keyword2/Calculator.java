package oop.keyword2;

//계산기 : 사칙연산 도우미
public class Calculator {

	int first;
	int second;
	
	//setter & getter
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	//기본 생성자(default constructor)
	public Calculator() {
		
	}
	
	public Calculator(int first, int second) {
		this.setFirst(first);
		this.setSecond(second);
	
	}
	
	//계산기능
	public int plus() {
		return this.first + this.second;
	}
	public int minus() {
		return this.first - this.second;
	}
	
}

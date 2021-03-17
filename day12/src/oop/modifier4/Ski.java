package oop.modifier4;

public class Ski {
	// 멤버 변수
	private String name;
	private int start;
	private int finish;
	private int adult;
	private int child;

	// setter method
	public void setName(String name) {
		this.name = name;
	}
	public void setStart(int start) {
		if(start >= 0000 && start < 2400) {
			this.start = start;
		}
	}
	public void setFinish(int finish) {
		if(finish >= 0000 && finish < 2400) {
			this.finish = finish;
		}
	}
	public void setAdult(int adult) {
		if(adult < 0) return;
		this.adult = adult;
	}
	public void setChild(int child) {
		if(child < 0) return;
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public int getStart() {
		return start;
	}
	public int getFinish() {
		return finish;
	}
	public int getAdult() {
		return adult;
	}
	public int getChild() {
		return child;
	}
	
	public void set(String name, int start, int finish, int adult, int child) {
		this.setName(name);
		this.setStart(start);
		this.setFinish(finish);
		this.setAdult(adult);
		this.setChild(child);
	}
	
	public void result() {
		System.out.println("<이용권 정보>");
		System.out.println("이름 : "+this.name);
		System.out.println("시간 : "+this.start+"부터 "+this.finish+"까지");
		System.out.println("성인 : "+this.adult+"원, 아동 : "+this.child+"원");
	}
	
//	가상의 getter를 만들어서 시간 계산을 처리
//	1. 시간만 분리하는 기능
//	2. 분만 분리하는 기능
	public int getStartHour() {//시작시간 중 시간에 해당하는 값
		return this.start / 100;
	}
	public int getStartMinute() {//시작시간 중 분에 해당하는 값
		return this.start % 100;
	}
	public int getFinishHour() {//종료시간 중 시간에 해당하는 값
		return this.finish / 100;
	}
	public int getFinishMinute() {//종료시간 중 분에 해당하는 값
		return this.finish % 100;
	}
	public int getStartTime() {//시작시간(분)
		return this.getStartHour() * 60 + this.getStartMinute();
	}
	public int getFinishTime() {//종료시간(분)
		return this.getFinishHour() * 60 + this.getFinishMinute();
	}
	public int getTime() {//이용시간(분)
		return this.getFinishTime() - this.getStartTime();
	}
	public int getHour() {
		return this.getTime() / 60;
	}
	public int getMinute() {
		return this.getTime() % 60;
	}
	public String getTimeString() {
		return this.getHour()+"시간 "+this.getMinute()+"분";
	}
}

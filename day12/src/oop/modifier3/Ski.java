package oop.modifier3;

public class Ski {
	private String name;
	private int start;
	private int end;
	private int adult;
	private int kid;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStart(int start) {
		if(start >= 0000 && start <= 2359) 
			this.start = start;
	}
	public void setEnd(int end) {
		if(start >= 0000 && start <= 2359) 
			this.end = end;
	}
	public void setAdult(int adult) {
		if(adult > 0)
			this.adult = adult;
	}
	public void setKid(int kid) {
		if(kid > 0)
			this.kid = kid;
	}
	public void set(String name, int start, int end, int adult, int kid) {
		this.setName(name);
		this.setStart(start);
		this.setEnd(end);
		this.setAdult(adult);
		this.setKid(kid);
	}
	
	public String getName() {
		return this.name;
	}
	public int getStart() {
		int startHour = this.start / 100;
		int startMinute = this.start % 100;
		int total = startHour * 60 + startMinute;
		return total;
	}
	public int getEnd() {
		int endHour = this.end / 100;
		int endMinute = this.end % 100;
		int total = endHour * 60 + endMinute;
		return total;
	}
	
	public int getAdult() {
		return this.adult;
	}
	public int getKid() {
		return this.kid;
	}
	
	public void result() {
		System.out.println("<이용권 정보>");
		System.out.println("이름 : "+this.name);
		System.out.println("시간 : "+this.start+"부터 "+this.end+"까지");
		System.out.println("성인 : "+this.adult+"원, 아동 : "+this.kid+"원");
	}
}

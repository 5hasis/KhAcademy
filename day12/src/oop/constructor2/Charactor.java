package oop.constructor2;

public class Charactor {
	private String id;
	private String job;
	private int level;
	private int money;

	public Charactor(String id, String job) {
		this.id = id;
		this.setJob(job);
		this.level = 1;
		this.money = 0;
	}
	
	/*
	public User(String id, String job) {
		this(id, job, 1, 0);//생성자 연계 코드
	}
	*/
	
	public Charactor(String id, String job, int level, int money) {
		this.setId(id);
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setJob(String job) {
		switch(job) {
		case "전사":
		case "마법사":
		case "궁수":
			this.job = job;
		}
	}
	
	public void setLevel(int level) {
		if(level < 1) return;
		this.level = level;
	}

	public void setMoney(int money) {
		if(money < 0) return;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public String getJob() {
		return job;
	}

	public int getLevel() {
		return level;
	}

	public int getMoney() {
		return money;
	}
	
	public void out() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("직 업 : " + this.job);
		System.out.println("레 벨 : " + this.level);
		System.out.println("소지금 : " + this.money + "G");
		System.out.println();
	}
	
	public void levelUp() {
		this.level ++;
	}
	
	public void levelUp(int level) {
		this.level += level;
	}

}

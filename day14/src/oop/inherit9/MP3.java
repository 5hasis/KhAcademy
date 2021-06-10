package oop.inherit9;

public class MP3 extends MediaFile{
	
	//추가되는 멤버 변수를 구현
	private int duration;
	
	//생성자를 부모클래스에 맞추되, 추가된 항목도 설정 가능하도록 구현
	public MP3(String filename) {
		super(filename);
	}
	
	public MP3(String filename, long filesize, int duration) {
		super(filename, filesize);
		this.duration = duration;
	}

	@Override
	public void forward() {
		System.out.println("음악을 빨리감기 합니다");
	}
	@Override
	public void rewind() {
		System.out.println("음악을 되감기 합니다");
	}
	@Override
	public void execute() {
		System.out.println("음악 재생을 시작합니다. 총 재생시간 "+this.duration+"초");
	}
	
}


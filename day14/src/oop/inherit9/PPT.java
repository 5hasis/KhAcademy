package oop.inherit9;

public class PPT extends File{
	
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if(size < 1) return;
		this.size = size;
	}

	public PPT(String filename) {
//		super(filename, 0L);
//		this.setSize(1);t
		this(filename, 0L, 1);
	}
	public PPT(String filename, long filesize, int size) {
		super(filename, filesize);
		this.setSize(size);
	}
	
	@Override
	public void execute() {
		System.out.println("파워포인트 애니메이션을 재생합니다");
	}
	
	public void information() {
		System.out.println("<PPT 정보>");
		System.out.println("이름 : " + super.filename);
		System.out.println("크기 : " + super.filesize+" bytes");
		System.out.println("장수 : " + this.size + "장");
	}
	
}
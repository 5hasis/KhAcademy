package oop.inherit9;

public abstract class File {
	//멤버 변수
	protected String filename;
	protected long filesize;
	
	//생성자 : filename은 필수가 되도록 생성방법을 정의
	public File(String filename) {
		this.setFilename(filename);
		this.setFilesize(0L);
//		this(filename, 0L);
	}
	public File(String filename, long filesize) {
		this.setFilename(filename);
		this.setFilesize(filesize);
	}
	
	//멤버 메소드
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getFilesize() {
		return filesize;
	}
	public void setFilesize(long filesize) {
		if(filesize < 0) return;
		this.filesize = filesize;
	}
	
	//추상 메소드
	public abstract void execute();
	
}



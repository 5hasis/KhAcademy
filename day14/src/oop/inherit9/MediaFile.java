package oop.inherit9;

public abstract class MediaFile extends File{

	//생성자는 부모 클래스에 맞춘다
	public MediaFile(String filename) {
		super(filename);
	}
	public MediaFile(String filename, long filesize) {
		super(filename, filesize);
	}
	
	//추가 기능 : 빨리감기, 되감기
	public abstract void forward();
	public abstract void rewind();

}
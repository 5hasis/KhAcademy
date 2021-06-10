package oop.inherit8;

public class Monitor extends Display{

	@Override
	public void color() {
		System.out.println("모니터를 컬러모드로 전환합니다");
	}

	@Override
	public void grayscale() {
		System.out.println("모니터를 흑백으로 전환합니다");
	}

	@Override
	public void on() {
		System.out.println("모니터 전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("모니터 전원을 끕니다");
	}

}
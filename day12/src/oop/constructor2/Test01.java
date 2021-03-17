package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {

		Charactor pororo = new Charactor("뽀로로", "전사", 50, 50000);
		Charactor crong = new Charactor("크롱", "마법사", 35, 20000);
		Charactor loopy = new Charactor("루피", "전사");

		pororo.out();
		crong.out();
		loopy.out();

		// Q : 뽀로로를 레벨업해보세요!
		// pororo.level ++;
		// pororo.setLevel(a.getLevel() + 1);
		pororo.levelUp();

		// Q : a를 5레벨업 해보세요!
		pororo.levelUp(5);

		pororo.out();
	}

}

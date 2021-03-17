package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		Hotel a = new Hotel();
		Hotel b = new Hotel();
		Hotel c = new Hotel();
		
		a.set("스탠다드룸", 4, 100000, 200000, 250000);
		b.set("슈페리어룸", 4, 150000, 250000, 300000);
		c.set("디럭스룸", 6, 300000, 450000, 550000);
		
		a.out();
		b.out();
		c.out();
		
//		int avgStandard = (a.low + a.semiPeak + a.peak) / 3;
//		int avgDeluxe = (c.low + c.semiPeak + c.peak) / 3;
//		int difference = avgDeluxe - avgStandard;
		int difference = a.getAverage() - c.getAverage();
		System.out.println("디럭스룸과 스탠다드룸 평균 가격 차이 : " + difference + "원");
		
		//절대값처리
		int diff;
		if(a.getAverage() > c.getAverage()) {
			diff = a.getAverage() - c.getAverage();
		}
		else
			diff = c.getAverage() - a.getAverage();
	}
}

package study.beans;

public class HintDto {

	private String hintContent;
	private int quizNo;
	private int hintNo;
	
	public HintDto() {
		super();
	}
	
	public String getHintContent() {
		return hintContent;
	}
	
	public void setHintContent(String hintContent) {
		this.hintContent = hintContent;
	}
	
	public int getQuizNo() {
		return quizNo;
	}
	
	public void setQuizNo(int quizNo) {
		this.quizNo = quizNo;
	}
	
	public int getHintNo() {
		return hintNo;
	}
	
	public void setHintNo(int hintNo) {
		this.hintNo = hintNo;
	}
	
	@Override
	public String toString() {
		return "HintDto [hintContent=" + hintContent + ", quizNo=" + quizNo + ", hintNo=" + hintNo + "]";
	}
	
	
}

package beans;

// DTO
// = Data Transfer Object
// = 포장용 클래스
// = DB의 1줄을 옮겨닮을 수 있는 클래스

public class ProductDto {

	private String name;
	private String type;
	private int price;
	private String made;
	private String expire;
	
	public ProductDto() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}
	
	
	
}

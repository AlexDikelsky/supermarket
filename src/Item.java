import java.math.BigDecimal;

public class Item implements Identifyable {
	private String name;
	private BigDecimal price; // I've heard that money shouldn't be represented as doubles because
	// of precision errors
	private int stock;
	String identificationNumber; 
	
	public boolean equals(Item other) {
		return this.identificationNumber.contentEquals(other.getIdentificationNumber());
	}
	
	public Item(String idString) {
		this.identificationNumber = idString;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", stock=" + stock + ", identificationNumber="
				+ identificationNumber + "]";
	}

	public Item(String name, BigDecimal price, int stock, String identificationNumber) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.identificationNumber = identificationNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
}

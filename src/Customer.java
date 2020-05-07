
public class Customer implements Identifyable {
	private String identificationNumber;
	private String name;
	
	
	@Override
	public String toString() {
		return "Customer [identificationNumber=" + identificationNumber + ", name=" + name + "]";
	}

	public boolean equals(Item other) {
		return this.identificationNumber.contentEquals(other.getIdentificationNumber());
	}
	
	public Customer(String id) {
		identificationNumber = id;
	}
	
	public Customer(String identificationNumber, String name) {
		super();
		this.identificationNumber = identificationNumber;
		this.name = name;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

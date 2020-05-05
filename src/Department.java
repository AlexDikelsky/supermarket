
public class Department implements Identifyable {
	String name;
	String identificationNumber;
	
	
	public boolean equals(Item other) {
		return this.identificationNumber.contentEquals(other.getIdentificationNumber());
	}
	
	

	@Override
	public String toString() {
		return "Department [name=" + name + ", identificationNumber=" + identificationNumber + "]";
	}



	public Department(String i) { this.identificationNumber = i; }
	
	
	public Department(String name, String identificationNumber) {
		super();
		this.name = name;
		this.identificationNumber = identificationNumber;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
}

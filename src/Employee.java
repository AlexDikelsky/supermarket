
public class Employee implements Identifyable {
	private String name;
	private String identificationNumber;
	private Department dept;
		
	public boolean equals(Employee other) {
		return this.identificationNumber
				.contentEquals(other.getIdentificationNumber());
	}
	
	public Employee(String identificationNumber) {
		super();
		this.identificationNumber = identificationNumber;
	}

	public Employee(String name, String identificationNumber, Department dept) {
		super();
		this.name = name;
		this.identificationNumber = identificationNumber;
		this.dept = dept;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}

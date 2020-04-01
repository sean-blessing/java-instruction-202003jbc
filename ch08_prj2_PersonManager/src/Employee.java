
public class Employee extends Person {
	private String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public Employee() {
		super();
	}

	// requirement:  mask ssn as xxx-xx-ssn
	public String getSsn() {
		String last4 = ssn.substring(7);
		return "xxx-xx-"+last4;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSSN: " + getSsn();
	}
	
	

}

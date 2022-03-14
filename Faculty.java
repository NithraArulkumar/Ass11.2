// Implement Faculty class
public class Faculty extends Employee {
	// Data fields
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phone, String email, int office, double salary,
			String officeHours, String rank) {
		super(name, address, phone, email, office, salary);

		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		System.out.println("Class name is " + this.getClass() + "name " + this.getName());
		
		//System.out.println("name" + name +" " + "Class name is Faculty");

		//return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;

	}

}

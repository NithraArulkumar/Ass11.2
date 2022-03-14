// Implement Staff class

public class Staff extends Employee {
	private String title;

	public Staff(String name) {
		super(name, address);
		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Return a string description of the class
	public String toString() {
		
		System.out.println("name" + this.getName() + " " + "Class name is " + this.getClass());
	}

}

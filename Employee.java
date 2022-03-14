// Implement Employee class

public class Employee extends Person {

	private int office;
	private double salary;
	private java.util.Calendar dateHired;
	
	public Employee() {
		dateCreated = new java.util.Date();

	}

	// Construct Employee object
	public Employee(String name) {
		super(name);
		dateCreated = new java.util.Date();
	}
    //override toString
	public String toString() {
		System.out.println("name" + name +" " + "Class name is Employee");

	}

}

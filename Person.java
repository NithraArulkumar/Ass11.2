//****************************************
// Student Name: Sony Mekala 
// COSC 211 
// Assignment Programming Exercise 11.2
// *****************************************

//Person class
public class Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	// Construct default Person object
	public Person() {
		
	}

	// Construct Person object with specified name, address, phone and email
	public Person(String name) {
		this.name = name;
		}

	// Return name
	public String getName() {
		return name;
	}

	// Return a string discription of the class
	public String toString() {
			
		return "Class name is " + this.getClass() + " " + 
		"name: " + this.getName();

	}

}

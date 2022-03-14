// Implement Student class
public class Student extends Person {
	public final int status;
	public static final int FRESHMAN = 1;
	public static final  int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;

	public Student(String name) {
	super(name);
    }
 
	// Return a string discription of the class
	public String toString() {
	
		System.out.println("Class name is " + this.getClass() + " " +
	super.toString());

}

}

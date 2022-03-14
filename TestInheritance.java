
public class TestInheritance {

	// Main method
	public static void main(String[] args) {
//			//Person p = new Person("Solomon", "12 Belt street", "2435647777", "solomon07@cta.com");
//			Student s = new Student("Michel", "Canty dr 205", "2355625672", "michel12@mail.com" ,Studnet.JUNIOR );
//			s.toString();
//			Person e = new Employee();
//			e.toString();
//			Employee f = new Faculty();
//			f.toString();
//			Employee s = new Staff();
//			s.toString();
//			

		Person person = new Person("Solomon");
		Student student = new Student("Michel")
        Employee employee = new Employee("Nelson");
        Faculty faculty = new Faculty("Larence");
		Staff staff = new Staff("Ben");

		
				
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}

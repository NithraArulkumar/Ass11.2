import java.time.LocalDate;

public class MyDate {

	private int year;
	private int month;
	private int day;

	public MyDate() {
		// GregorianCalendar date = new GregorianCalendar();

		LocalDate now = LocalDate.now();

		// System.out.println(now);
		// Find year, month, and day from date. You write your own code to replace the
		// out-dated get methods
		year = now.getYear();
		month = now.getMonthValue();
		day = now.getDayOfMonth();

//		this.year = year;
//		this.month = month;
//		this.day = day;
	}

	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	// Sets a new date for the object using the elapsed time

	public void setDate(long elapsedTime) {
//		Date today = Calendar.getInstance().getTime();
//		today.setDate(16);
		LocalDate calander = LocalDate.now();
		calander.setTimeInMillis(elapsedTime);
		year = calander.getYear();
		month = calander.getMonthValue();
		day = calander.getDayOfMonth();

	}
}

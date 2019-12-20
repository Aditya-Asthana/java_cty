/*
 * Author: Aditya Asthana
 * Date class
 */
public class Date {

	private int day;
	private int month;
	private int year;

	// default constuctor
	public Date() {

	}

	// Constructor with members
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// get date as a String
	public String getDateString() {
		// return date as String
		return (month + "-" + day + "-" + year);
	}

	// Getters and Setters for day,month and year
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

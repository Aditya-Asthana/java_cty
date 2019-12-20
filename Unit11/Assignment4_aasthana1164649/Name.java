/*
 *  author: Aditya Asthana
 *  Name class
 */
public class Name {

	private String firstName;
	private String lastName;

	// Default Constuctor
	public Name() {

	}

	// Constructor
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getters and Setters
	public String getFullName() {
		return (this.firstName + " " + this.lastName);
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

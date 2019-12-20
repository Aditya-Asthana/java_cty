/*
 * author: Aditya Asthana
 * Superhero class
 */

public class SuperHero {

	private Name name;
	private Date birthday;
	private String suit;
	private String cape;
	boolean hasSuperPower;

	// default Constructor
	public SuperHero() {

	}

	// Constructor
	public SuperHero(Name name, Date birthday, String suit, String cape, boolean hasSuperPower) {
		this.name = name;
		this.birthday = birthday;
		this.suit = suit;
		this.cape = cape;
		this.hasSuperPower = hasSuperPower;
	}

	public String getSuperHeroDetails() {

		String details = "Name: " + this.getName().getFullName() + " Birthdate: " + this.getBirthday().getDateString()
				+ " Suit: " + this.getSuit() + " Cape: " + this.getCape() + " Superpowers: " + this.isHasSuperPower();
		return details;
	}

	// getter and setters
	public Name getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getSuit() {
		return suit;
	}

	public String getCape() {
		return cape;
	}

	public boolean isHasSuperPower() {
		return hasSuperPower;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setCape(String cape) {
		this.cape = cape;
	}

	public void setHasSuperPower(boolean hasSuperPower) {
		this.hasSuperPower = hasSuperPower;
	}

}

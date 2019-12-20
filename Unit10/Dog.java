
/* 
 * author: Aditya Asthana
 * Defines the doc class
 */
public class Dog {
	
	//dog Data
	private String name;
	private String breed;
	private char gender; //M = MALE, F = FEMALE
	private int age;
	private double weight;
	private boolean hasFleas;
	
	//default constructors
	public Dog() {
		name = "Unknown";
		breed = "Unknown";
		gender = 'M';
		age = 0;
		weight = 0;
		hasFleas = false;
	}
	
	//Constuctors with parameters
	public Dog(String name, String breed, char gender, int age, double weight, boolean hasFleas) {
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.hasFleas = hasFleas;
	}

	
	//Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean getHasFleas() {
		return hasFleas;
	}
	
	public void setHasFleas(boolean hasFleas) {
		this.hasFleas = hasFleas;
	}
	
	
	//Dog eating
	public String eating() {
		return "Chomp, Chomp Chomp!!";
	}
	
	//Dog barking
	public String  barking() {
		return "Woof, Woof, Woof!!";
	}
	
	//Dog sratching
	public String scratching() {
		if (hasFleas == true) {
			return "Itch, Itch, Itch!!";
		}
		return "I don't scratch";
	}


	
}

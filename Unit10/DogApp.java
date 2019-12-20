/*
 * author: Aditya Asthana
 * 
 */
public class DogApp {

	public static void main(String[] args) {
		
		//Dog created with multiple argument constructor
		Dog myDog = new Dog("Tommy", "German Shepherd", 'M', 15, 55, false);
		
		//Dog created with default constructor
		Dog anotherDog = new Dog();
		
		//Call setters to set dog data
		anotherDog.setName("Max");
		anotherDog.setBreed("Golden Retrever");
		anotherDog.setGender('F');
		anotherDog.setAge(16);
		anotherDog.setWeight(70);
		anotherDog.setHasFleas(true);
		
		//Print both dog details
		System.out.println("Details of myDog:");
		printDogDetails(myDog);
		System.out.println();
		System.out.println("******************");
		System.out.println();
		System.out.println("Details of anotherDog:");
		printDogDetails(anotherDog);

		

	}

	//Method to print dog details
	public static void printDogDetails(Dog d) {
		
			System.out.println( "Dog [name=" + d.getName() + ", breed=" + d.getBreed() + ", gender=" + d.getGender()+ ", age=" + d.getAge() + ", weight=" + d.getWeight()
					+ ", hasFleas=" + d.getHasFleas() + "]");
			System.out.println("Dog eating noise: " + d.eating());
			System.out.println("Dog barking noise: " + d.barking());
			System.out.println("Dog scratching noise: " + d.scratching());
		}

	
}

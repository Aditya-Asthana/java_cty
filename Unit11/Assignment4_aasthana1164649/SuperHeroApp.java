/*
 * Author: Aditya Asthana
 * This Class calls the 
 */

public class SuperHeroApp {

	public static void main(String[] args) {

		Name superHeroName;
		Date superHeroBday;
		SuperHero[] mySuperHeros = new SuperHero[5];
		String[] firstName = { "Luke", "Han", "Obi Wan", "Anakin", "Mace" };
		String[] lastName = { "Skywalker", "Solo", "Kenobi", "Skywalker", "Windu" };
		int[] days = { 5, 15, 16, 19, 28 };
		int[] months = { 1, 3, 7, 8, 10 };
		int[] years = { 1903, 1845, 1946, 2005, 1996 };
		String[] suits = { "Robes", "Armor", "Hood", "Fancy", "Casual" };
		String[] capes = { "Black cape", "Brown Cape", "Red Cape", "Long Cape", "Short Cape" };

		for (int i = 0; i < 5; i++) {

			// Set super hero's name, birthdate, suit, cape and superpowers
			superHeroName = new Name(firstName[i], lastName[i]);
			superHeroBday = new Date(days[i], months[i], years[i]);

			mySuperHeros[i] = new SuperHero(superHeroName, superHeroBday, suits[i], capes[i], true);
			System.out.println(mySuperHeros[i].getSuperHeroDetails());
			System.out.println();
		}

		// Modify First Superhero suit, cape and powers
		mySuperHeros[0].setSuit("Clownsuit");
		mySuperHeros[0].setCape("redcape");
		mySuperHeros[0].setHasSuperPower(false);

		System.out.println("After modification of SuperHero 0");
		System.out.println(mySuperHeros[0].getSuperHeroDetails());
	}

}

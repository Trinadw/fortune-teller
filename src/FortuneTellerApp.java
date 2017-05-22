import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Ask the user for the user’s first name.
		System.out.println("What is your first name?");
		String nameFirst = input.nextLine();
		// Ask the user for the user’s last name.
		System.out.println("What is your last name?");
		String nameLast = input.nextLine();
		// Ask the user for the user’s age.
		System.out.println("What is your age?");
		int userAge = input.nextInt();
		int a = 2;
		int retire = userAge % a;

		// The user's number of years until retirement will be based on whether
		// the user's age is odd or even.
		String age = "";
		if (retire == 0) {
			age = "11 years";
		} else if (retire > 0) {
			age = "22 years";
		}

		// Ask the user for the user’s birth month (as an 'int').
		System.out.println("What is your birth month, as a number (1-12)?");
		int month = input.nextInt();

		// The user's bank balance at retirement will be based on the user's
		// birth month. If the user enters something other than 1-12 for
		// birth month, the user's balance will be $0.00.
		String birth = "";
		if (month > 0 && month < 4) {
			birth = "$23450";
		} else if (month > 4 && month < 9) {
			birth = "$3728";
		}

		else if (month > 8 && month < 13) {
			birth = "$2200";
		} else {
			birth = "$0";
		}
		// Ask the user for the user’s favorite ROYGBIV color.
		// If the user does not know what ROYGBIV is, ask the user to enter
		// “Help” to get a list of the ROYGBIV colors.
		System.out.println("What is your favorite ROYGBIV color? Enter \"Help\" to get a list of ROYGBIV colors.");
		String color = input.next();
		String transport = "";

		do {
			System.out.println(
					"Red, Orange, Yellow, Green, Blue, Indigo and Violet. What if your favorite ROYGBIV color?");

			color = input.next();

			switch (color.toLowerCase()) {

			case "red":
				transport = "car";
			case "orange":
				transport = "bike";
			case "yellow":
				transport = "train";
			case "green":
				transport = "trike";
			case "blue":
				transport = "plane";
			case "indigo":
				transport = "boat";
			case "violet":
				transport = "scooter";
			}
		} while (color.equalsIgnoreCase("help"));

		// Ask the user for the user's number of siblings.

		// The location of the user's vacation home will be based on how
		// many siblings the user has. If the user enters a number less than
		// zero, give the user a bad location!
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		String location = "";
		if (siblings == 0) {
			location = "Rome";
		} else if (siblings == 1) {
			location = "Malaga";
		} else if (siblings == 2) {
			location = "London";
		} else if (siblings == 3) {
			location = "Casablanca";
		} else if (siblings > 3) {
			location = "St. Croix";
		} else {
			location = "Syria";
		}

		System.out.println(nameFirst + " " + nameLast + " will retire in " + age + " with " + birth
				+ " in the bank, a vacation home in " + location + " and travel by " + transport + ".");

		input.close();

	}

}

package grandCircus.course;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Class Variables
		int userNum;
		String userName;
		boolean validNum;

		// Prompt User for name
		System.out.println("Please enter your name");
		userName = scnr.nextLine();

		do {
			// Prompt user for number
			System.out.println(userName + " Please enter a number between 1 and 100");
			userNum = scnr.nextInt();

			// Validate whether entered number is valid
			if (userNum >= 1 && userNum <= 100) {
				validNum = true;
				System.out.println(userName + " You have entered a valid number");
			} else {
				validNum = false;
				// have user enter valid number
				System.out.println(userName + " please enter valid number");
			}

		} while (validNum == false);

		// Conditional Statements to print odd or even numbers
		if ((userNum % 2 != 0) && (userNum <= 60)) {
			System.out.println(userName + " your number " + userNum + " is an odd number");
		} else if ((userNum % 2 == 0) && (userNum >= 2) && (userNum <= 25)) {
			System.out.println(userName + " your number " + userNum + " is Even and less than 25.");
		} else if ((userNum % 2 == 0) && (userNum >= 26) && (userNum <= 60)) {
			System.out.println(userName + " your number " + userNum + " is even");
		} else if ((userNum % 2 == 0) && (userNum > 60)) {
			System.out.println(userName + " your number " + userNum + " is even");

		} else if ((userNum % 2 != 0) && (userNum > 60)) {
			System.out.println(userName + " your number " + userNum + " is odd and over 60");

		}
	}

}

import java.util.Scanner;

/*
 * @published by James McDowell
 */

public class OddsAndEvens {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int userNum;
		String userName;
		int isOdd;
		char userInput = 'y';
				
		System.out.println("Hello, welcome to my app.  What is your name?");
		userName = scnr.nextLine();
		
		while (userInput == 'y') {
			
		System.out.println("Pick a number between 1 and 100?");
		userNum = scnr.nextInt();
		
		isOdd = (userNum % 2);
		
		if (userNum > 100 || userNum < 1) {
			System.out.println("That number does not fit the criteria.");
		}
		else if (isOdd == 1) {
			if (userNum >60) {
				System.out.println(userName + " your number is odd and over 60");
			}
			else {
				System.out.println(userName + "your number is " + userNum + " and odd");
			}
		}
		
		else if (userNum < 25) {
			System.out.println(userName + "your number is even and less than 25");
		}
		
		else if (userNum <= 60) {
			System.out.println(userName + "your number is even");
		}
		
		else {
			System.out.println(userName + "your number is " + userNum + " and even");
		}
		
		System.out.println("Would you like to try again?  y or n");
		userInput = scnr.next().charAt(0);
		}
		System.out.println("Thanks for playing, goodbye.");
	}

}

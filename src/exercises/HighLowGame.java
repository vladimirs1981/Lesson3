package exercises;

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int tries = 5;
		int answer = rand.nextInt(100);
		for (int i = 0; i < 5; i++) {
			System.out.println("Guess a number: ");
			int number = sc.nextInt();
			tries--;
			if (tries == 0) {
				System.out.println("You lose");
				break;
			}
			if (number == answer) {
				System.out.println("Correct, you pick a right number!");
				break;
			} else if (number > answer) {
				System.out.println("To high, " + tries + " more tries");
			} else {
				System.out.println("To low, " + tries + " more tries");

			}

		}

	}

}

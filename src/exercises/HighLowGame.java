package exercises;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int tries = 5;
		int answer = rand.nextInt(100);
		JOptionPane.showMessageDialog(null, "Good luck picking a number");
		for (int i = 0; i < 5; i++) {
			String number = JOptionPane.showInputDialog(null, "Guess a number");
			int numberAsInt = Integer.parseInt(number);
			tries--;
			if (tries == 0) {
				JOptionPane.showMessageDialog(null, "You Lose!");
				break;
			}
			if (numberAsInt == answer) {
				JOptionPane.showMessageDialog(null, "Correct, you pick a right number!");
				break;
			} else if (numberAsInt > answer) {
				JOptionPane.showMessageDialog(null, "To high, " + tries + " more tries");
			} else {
				JOptionPane.showMessageDialog(null, "To low, " + tries + " more tries");
			}

		}

	}

}

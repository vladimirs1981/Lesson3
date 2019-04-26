package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int randomNumber = new Random().nextInt(5);
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You're amazing person!");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You look great, do you workout?");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You're beautiful!");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "You're smart and confident person!");
			} else {
				JOptionPane.showMessageDialog(null, "You got great personality");
			}
		}
	}
}

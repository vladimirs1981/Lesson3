package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog(null, "Are you happy?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else if (answer.equals("no")) {
			String answer1 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (answer1.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else if (answer1.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Wrong input");
		}

	}
}

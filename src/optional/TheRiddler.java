package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String answer = JOptionPane.showInputDialog(null,
				"What is greater than God,\r\n" + "more evil than the devil,\r\n" + "the poor have it,\r\n"
						+ "the rich need it,\r\n" + "and if you eat it, you'll die? ");

		if (answer.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Answer is: nothing");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		String answer1 = JOptionPane.showInputDialog(null,
				"What can travel around the world while staying in a corner? ");
		if (answer1.equals("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Answer is: stamp");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		String answer2 = JOptionPane.showInputDialog(null, "What has hands but can not clap?");
		if (answer2.equals("clock")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Answer is: clock");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		String answer3 = JOptionPane.showInputDialog(null, "What has an eye but can not see? ");
		if (answer3.equals("needle")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Answer is: needle");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		String answer4 = JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly? ");
		if (answer4.equals("incorrectly")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Answer is: incorrectly");
		}
		JOptionPane.showMessageDialog(null, "Final score: " + score);

	}
}

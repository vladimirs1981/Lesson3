package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "November 21th";
		String dadsBirthday = "October 23th";
		String myBirthday = "May 24th";

		String birthday = JOptionPane.showInputDialog(null, "Whose birthday do you want?");
		JOptionPane.showMessageDialog(null, birthday);

		if (birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (birthday.equals("vladimir")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}

	}
}

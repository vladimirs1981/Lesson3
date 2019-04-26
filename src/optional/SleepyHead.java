package optional;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		int answer = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		if (answer == 1) {
			JOptionPane.showMessageDialog(null, "sleep");

		} else {
			int answer1 = JOptionPane.showConfirmDialog(null, "are you on vacation?", "", JOptionPane.YES_NO_OPTION);
			if (answer1 == 0)
				JOptionPane.showMessageDialog(null, "sleep");
			else {
				JOptionPane.showMessageDialog(null, "get up lazybones!");
			}
		}

	}
}

package optional;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot cyborg = new Robot();
		for (int j = 0; j < 10; j++) {

			String color = JOptionPane.showInputDialog(null,
					"What color would you like?(red, blue, green or just hit enter)");

			if (color.equals("red")) {
				cyborg.setPenColor(Color.red);
			} else if (color.equals("blue")) {
				cyborg.setPenColor(Color.blue);
			} else if (color.equals("green")) {
				cyborg.setPenColor(Color.green);
			} else if (color.isBlank()) {
				cyborg.setRandomPenColor();
			} else {
				JOptionPane.showMessageDialog(null, "Not valid color");
			}

			cyborg.setSpeed(15);
			cyborg.setPenWidth(10);
			cyborg.penDown();
			for (int i = 0; i < 8; i++) {
				cyborg.move(70);
				cyborg.turn(45);
			}
		}

	}
}

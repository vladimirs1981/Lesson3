package optional;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {

		String hours = JOptionPane.showInputDialog(null, "How many hours you spent coding this week?");
		int hoursAsInt = Integer.parseInt(hours);

		if (hoursAsInt >= 3 && hoursAsInt < 5) {
			JOptionPane.showMessageDialog(null, "You're a Code Ninja!");
		} else if (hoursAsInt < 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead!");
		} else if (hoursAsInt > 5) {
			playBatmanTheme();
		} else {
			JOptionPane.showMessageDialog(null, "Try harder!");
		}

	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

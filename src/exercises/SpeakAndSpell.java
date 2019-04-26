package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. It was my
 * favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		int score = 0;
		speak("mandlebrot");
		String answer = JOptionPane.showInputDialog(null, "Spell the word: ");

		if (answer.equals("mandlebrot")) {
			speak("correct");
			score++;
		} else {
			speak("wrong");
			score--;
		}

		speak("rmplstilski");
		String answer1 = JOptionPane.showInputDialog(null, "Spell the word: ");
		if (answer1.equals("rmplstilski")) {
			speak("correct");
			score += 2;
		} else {
			speak("wrong");
			score--;
		}

		speak("hakunamatata");
		String answer2 = JOptionPane.showInputDialog(null, "Spell the word: ");
		if (answer2.equals("hakunamatata")) {
			speak("correct");
			score += 3;
		} else {
			speak("wrong");
			score--;
		}
		speak("arnold schwarzenegger");
		String answer3 = JOptionPane.showInputDialog(null, "Spell the word: ");
		if (answer3.equals("je")) {
			speak("correct");
			score += 5;
		} else {
			speak("wrong");
			score--;
		}
		JOptionPane.showMessageDialog(null, "Your final score was" + score);


	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}

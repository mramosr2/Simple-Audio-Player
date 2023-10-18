
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	Scanner scanner = new Scanner(System.in);
		File f = new File("YourFile.wav");
		AudioInputStream as = AudioSystem.getAudioInputStream(f);
		Clip c = AudioSystem.getClip();
		c.open(as);
		
		String r = " ";
		r = r.toUpperCase();
		
		while(!r.equals("Q")) {
			System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter a character: ");
			
			r = scanner.next();
			r = r.toUpperCase();
			
			switch(r) {
			case ("P"): c.start();
			break;
			case ("S"): c.stop();
			break; 
			case ("R"): c.setMicrosecondPosition(0);
			break;
			default: System.out.println("Not a valid response do it again: ");
			
			}
		}
		}

}

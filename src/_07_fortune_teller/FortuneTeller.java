package _07_fortune_teller;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

	JFrame jf = new JFrame();

	int frameWidth = 500;
	int frameHeight = 500;

	FortuneTeller() throws Exception {
		// 1. Choose an image for your fortune teller and put it in your default package
		fortuneTellerImage = ImageIO.read(getClass().getResource("fortune teller.png"));
		// 2. Adjust the frameWidth and frameHeight variables to fit your image nicely
		// (doesn’t need a new line of code)
		// 3. Complete the begin() method in the FortuneTellerRunner class|

		// 4. add a mouse listener to the frame
		jf.addMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		// 5. Print the mouseX variable
		System.out.println(mouseX + " " + mouseY);
		// 6. Add the mouseY variable to the previous line so that it prints out too (no
		// new line)
		// 7. Adjust your secret location co-ordinates here:
		int secretLocationX = 246;
		int secretLocationY = 379;
		/**
		 * If the mouse co-ordinates and secret location are close, we'll let them ask a
		 * question.
		 */
		if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
			// 8. Get the user to enter a question for the fortune teller
			JOptionPane.showInputDialog("WHAT IS YOUR QUESTION TO THE GREAT FORTUNE TELLER ELAVRINI??");
			// 9. Find a spooky sound and put it in your default package (freesound.org)
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("creepy-noise.wav"));
			// 10. Play the sound
			sound.play();
			// 11. Use the pause() method below to wait until your music has finish
			pause(3);
			// 12. Insert your completed Magic 8 ball code here
			int rd = new Random().nextInt(4);
// 3. Print out this variable
			System.out.println(rd);

// 5. If the random number is 0
			if (rd == 0) {
				JOptionPane.showMessageDialog(null, "Yes");
			}
// -- tell the user "Yes"

// 6. If the random number is 1
			else if (rd == 1) {
				JOptionPane.showMessageDialog(null, "No");
			}

// 7. If the random number is 2
			else if (rd == 2) {
				JOptionPane.showMessageDialog(null, "How would I know???? Ask google!!");
			}
// -- tell the user "Maybe you should ask Google?"

// 8. If the random number is 3
			else if (rd == 3) {
				JOptionPane.showMessageDialog(null, "THE MREEP GODS SAY NO! BEGONE FOUL MORTAL");
			}
		}

	}

	private boolean areClose(int mouseX, int secretLocationX) {
		return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
	}

	private void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**************** don't worry about the stuff under here *******************/

	BufferedImage fortuneTellerImage;

	@Override
	public void run() {
		jf.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
	}

	private void showAnotherImage(String imageName) {
		try {
			fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fortuneTellerImage, 0, 0, null);
	}

}
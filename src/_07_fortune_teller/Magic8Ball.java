package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rd = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(rd);
	

	// 5. If the random number is 0
if (rd == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
else if (rd==1) {
	JOptionPane.showMessageDialog(null, "No");
}

	// 7. If the random number is 2
else if (rd==2) {
	JOptionPane.showMessageDialog(null, "How would I know???? Ask google!!");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
else if (rd==3) {
JOptionPane.showMessageDialog(null, "THE MREEP GODS SAY NO! BEGONE FOUL MORTAL");
}
	// -- write your own answer
}
}



/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {

public static void main(String[] args) {
	int nume=2016;
	String age=JOptionPane.showInputDialog("how old are you");
int num=Integer.parseInt(age);
	if (num<30) {
		JOptionPane.showMessageDialog(null, nume-num);
		
	}
	else {
		JOptionPane.showMessageDialog(null, "you are too old to play");
	}
		
}
}





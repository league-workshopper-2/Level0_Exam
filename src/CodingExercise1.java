/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String color=JOptionPane.showInputDialog("pick a color: red or blue");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}
		else {
			Tortoise.setPenColor(Color.red);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		Tortoise.move(200);
		Tortoise.turn(90);
		Tortoise.move(200);
		Tortoise.turn(90);
		Tortoise.move(200);
		Tortoise.turn(90);
		Tortoise.move(200);
	}
}




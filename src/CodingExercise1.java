import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 Robot rob = new Robot();
   rob.setSpeed(10);
   rob.penDown();
   String answer;
   	 // 3. ask the user what color they would like the Robot to draw
answer = JOptionPane.showInputDialog("What color would you like the robot to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(answer.equalsIgnoreCase("red")) {
	rob.setPenColor(192, 57,43);
}
else if(answer.equalsIgnoreCase("blue")) {
	rob.setPenColor(52, 152, 219);
}
else if(answer.equalsIgnoreCase("green")) {
	rob.setPenColor(39, 174, 96);
}
else if(answer.equalsIgnoreCase("orange")) {
	rob.setPenColor(230, 126, 34);
}
else {
	JOptionPane.showMessageDialog(null, "I don't know that color!");
}
   	 // 2. set the pen width to 10
rob.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   for(int i = 0; i < 4; i++) {
   	 rob.move(90);
   	 rob.turn(90);
    }
    }
}

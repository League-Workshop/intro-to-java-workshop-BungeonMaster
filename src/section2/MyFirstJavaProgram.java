package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot rob = new Robot();
		int speed = 100;
		speed += 50;
		speed -= 50;
		speed *= 10;
		speed /= 5;
		
		rob.penDown();
		rob.setSpeed(speed);
		
		for (int i = 0; i < 4; i++) {
			
			rob.move(100);
			rob.turn(90);
			
		}
		
	}
}

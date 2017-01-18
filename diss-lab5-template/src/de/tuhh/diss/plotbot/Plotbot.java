package de.tuhh.diss.plotbot;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class Plotbot {
	public static void main(String[] args)
	{
		// Some example code to check if the build process works
		LCD.drawString("Compiled successfully", 0, 0);
		LCD.drawString("Good Luck!", 0, 1);
		Button.ESCAPE.waitForPressAndRelease();
		
		//Call your MainMenu from here after you deleted the example code
		//MainMenu myMainMenu = new MainMenu();
		//Plottable s = myMainMenu.select();
		//TODO: Call methods to plot the selected shape. Be careful to not draw anything, if the robot angles are not yet calibrated!
		PlotbotControl controlBot =new PlotbotControl();
		controlBot.penSensorCalibration();
		controlBot.armSensorCalibration();
		controlBot.lightSensorCalibration();
		while(Motor.A.isMoving() || Motor.B.isMoving() || Motor.C.isMoving()){
			
		}
		//Motor.A.backward();
		//Motor.B.backward();
		
	}
	
}

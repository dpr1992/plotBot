package de.tuhh.diss.plotbot;

import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

/**
 * This Class is used for control of the plotting robot. A great amount of time should spend for controlling the robot.
 * Add a suitable constructor and add further methods you need for driving the motors, evaluating the sensors etc.
 * 
 * Hint: Create an instance of PlotBotControl inside the class Plotbot and  * pass the PlotBotControl when calling the
 * method plot of the selected shape.
 */
public class PlotbotControl {
		LightSensor Light = new LightSensor(SensorPort.S3);
		TouchSensor armTouch = new TouchSensor(SensorPort.S1);
		TouchSensor penTouch = new TouchSensor(SensorPort.S1);
		private int maxArmAngle;
		private int maxPenAngle;
	public void lightSensorCalibration(){
		Motor.C.setSpeed(200);
		Motor.C.backward();
		for(int i=0;i<1000;i++){
			
		}
		while(Motor.C.isMoving()){
			if(Light.getNormalizedLightValue()>520){
				LCD.drawInt(Light.getNormalizedLightValue(), 0, 5);
			}
			else{
				break;
			}
		}
		Motor.C.stop();
	}
	public void armSensorCalibration(){
		Motor.A.setSpeed(200);
		Motor.A.forward();
		Motor.A.resetTachoCount();
		while(!armTouch.isPressed()){
			Motor.A.stop();
		}
        maxArmAngle = Motor.A.getTachoCount();
        Motor.A.rotate(maxArmAngle,true);
		
	}
	public void penSensorCalibration(){
		Motor.B.setSpeed(200);
		Motor.B.forward();
		Motor.B.resetTachoCount();
		while(!penTouch.isPressed()){
			Motor.A.stop();
		}
        maxPenAngle = Motor.A.getTachoCount();
        Motor.B.rotate(maxPenAngle,true);
		
	}
	
	public void delay(int value) {              // delay logic
		for(int i=0;i<value;i++){
			
		}
	}
	
}

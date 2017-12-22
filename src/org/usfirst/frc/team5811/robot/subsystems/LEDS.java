package org.usfirst.frc.team5811.robot.subsystems;


import org.usfirst.frc.team5811.robot.Robot;
import org.usfirst.frc.team5811.robot.RobotMap;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LEDS extends Subsystem {
	
	static I2C LEDArduino = RobotMap.arduino;
	static byte[] toSend = new byte[1];
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public static void red(){
		toSend[0] = 3;
		System.out.println("Sending RED");
		if(LEDArduino.writeBulk(toSend)){
			System.out.println("didnt send");
		}
		else{
			System.out.println("sent");
		}
	}
	public static void off(){
		toSend[0] = 10;
		System.out.println("Sending OFF");
		if(LEDArduino.writeBulk(toSend)){
			System.out.println("didnt send");
		}
		else{
			System.out.println("sent");
		}
	}

}

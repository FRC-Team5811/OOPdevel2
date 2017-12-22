package org.usfirst.frc.team5811.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5811.robot.RobotMap;

public class NavX extends Subsystem {
	static AHRS navX = RobotMap.navx;
	static float angle = (float)navX.getAngle();
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public static void grabValues(){
		System.out.println(angle + " degrees");
	}

}

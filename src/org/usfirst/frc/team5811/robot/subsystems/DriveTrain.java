package org.usfirst.frc.team5811.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5811.robot.RobotMap;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	static Victor motor0 = RobotMap.motor0;
	static Victor motor1 = RobotMap.motor1;
	static Victor motor2 = RobotMap.motor2;
	static Victor motor3 = RobotMap.motor3;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public static void run(double left, double right) {
		motor0.set(left);
		motor1.set(left);
		motor2.set(-right);
		motor3.set(-right);
		
	}
	public static void stop() {
		motor0.set(0);
		motor1.set(0);
		motor2.set(0);
		motor3.set(0);
	}
	public static void tankDrive(double x, double y){
		motor0.set(x);
		motor1.set(x);
		motor2.set(-y);
		motor3.set(-y);
	}
	public static void arcadeDrive(double turn, double throttle) {
		motor0.set(-throttle + turn);
		motor1.set(-throttle + turn);
		motor2.set(-throttle - turn);
		motor3.set(-throttle - turn);
		
	}
}

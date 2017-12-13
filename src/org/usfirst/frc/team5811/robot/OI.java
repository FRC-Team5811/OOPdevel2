package org.usfirst.frc.team5811.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

import org.usfirst.frc.team5811.robot.commands.ArcadeDrive;
import org.usfirst.frc.team5811.robot.commands.Stop;
import org.usfirst.frc.team5811.robot.commands.TankDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */


public class OI {
	static Joystick joy1 = new Joystick(0);
	JoystickButton a = new JoystickButton(joy1, 2);
	AxisButton leftJoyY = new AxisButton(joy1, 1);
	AxisButton leftJoyX = new AxisButton(joy1, 0);
	AxisButton rightJoyY = new AxisButton(joy1, 3);
	AxisButton rightJoyX = new AxisButton(joy1, 2);
	AxisButton righttrigger = new AxisButton(joy1, 5);
	
	
	public OI() {
		//leftaxis.whileHeld(new TankDrive());
		//rightaxis.whileHeld(new TankDrive());
		righttrigger.whileHeld(new Stop());
		leftJoyY.whileHeld(new ArcadeDrive());
		rightJoyX.whileHeld(new ArcadeDrive());
		leftJoyX.whileHeld(new ArcadeDrive());
		rightJoyY.whileHeld(new ArcadeDrive());
	}
	
	public static double getLeftY() {
		return joy1.getRawAxis(1);
	}
	public static double getRightY() {
		return joy1.getRawAxis(3);
	}
	public static double getLeftX(){
		return joy1.getRawAxis(0);
	}
	public static double getRightX(){
		return joy1.getRawAxis(2);
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}

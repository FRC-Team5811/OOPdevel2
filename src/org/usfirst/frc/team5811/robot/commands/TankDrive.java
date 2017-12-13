package org.usfirst.frc.team5811.robot.commands;

import org.usfirst.frc.team5811.robot.OI;
import org.usfirst.frc.team5811.robot.Robot;
import org.usfirst.frc.team5811.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {
	public TankDrive() {
		requires(Robot.exampleSubsystem);

	}

	
	protected void execute() {
		ExampleSubsystem.tankDrive(OI.getRightAxis(), OI.getLeftAxis());
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}

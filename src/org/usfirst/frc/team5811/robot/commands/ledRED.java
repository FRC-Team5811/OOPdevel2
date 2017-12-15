package org.usfirst.frc.team5811.robot.commands;

import org.usfirst.frc.team5811.robot.subsystems.LEDS;

import edu.wpi.first.wpilibj.command.Command;

public class ledRED extends Command{
	protected void execute(){
		LEDS.red ();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}

package org.usfirst.frc.team4087.robot.commands;

import org.usfirst.frc.team4087.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Wrist extends Command {

	public Wrist() {
		requires(Robot.wrist);

	}

	protected void initialize() {

	}

	protected void execute() {

		move();
	}

	private void move() {

	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}

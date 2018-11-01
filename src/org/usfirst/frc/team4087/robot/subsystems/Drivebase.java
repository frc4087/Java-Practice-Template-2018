package org.usfirst.frc.team4087.robot.subsystems;

import org.usfirst.frc.team4087.robot.Robot;
import org.usfirst.frc.team4087.robot.RobotMap;
import org.usfirst.frc.team4087.robot.commands.CheesyDrive;
import org.usfirst.frc.team4087.robot.commands.DriveDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {
	
	private TalonSRX LeftMotor;
	private TalonSRX RightMotor;
	private TalonSRX LeftSlave;
	private TalonSRX RightSlave;
	
	public Drivebase() {
		
		LeftMotor = new TalonSRX(RobotMap.LEFT_MOTOR.value);
		RightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR.value);
		LeftSlave = new TalonSRX(RobotMap.LEFT_SLAVE.value);
		RightSlave = new TalonSRX(RobotMap.RIGHT_SLAVE.value);
		
		Robot.initTalon(LeftMotor);
		Robot.initTalon(LeftSlave);
		Robot.initTalon(RightMotor);
		Robot.initTalon(RightSlave);

		LeftSlave.follow(LeftMotor);
		RightSlave.follow(RightMotor);
		
	}
	
	public void tankDrive(ControlMode mode, double leftValue, double rightValue) {

		LeftMotor.set(mode, -leftValue);
		RightMotor.set(mode, rightValue);

	}

	@Override
	protected void initDefaultCommand() {
		
		setDefaultCommand(new DriveDrive());
		
	}

}

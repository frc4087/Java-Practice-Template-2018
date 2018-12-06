package org.usfirst.frc.team4087.robot.subsystems;

import org.usfirst.frc.team4087.robot.Robot;
import org.usfirst.frc.team4087.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Wrist extends Subsystem {
	
	private TalonSRX wristMotor;
	
	public Wrist() {
		
		wristMotor = new TalonSRX(RobotMap.WRIST.value);
		
		Robot.initTalon(wristMotor);
		
		
	}

	@Override
	protected void initDefaultCommand() {
		
	}

}

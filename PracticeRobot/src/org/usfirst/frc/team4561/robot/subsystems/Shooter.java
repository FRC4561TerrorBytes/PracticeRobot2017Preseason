package org.usfirst.frc.team4561.robot.subsystems;

import org.usfirst.frc.team4561.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	CANTalon shooterLeft = new CANTalon(RobotMap.LEFT_SHOOTER_MOTOR_PORT);
	CANTalon shooterRight = new CANTalon(RobotMap.RIGHT_SHOOTER_MOTOR_PORT);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
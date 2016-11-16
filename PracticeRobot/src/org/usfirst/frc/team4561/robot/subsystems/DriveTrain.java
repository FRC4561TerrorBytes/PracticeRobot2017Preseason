
package org.usfirst.frc.team4561.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4561.robot.RobotMap;
import org.usfirst.frc.team4561.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	CANTalon frontRight = new CANTalon(RobotMap.FRONT_RIGHT_MOTOR_PORT);
	CANTalon frontLeft = new CANTalon(RobotMap.FRONT_LEFT_MOTOR_PORT);
	CANTalon rearRight = new CANTalon(RobotMap.REAR_RIGHT_MOTOR_PORT);
	CANTalon rearLeft = new CANTalon(RobotMap.REAR_LEFT_MOTOR_PORT);
	
	RobotDrive robotDrive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TankDrive());
    	
    }
    
    public void driveTank(double leftPower, double rightPower) {
    	robotDrive.tankDrive(leftPower, rightPower);
    }
}


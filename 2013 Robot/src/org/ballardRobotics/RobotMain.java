/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.ballardRobotics;


import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotMain extends IterativeRobot {
    
    SpeedController leftDrive;
    SpeedController rightDrive;
    SpeedController roller;
    SpeedController shooter1;
    SpeedController shooter2;
    SpeedController shooter3;
    SpeedController shooterLift;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        roller = new Victor(3);
        //Jaguars can be linked to one pwm port
        leftDrive = new Jaguar(1);
        rightDrive = new Jaguar(2);
        //Talons can not be linked and must use seperate ports
        shooter1 = new Talon(4);
        shooter2 = new Talon(5);
        shooter3 = new Talon(6);
        //motor used to adjust angle of shooter & climbing pistons
        shooterLift = new Talon(7);
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    }
    
}
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
    
    //front left, front right, back left, and back right
    SpeedController FLDrive;
    SpeedController FRDrive;
    SpeedController BLDrive;
    SpeedController BRDrive;
    SpeedController roller;
    SpeedController shooter;
    SpeedController shooterLift1;
    SpeedController shooterLift2;
    DoubleSolenoid climbers;
    DoubleSolenoid loader;
    DoubleSolenoid pickup;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        roller = new Victor(6);
        //Jaguars can be linked to one pwm port
        shooter = new Jaguar(5);
        //Talons can not be linked and must use seperate ports
        FLDrive = new Talon(1);
        BLDrive = new Talon(2);
        FRDrive = new Talon(3);
        BRDrive = new Talon(4);
        //motor used to adjust angle of shooter & climbing pistons
        shooterLift1 = new Talon(7);
        shooterLift2 = new Talon(8);
        //pneumatics
        climbers = new DoubleSolenoid(1, 2);
        //pushes frisbees into shooter
        loader = new DoubleSolenoid(3, 4);
        //lowers or raises pickup device
        pickup = new DoubleSolenoid(5, 6);
        
        
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

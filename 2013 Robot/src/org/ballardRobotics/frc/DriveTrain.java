/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ballardRobotics.frc;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 * @author Team 2928
 */
public class DriveTrain {
    RobotDrive robotDrive;
    Joystick rightJoy;
            
    public DriveTrain(RobotDrive robotDrive, Joystick rightJoy){
        this.robotDrive = robotDrive;
        this.rightJoy = rightJoy;
    }
    public void periodic(){
        robotDrive.arcadeDrive(rightJoy);
    }
}

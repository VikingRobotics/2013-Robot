/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ballardRobotics.frc;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author Team 2928
 */
public class ShooterSubsystem {
    SpeedController leftMotor;
    SpeedController rightMotor;
    JoystickButton upButton;
    JoystickButton downButton;
    float launcherSpeed;
    
  public ShooterSubsystem(SpeedController leftMotor, SpeedController rightMotor, JoystickButton upButton, JoystickButton downButton){
      this.leftMotor = leftMotor;
      this.rightMotor = rightMotor;
      this.upButton = upButton;
      this.downButton = downButton;
  }
  
  public void periodic(){
      if(this.downButton.get() && !this.upButton.get()){
          leftMotor.set(-0.1);
          rightMotor.set(-0.1);
      } 
      else if(!this.downButton.get() && this.upButton.get()){
          leftMotor.set(0.1);
          rightMotor.set(0.1);
      } 
      else{
          leftMotor.set(0);
          rightMotor.set(0);      
      }
  }
}


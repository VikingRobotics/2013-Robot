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
public class RollerController {
    SpeedController motor1;
    JoystickButton forwardButton;
    JoystickButton backwardButton;
    double motor1ForwardSpeed = 0.5;
    double motor1BackwardSpeed = -0.5;
    
    
    
    public RollerController(SpeedController motor1, JoystickButton forwardButton, JoystickButton backwardButton){
        this.motor1 = motor1;
        this.forwardButton = forwardButton;
        this.backwardButton = backwardButton;
    }
    
    public void periodic(){
        if(this.forwardButton.get() && !backwardButton.get()){
            motor1.set(motor1ForwardSpeed);
        } 
        else if(!this.forwardButton.get() && backwardButton.get()){
            motor1.set(motor1BackwardSpeed);
        }
        else{
            motor1.set(0);
        }
    }
}

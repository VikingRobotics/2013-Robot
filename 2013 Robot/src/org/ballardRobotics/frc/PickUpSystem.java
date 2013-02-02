/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ballardRobotics.frc;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author Team 2928
 */
public class PickUpSystem {
    DoubleSolenoid mainSolenoid;
    JoystickButton liftButton;
    
    public PickUpSystem(DoubleSolenoid mainSolenoid, JoystickButton liftButton){
       this.mainSolenoid = mainSolenoid;
       this.liftButton = liftButton; 
    }
    public void periodic(){
        if(liftButton.get()){
            this.mainSolenoid.set(DoubleSolenoid.Value.kForward);
        }else{
            this.mainSolenoid.set(DoubleSolenoid.Value.kReverse);
        }
    }
    
}


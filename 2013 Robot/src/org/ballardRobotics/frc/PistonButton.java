package org.ballardRobotics.frc;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Team 2928
 */
public class PistonButton {
    DoubleSolenoid frisbeePuncher;
    JoystickButton pokerButton;
    boolean isFirstPress = true;
    
    public PistonButton(DoubleSolenoid coolPoker, JoystickButton pokerButton){
        this.frisbeePuncher = coolPoker;
        this.pokerButton = pokerButton;
    }
    
    public void periodic(){
        if(this.pokerButton.get() && this.isFirstPress){
            this.frisbeePuncher.set(DoubleSolenoid.Value.kForward);
            this.isFirstPress = false;
        }else if(!this.pokerButton.get()){
            this.isFirstPress = true;
        }else{
            this.frisbeePuncher.set(DoubleSolenoid.Value.kReverse);
        }
    }
}

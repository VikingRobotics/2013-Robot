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
    int c = 0;
    
    public PistonButton(DoubleSolenoid coolPoker, JoystickButton pokerButton){
        this.frisbeePuncher = coolPoker;
        this.pokerButton = pokerButton;
    }
    
    public void periodic(){
        if(pokerButton.get()){
            if(c < 10){
                this.frisbeePuncher.set(DoubleSolenoid.Value.kForward);
                this.c++;
            }else if(c < 15){
                this.frisbeePuncher.set(DoubleSolenoid.Value.kReverse);
                c++;
            }else{
                c = 0;
            }
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ballardRobotics.frc;

import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author Team 2928
 */
public class SpeedControllerMultiplexer implements SpeedController{
    public SpeedController controllers[];
    private double speed = 0;
    
    public SpeedControllerMultiplexer(SpeedController[] controllers){
        this.controllers = controllers;
    }

    public double get(){
        return speed;
    }

    public void set(double speed, byte syncGroup){
        this.speed = speed;
        for(int i = 0; i < controllers.length; i++){
            controllers[i].set(speed, syncGroup);
        }
    }

    public void set(double speed){
        this.speed = speed;
        for(int i = 0; i < controllers.length; i++){
            controllers[i].set(speed);
        }
    }

    public void disable(){
        for(int i = 0; i < controllers.length; i++){
            controllers[i].disable();
        }
    }

    public void pidWrite(double output){
        for(int i = 0; i < controllers.length; i++){
            controllers[i].pidWrite(output);
        }
    }
}

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
    private SpeedController controllers[];
    
    public SpeedControllerMultiplexer(SpeedController[] controllers){
        this.controllers = controllers;
    }

    public double get(){
    }

    public void set(double d, byte b){
    }

    public void set(double d){
    }

    public void disable(){
    }

    public void pidWrite(double d){
    }
    
    
    
    
    
}

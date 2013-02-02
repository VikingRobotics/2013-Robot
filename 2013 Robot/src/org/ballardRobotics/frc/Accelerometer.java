/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ballardRobotics.frc;

import edu.wpi.first.wpilibj.ADXL345_I2C;

/**
 *
 * @author Team 2928
 */
public class Accelerometer {
    ADXL345_I2C adxl345;
    public Accelerometer(ADXL345_I2C adxl345){
        this.adxl345 = adxl345;
    }
    public void periodic(){
        adxl345.getAcceleration(ADXL345_I2C.Axes.kX);
    }
}

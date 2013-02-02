/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.ballardRobotics.frc;


import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotMain extends IterativeRobot {
    
    //front left, front right, back left, and back right
    public Jaguar leftDrive;
    public Jaguar rightDrive;
    public RobotDrive robotDrive;
            
    public Victor roller;
    
    public Talon shooter1;
    public Talon shooter2;
    public Talon shooter3;
    
    public Talon shooterLift1;
    public Talon shooterLift2;
    
    public DoubleSolenoid climbers;
    public DoubleSolenoid loader;
    public DoubleSolenoid pickup;
    public Compressor compressor;
    
    public Joystick leftJoy;
    public Joystick rightJoy;
    
    public ADXL345_I2C adxl345;

    RollerController rollerController;
    ShooterSubsystem shooterSubsystem;
    PistonButton pistonButton;
    DriveTrain driveTrain;
    PickUpSystem pickUpSystem;
    Accelerometer accelerometer;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        roller = new Victor(3);
        //Jaguars can be linked to one pwm port
        leftDrive = new Jaguar(1);
        rightDrive = new Jaguar(2);
        robotDrive = new RobotDrive(leftDrive, rightDrive);
        //Talons can not be linked and must use seperate ports
        shooter1 = new Talon(4);
        shooter2 = new Talon(5);
        shooter3 = new Talon(6);
        //motor used to adjust angle of shooter & climbing pistons
        shooterLift1 = new Talon(7);
        shooterLift2 = new Talon(8);
        
        //Pneumatics
        climbers = new DoubleSolenoid(1, 2);
        //pushes frisbees into shooter
        //loader = new DoubleSolenoid(3, 4);
        //lowers or raises pickup device
        pickup = new DoubleSolenoid(3, 4);
        compressor = new Compressor(1, 1);
        compressor.start();
        //compressor automatically limits pressure
        
        //Controls
        leftJoy = new Joystick(1);
        rightJoy = new Joystick(2);
        
        adxl345 = new ADXL345_I2C(1, ADXL345_I2C.DataFormat_Range.k2G);
        
        rollerController = new RollerController(roller, new JoystickButton(rightJoy, 2), new JoystickButton(rightJoy, 3));
        shooterSubsystem = new ShooterSubsystem(shooterLift1, shooterLift2, new JoystickButton(leftJoy, 2), new JoystickButton(leftJoy, 3));
        //pistonButton = new PistonButton(loader, new JoystickButton(leftJoy, 1));
        driveTrain = new DriveTrain(robotDrive, rightJoy);
        pickUpSystem = new PickUpSystem(pickup, new JoystickButton(leftJoy, 4));
        accelerometer = new Accelerometer(adxl345);
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
        rollerController.periodic();
        shooterSubsystem.periodic();
        //pistonButton.periodic();
        driveTrain.periodic();
        pickUpSystem.periodic();
        accelerometer.periodic();
    }
}
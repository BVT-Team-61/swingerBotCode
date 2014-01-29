/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Trevor
 */
public class Armapult extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private SpeedController armapultMotor = new Victor(RobotMap.armapultMotor);
    
    private Solenoid armapultOut = new Solenoid(RobotMap.armapultOutSolenoid);
    private Solenoid armapultIn = new Solenoid(RobotMap.armapultInSolenoid);

    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Prepare(double pos) {
        if (pos < 0.0) {
            armapultMotor.set(pos);
        }
    }
    
    public void setIn(boolean on) {
        armapultIn.set(on);
    }
    
    public void setOut(boolean on) {
        armapultOut.set(on);
    }
    
    public void doNothing() {
    }
}

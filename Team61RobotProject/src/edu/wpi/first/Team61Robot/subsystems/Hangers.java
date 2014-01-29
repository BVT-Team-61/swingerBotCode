/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.subsystems;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.Team61Robot.commands.HangerDoNothing;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Trevor
 */
public class Hangers extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Solenoid launcherReturn = new Solenoid(RobotMap.armapultOutSolenoid);
    private Solenoid launcherShoot = new Solenoid(RobotMap.armapultInSolenoid);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new armapultDoNothing());
    }
    
    public void doNothing() {
        ;
    }
    
    public void moveOut(boolean on) {
        armapultRelease.set(on);
    }
    
    public void moveIn(boolean on) {
        armapultRelease.set(on);
    }
}

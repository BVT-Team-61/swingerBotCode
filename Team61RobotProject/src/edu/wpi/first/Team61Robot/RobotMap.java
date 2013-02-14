package edu.wpi.first.Team61Robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    public static final int dumperMotor = 3;
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    // Digital outputs
    public static final int hangerOutSolenoid = 1;
    public static final int hangerInSolenoid = 2;
    public static final int dumperInSolenlid= 7; 
    public static final int dumperOutSolenlid= 8; 
    
    public static final int driveSolenoid = 5;
    public static final int armSolenoid = 6;
            
    // Digital inputs
    public static final int bottomLimitChannel = 3;
    

    public static final int compressorSensor = 1;    
    public static final int compressorRelay = 1;

}

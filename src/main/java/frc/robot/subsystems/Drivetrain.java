// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

// import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
// import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

// import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drivetrain extends SubsystemBase { 
    // private Encoder encoder_l= new Encoder(0, 1);
    // private Encoder encoder_r = new Encoder(2, 3);
    // Left side motors
    private final MotorControllerGroup m_leftMotors =
    new MotorControllerGroup(new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_1),
    new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_2));
       

    // Right side motors
    private final MotorControllerGroup m_rightMotors =     
    new MotorControllerGroup(new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_3),
    new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_4));
           


    public void setMotors(double left, double right) {
        // SmartDashboard.putNumber("encoder getRate", encoder_l.getRate());
        // SmartDashboard.putNumber("encoder getRate", encoder_r.getRate());
        m_leftMotors.set(left);
        m_rightMotors.set(right);
        m_rightMotors.setInverted(true);
    }
    
    public void stopMotors() {
        m_rightMotors.disable();
        m_leftMotors.disable();
    }
}


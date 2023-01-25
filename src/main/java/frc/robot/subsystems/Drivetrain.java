// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drivetrain extends SubsystemBase { 

    // Left side motors
    private final MotorControllerGroup m_leftMotors =
    new MotorControllerGroup(new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_LEFT_VICTORSPX_5),
    new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_LEFT_VICTORSPX_6));

    // Right side motors
    private final MotorControllerGroup m_rightMotors =     
    new MotorControllerGroup(new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_RIGHT_VICTORSPX_3),
    new WPI_VictorSPX(RobotMap.CAN.DRIVETRAIN_RIGHT_VICTORSPX_4));
        
    public void setMotors(double right, double left) {
        SmartDashboard.putNumber("encoder getRate", RobotMap.encoder_l.getRate());
        SmartDashboard.putNumber("encoder getRate", RobotMap.encoder_r.getRate());
        m_leftMotors.set(left);
        m_rightMotors.set(right);
        m_leftMotors.setInverted(true);
    }
    
    public void stopMotors() {
        m_rightMotors.disable();
        m_leftMotors.disable();
    }
}


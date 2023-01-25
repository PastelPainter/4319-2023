package frc.robot;

import edu.wpi.first.wpilibj.Encoder;

public class RobotMap {

    public interface CAN {
        public static final int DRIVETRAIN_LEFT_TALON_1 = 1;
        public static final int DRIVETRAIN_LEFT_TALON_2 = 2;
        public static final int DRIVETRAIN_RIGHT_TALON_3 = 3;
        public static final int DRIVETRAIN_RIGHT_TALON_4 = 4;
        public static final int DRIVETRAIN_RIGHT_VICTORSPX_3 = 3;
        public static final int DRIVETRAIN_RIGHT_VICTORSPX_4 = 3;
        public static final int DRIVETRAIN_LEFT_VICTORSPX_5 = 5;
        public static final int DRIVETRAIN_LEFT_VICTORSPX_6 = 6;
    }

    public interface DIO {
        public static final int DIO_0 = 0;
        public static final int DIO_1 = 1;
        public static final int DIO_2 = 2;
        public static final int DIO_3 = 3;
    }

    public static Encoder encoder_l= new Encoder(RobotMap.DIO.DIO_3, RobotMap.DIO.DIO_2, true);
    public static Encoder encoder_r = new Encoder(RobotMap.DIO.DIO_1, RobotMap.DIO.DIO_0, false);

   
    // public interface PWM  {
    //     public static final int DRIVETRAIN_LEFT_VICTORSP_1 = 0;
    //     public static final int DRIVETRAIN_LEFT_VICTORSP_2 = 1;
    //     public static final int DRIVETRAIN_LEFT_VICTORSP_3 = 2;
    //     public static final int DRIVETRAIN_LEFT_VICTORSP_4 = 3;
    // }

    public static final int DRIVER_CONTROLLER = 0;
    public static final int OPERATOR_CONTROLLER = 1; 

    // XBOX One Joysticks
    public interface JOYSTICK {
        public static final int LEFT_STICK_X = 0;
        public static final int LEFT_STICK_Y = 1;
        public static final int LEFT_TRIGGER = 2;
        public static final int RIGHT_TRIGGER = 3;
        public static final int RIGHT_STICK_X = 4;
        public static final int RIGHT_STICK_Y = 5;

    }



}

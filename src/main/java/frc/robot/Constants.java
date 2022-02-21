// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public interface Constants {

  public interface Drivetrain {
    // Drivetrain CAN IDs
    int driveFrontLeftCANID = 1;
    int driveBackLeftCANID = 0;
    int driveFrontRightCANID = 2;
    int driveBackRightCANID = 3;
  }

  public interface Climber {
    // Climber CAN IDs
    int climbSupportOneLeftCANID = 4;
    int climbArmOneLeftCANID = 5;
    int climbSupportOneRightCANID = 6;
    int climbArmOneRightCANID = 7;

    int climbSupportTwoLeftCANID = 8;
    int climbArmTwoLeftCANID = 9;
    int climbSupportTwoRightCANID = 10;
    int climbArmTwoRightCANID = 11;
  }

  public interface Shooter {
    // Shooter CAN IDs
    int shooterMotorCANID = 12;

    // Shooter gear ratio
    double shooterGearRatio = (0 / 0);

    // Height information
    double cameraHeight = 25;
    double cameraAngleCorrection = 10.6;
    double targetHeight = 98.25 - cameraHeight;
  }

  public interface Intake {
    // Intake CAN IDs
    int intakeSpinMotorCANID = 13;
    int intakePivotMotorCANID = 14;
  }

  public interface Index {
    // Index CAN IDs
    int indexMotorTopCANID = 15;
    int indexMotorBottomCANID = 16;
    int indexMotorExtraCANID = 17;
  }

  public interface Controller {
    // Controller port IDs
    int joystickPort = 0;
    int xboxControllerPort = 1;

    // Xbox controller axes
    int povUp = 0;
    int povRight = 90;
    int povLeft = 270;
    int povDown = 180;
  }
}

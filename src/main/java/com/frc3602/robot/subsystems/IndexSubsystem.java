/* Copyright (C) 2022 Team 3602. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package com.frc3602.robot.subsystems;

import com.frc3602.robot.RobotContainer;
import com.frc3602.robot.Constants.Index;

// Phoenix Imports
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

// WPILib Imports
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IndexSubsystem extends SubsystemBase {
  // Creates the motors & controllers and sets the CAN IDs for each one
  WPI_TalonSRX indexMotorTop = new WPI_TalonSRX(Index.indexMotorTopCANID);
  WPI_TalonSRX indexMotorBottom = new WPI_TalonSRX(Index.indexMotorBottomCANID);

  DigitalInput indexSensorTop = new DigitalInput(Index.indexSensorTopID);
  DigitalInput indexSensorBottom = new DigitalInput(Index.indexSensorBottomID);

  int ballCount = 0;
  int count = 0;

  boolean previousTopState = false;
  boolean previousBottomState = false;

  public IndexSubsystem() {
    // Sets the motors to default configuration
    indexMotorTop.configFactoryDefault();
    indexMotorBottom.configFactoryDefault();

    indexMotorTop.setNeutralMode(NeutralMode.Brake);
    indexMotorBottom.setNeutralMode(NeutralMode.Brake);
  }

  /*
   * public void AdvanceIndex(double speed) {
   * if (speed > 1.0) {
   * speed = 1.0;
   * }
   * if (speed < -1.0) {
   * speed = -1.0;
   * }
   * 
   * indexMotorTop.set(speed * -1.0 * Index.motorTopSpeed);
   * indexMotorBottom.set(speed * -1.0 * Index.motorBottomSpeed);
   * 
   * if (speed != 0.0) {
   * RobotContainer.indexSubsystem.SpinIntake();
   * } else {
   * RobotContainer.indexSubsystem.StopIntake();
   * }
   * }
   */

  /*
   * public void StopIndex() {
   * AdvanceIndex(0.0);
   * }
   */

  public void InitSensors() {
  }

  public int BallCount() {
    return ballCount;
  }

  public boolean IndexSensorTop() {
    return indexSensorTop.get();
  }

  public boolean IndexSensorBottom() {
    return indexSensorBottom.get();
  }

  public boolean IsIndexFull() {
    return (ballCount >= Index.maxBalls);
  }

  public void CheckSensors() {
    count++;
    if (count > 500) {

    }
  }

  public void IndexIn() {
    indexMotorTop.set(ControlMode.PercentOutput, -1.0);
    indexMotorBottom.set(ControlMode.PercentOutput, -1.0);
  }

  public void IndexOut() {
    indexMotorTop.set(ControlMode.PercentOutput, 1.0);
    indexMotorBottom.set(ControlMode.PercentOutput, 1.0);
  }

  @Override
  public void periodic() {
  }
}

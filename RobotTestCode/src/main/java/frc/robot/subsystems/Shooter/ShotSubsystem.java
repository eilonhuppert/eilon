/**
 * This subsyestem controls the shot it self and her motors
 * @author Eilon Nave Huppert
 * @version 1.0.1
 */
package frc.robot.subsystems.Shooter;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShotSubsystem extends SubsystemBase  implements ShotConstans{
  private TalonFX _upShooterMotor;
  private TalonFX _downShooterMotor;

  private static ShotSubsystem instance;
  /**
   * Use to create a instance in ShotSubsystem.
   * @return A new instance or the old one if he exist.
   */
  public static ShotSubsystem getInstance(){ // singelton
    if (instance == null){
      instance = new ShotSubsystem();
    }
    return instance;
  }
  
  /** Creates a new ShotSubsystem. */
  private ShotSubsystem() {
    _upShooterMotor = new TalonFX(UP_SHOOTER_MOTOR_ID,Constants.CAN_BUS_NAME);
    _downShooterMotor = new TalonFX(DOWN_SHOOTER_MOTOR_ID, Constants.CAN_BUS_NAME);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

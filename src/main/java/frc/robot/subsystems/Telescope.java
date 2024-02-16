// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.SparkPIDController;
import com.revrobotics.CANSparkBase.ControlType;
//import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.Constants.armConstants;
//import com.revrobotics.RelativeEncoder;


public class Telescope extends SubsystemBase {
 
  private SparkPIDController m_PIDTelescope;
  private CANSparkMax m_armTelescopingMotor;
 
  /** Creates a new Telescope. */
  public Telescope() {
    
   m_armTelescopingMotor = new CANSparkMax(armConstants.armTelescopingMotor, MotorType.kBrushless);
   m_PIDTelescope = m_armTelescopingMotor.getPIDController();
   m_PIDTelescope.setP(.3);
   m_PIDTelescope.setI(0);
   m_PIDTelescope.setD(0);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
   }

   public Command telescope_intake_position(){
          return runOnce(() ->{
      m_PIDTelescope.setReference(-9,ControlType.kPosition);
         });
    } 
    
  public Command telescope_hold_postion(){
          return runOnce(() ->{
      m_PIDTelescope.setReference(0,ControlType.kPosition);   
        }); 
    }

  public Command telescope_amp_postion(){
          return runOnce(() ->{
      m_PIDTelescope.setReference(-4,ControlType.kPosition);   
        }); 
    }
  public Command telescope_shoot_postion(){
          return runOnce(() ->{
      m_PIDTelescope.setReference(0,ControlType.kPosition);   
        }); 
    }  
    
    public Command telescope_preclimb_postion(){
          return runOnce(() ->{
      m_PIDTelescope.setReference(0,ControlType.kPosition);   
        }); 
    }

    public Command telescope_trap_postion(){
          return runOnce(() ->{
      m_PIDTelescope.setReference(0,ControlType.kPosition);   
        }); 
    }
    
}

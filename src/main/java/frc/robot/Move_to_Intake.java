// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.armSubsystem;
import frc.robot.subsystems.Telescope;

public class Move_to_Intake extends Command {
  private final armSubsystem m_armSubsytem;
  private final Telescope m_Telescope;

  /** Creates a new Move_to_Intake. */
  public Move_to_Intake(armSubsystem armsubsytem, Telescope telescope ) {
    this.m_armSubsytem = armsubsytem;
    this.m_Telescope = telescope;
    addRequirements(m_armSubsytem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    m_armSubsytem.intake_position();
    m_Telescope.telescope_intake_position();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

package frc.team2412.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.team2412.robot.subsystem.ShooterSubsystem;

public class ShooterFlywheelStartCommand extends InstantCommand {
    public ShooterFlywheelStartCommand(ShooterSubsystem shooter) {
        super(shooter::startFlywheel, shooter);
    }
}

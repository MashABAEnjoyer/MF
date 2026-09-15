package org.firstinspires.ftc.teamcode.pedro;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.localizers.PinpointLocalizer;
import com.pedropathing.tuning.autotune.Procedure;
import com.pedropathing.tuning.autotune.Tuner;

import org.firstinspires.ftc.teamcode.pedro.procedures.ForesightTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.MecanumTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.PinpointTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.Tests;

public class Tuning {

    // mecanum drivetrain
    @Tuner
    public static Procedure mecanumTuner() {
        return new MecanumTuner();
        // access this url for autotune
        // http://192.168.43.1:10158
    }

    // pinpoint
    @Tuner
    public static Procedure pinpointTuner() {
        return new PinpointTuner();
        // same url as above
    }

    // foresight
    @Tuner
    public static Procedure foresightTuner() {
        return new ForesightTuner((hardwareMap) -> new PinpointLocalizer(hardwareMap, Constants.localizerConfig),
                (hardwareMap) -> new Mecanum(hardwareMap, Constants.drivetrainConfig)
        );
        // same url
    }
    @Tuner
    public static Procedure tests() {
        return new Tests(hardwareMap -> new Mecanum(hardwareMap, Constants.drivetrainConfig),
                (hardwareMap -> new PinpointLocalizer(hardwareMap, Constants.localizerConfig)),
                () -> new Foresight(Constants.foresightConfig)
        );
        // acess this url
        // http://192.168.43.1:10158/
    }
}

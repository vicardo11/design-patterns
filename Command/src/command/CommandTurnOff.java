package command;

import device.StereoSystem;

public class CommandTurnOff implements Command{

    private StereoSystem stereoSystem;

    public CommandTurnOff(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        stereoSystem.off();
    }
}

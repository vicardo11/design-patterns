package command;

import device.StereoSystem;

public class CommandTurnOn implements Command{

    private StereoSystem stereoSystem;

    public CommandTurnOn(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        stereoSystem.on();
    }
}

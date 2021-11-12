package command;

import device.StereoSystem;

public class CommandVolumeDown implements Command{

    private StereoSystem stereoSystem;

    public CommandVolumeDown(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        stereoSystem.volumeDown();
    }
}

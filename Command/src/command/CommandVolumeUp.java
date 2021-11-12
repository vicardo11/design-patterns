package command;

import device.StereoSystem;

public class CommandVolumeUp implements Command{

    private StereoSystem stereoSystem;

    public CommandVolumeUp(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        stereoSystem.volumeUp();
    }
}

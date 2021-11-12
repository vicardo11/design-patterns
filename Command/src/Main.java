import command.*;
import device.StereoSystem;
import remote.StereoRemote;

public class Main {
    public static void main(String[] args) {
        StereoRemote remote = new StereoRemote();
        StereoSystem stereoSystem = new StereoSystem(50);

        Command turnOn = new CommandTurnOn(stereoSystem);
        Command turnOff = new CommandTurnOff(stereoSystem);
        Command volumeUp = new CommandVolumeUp(stereoSystem);
        Command volumeDown = new CommandVolumeDown(stereoSystem);

        remote.setCommand(0, turnOn);
        remote.setCommand(1, turnOff);
        remote.setCommand(2, volumeUp);
        remote.setCommand(3, volumeDown);

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);
        remote.pressButton(3);

    }
}

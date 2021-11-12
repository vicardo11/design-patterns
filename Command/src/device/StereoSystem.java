package device;

public class StereoSystem {

    private static final int INITIAL_VOLUME = 10;

    private int volume = INITIAL_VOLUME;
    private final int maxVolume;

    public StereoSystem(int maxVolume) {
        if(maxVolume < INITIAL_VOLUME) {
            this.maxVolume = INITIAL_VOLUME;
        } else {
            this.maxVolume = maxVolume;
        }
    }

    public void on() {
        System.out.println("StereoSystem is on");
    }

    public void volumeUp() {
        if (volume < maxVolume) {
            volume++;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume can't be increased - maximum volume");
        }
    }

    public void volumeDown() {
        if (volume <= 0) {
            System.out.println("Volume can't be decreased - minimum volume");
        } else {
            volume--;
            System.out.println("Volume decreased to: " + volume);
        }
    }

    public void off() {
        System.out.println("StereoSystem is off");
    }
}

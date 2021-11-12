package remote;

import command.Command;

public class StereoRemote {

    private final Command[] commands = new Command[4];

    public void setCommand(int slot, Command command) {
        if (slot < 0 || slot >= commands.length) {
            System.out.println("There is no slot with number " + slot);
        } else {
            commands[slot] = command;
        }
    }

    public void pressButton(int slot) {
        if (commands[slot] == null) {
            System.out.println("This slot is empty");
        } else {
            commands[slot].execute();
        }
    }
}

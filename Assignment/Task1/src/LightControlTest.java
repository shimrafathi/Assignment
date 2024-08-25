// RemoteControl class
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndoButton() {
        command.undo();
    }
}

// Test class
public class LightControlTest {
    public static void main(String[] args) {
        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        Command kitchenOn = new LightOnCommand(kitchenLight);
        Command kitchenOff = new LightOffCommand(kitchenLight);
        Command livingRoomDim = new LightDimCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(kitchenOn);
        remote.pressButton(); // Turns on kitchen light

        remote.setCommand(livingRoomDim);
        remote.pressButton(); // Sets living room light brightness

        remote.setCommand(kitchenOff);
        remote.pressButton(); // Turns off kitchen light

        remote.pressUndoButton(); // Undoes the last command (turns kitchen light back on)
    }
}
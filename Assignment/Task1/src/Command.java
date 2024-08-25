// Command interface
interface Command {
    void execute();
    void undo();
}

// Command classes
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

class LightDimCommand implements Command {
    private Light light;
    private int prevBrightness;

    public LightDimCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevBrightness = getCurrentBrightness();
        light.dim(50); // Example: Set brightness to 50
    }

    @Override
    public void undo() {
        light.dim(prevBrightness);
    }

    private int getCurrentBrightness() {
        // Implement logic to get the current brightness level
        // For simplicity, returning a fixed value here
        return 100;
    }
}
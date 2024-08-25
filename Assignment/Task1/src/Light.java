// Light interface
interface Light {
    void on();
    void off();
    void dim(int level);
}

// Concrete Light classes
class KitchenRoomLight implements Light {
    private int brightnessLevel = 0;

    @Override
    public void on() {
        System.out.println("Kitchen light is ON");
    }

    @Override
    public void off() {
        System.out.println("Kitchen light is OFF");
    }

    @Override
    public void dim(int level) {
        brightnessLevel = level;
        System.out.println("Kitchen light brightness set to " + level);
    }
}

class LivingRoomLight implements Light {
    private int brightnessLevel = 0;

    @Override
    public void on() {
        System.out.println("Living room light is ON");
    }

    @Override
    public void off() {
        System.out.println("Living room light is OFF");
    }

    @Override
    public void dim(int level) {
        brightnessLevel = level;
        System.out.println("Living room light brightness set to " + level);
    }
}


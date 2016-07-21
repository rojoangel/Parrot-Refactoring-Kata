package parrot.type;

import parrot.Parrot;

public class NorwegianBlueParrot implements Parrot {

    private static final double MAX_SPEED = 24.0;
    private final double voltage;

    public NorwegianBlueParrot(double voltage) {
        this.voltage = voltage;
    }

    public double getSpeed() {
        return getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }

}

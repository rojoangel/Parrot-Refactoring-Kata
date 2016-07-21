package parrot.type;

import parrot.Parrot;

public class NorwegianBlueParrot implements Parrot {

    private static final double MAX_SPEED = 24.0;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        if (isNailed)
            return new NailedParrot().getSpeed();

        return getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }

}

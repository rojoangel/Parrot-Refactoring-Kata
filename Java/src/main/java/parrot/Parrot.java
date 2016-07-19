package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
        this.type = _type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        switch(type) {
            case NORWEGIAN_BLUE:
                return new NorwegianParrot().getSpeed();
        }
        throw new RuntimeException("Should be unreachable");
    }

    private class NorwegianParrot {
        public double getSpeed() {
            return (isNailed) ? 0 : getBaseSpeed(voltage);
        }

        private double getBaseSpeed() {
            return 12.0;
        }

        private double getBaseSpeed(double voltage) {
            return Math.min(24.0, voltage*getBaseSpeed());
        }
    }
}

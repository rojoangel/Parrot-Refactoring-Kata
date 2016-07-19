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
                return new NorwegianParrot(this.voltage, this.isNailed).getSpeed();
        }
        throw new RuntimeException("Should be unreachable");
    }

    private class NorwegianParrot extends Parrot {

        public NorwegianParrot(double voltage, boolean isNailed) {
            super(ParrotTypeEnum.NORWEGIAN_BLUE, voltage, isNailed);
        }

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

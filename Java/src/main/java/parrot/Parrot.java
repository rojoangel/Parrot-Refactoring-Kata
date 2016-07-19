package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        switch(type) {
            case AFRICAN:
                return new AfricanParrot().getSpeed();
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    private double getBaseSpeed() {
        return 12.0;
    }


    private class AfricanParrot {
        public double getSpeed() {
            return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
        }

        private double getBaseSpeed() {
            return 12.0;
        }

        private double getLoadFactor() {
            return 9.0;
        }
    }
}

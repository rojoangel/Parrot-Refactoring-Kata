package parrot;


class AfricanParrot extends Parrot {

    private static final int VOLTAGE = 0;
    private static final boolean IS_NAILED = false;
    private int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, VOLTAGE, IS_NAILED);
        this.numberOfCoconuts = numberOfCoconuts;
    }

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

package parrot;

class EuropeanParrot extends Parrot {


    private static final int NUMBER_OF_COCONUTS = 0;
    private static final int VOLTAGE = 0;
    private static final boolean IS_NAILED = false;

    public EuropeanParrot() {
        super(ParrotTypeEnum.EUROPEAN, NUMBER_OF_COCONUTS, VOLTAGE, IS_NAILED);
    }

    public double getSpeed() {
        return 12.0;
    }
}

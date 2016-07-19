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
                return new NorwegianBlueParrot(this.voltage, this.isNailed).getSpeed();
        }
        throw new RuntimeException("Should be unreachable");
    }

}

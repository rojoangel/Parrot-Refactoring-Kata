package parrot;

public class Parrot implements ParrotInterface {

    private ParrotTypeEnum type;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
        this.type = _type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        throw new RuntimeException("Should be unreachable");
    }

}

package parrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed)
    {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            default:
                return new Parrot(type, numberOfCoconuts, voltage, isNailed);
        }
    }
}

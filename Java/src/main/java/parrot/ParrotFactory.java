package parrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed)
    {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            default:
                return new Parrot(type, voltage, isNailed);
        }
    }
}

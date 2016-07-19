package parrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed)
    {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(voltage, isNailed);
            default:
                throw new RuntimeException("Inexistent parrot type");
        }
    }
}

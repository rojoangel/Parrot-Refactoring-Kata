package parrot;

import parrot.type.AfricanParrot;
import parrot.type.EuropeanParrot;
import parrot.type.NailedParrot;
import parrot.type.NorwegianBlueParrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed)
    {
        if (isNailed) {
            return new NailedParrot();
        }

        return createParrot(type, numberOfCoconuts, voltage);
    }

    private static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage) {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(voltage);
            default:
                throw new RuntimeException("Inexistent parrot type");
        }
    }
}

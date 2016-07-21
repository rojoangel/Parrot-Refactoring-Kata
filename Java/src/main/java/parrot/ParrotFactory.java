package parrot;

import parrot.type.AfricanParrot;
import parrot.type.EuropeanParrot;
import parrot.type.NorwegianBlueNailedParrot;
import parrot.type.NorwegianBlueParrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed)
    {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE:
                if (isNailed) {
                    return new NorwegianBlueNailedParrot();
                }
                return new NorwegianBlueParrot(voltage, isNailed);
            default:
                throw new RuntimeException("Inexistent parrot type");
        }
    }
}

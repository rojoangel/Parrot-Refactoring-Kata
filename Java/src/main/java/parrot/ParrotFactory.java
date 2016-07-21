package parrot;

import parrot.type.AfricanParrot;
import parrot.type.EuropeanParrot;
import parrot.characteristics.Nailed;
import parrot.type.NorwegianBlueParrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed)
    {
        Parrot parrot = createParrot(type, numberOfCoconuts, voltage);

        if (isNailed) {
            return new Nailed(parrot);
        }

        return parrot;
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

package parrot;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(parrot.getSpeed(), 12.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.AFRICAN, 1, 0, false);
        assertEquals(parrot.getSpeed(), 3.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.AFRICAN, 2, 0, false);
        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(parrot.getSpeed(), 12.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, true);
        assertEquals(parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(parrot.getSpeed(), 18.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        ParrotInterface parrot = ParrotFactory.create(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(parrot.getSpeed(), 24.0);
    }
}

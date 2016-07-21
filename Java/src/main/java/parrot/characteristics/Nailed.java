package parrot.characteristics;

import parrot.Parrot;

public class Nailed implements Parrot {

    private Parrot parrot;

    public Nailed(Parrot parrot)
    {
        this.parrot = parrot;
    }

    public double getSpeed()
    {
        return 0;
    }
}

package parrot;


class AfricanParrot implements ParrotInterface {

    private int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    private double getLoadFactor() {
        return 9.0;
    }
}

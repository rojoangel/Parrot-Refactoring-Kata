package parrot;


class AfricanParrot implements Parrot {

    private static final double LOAD_FACTOR = 9.0;
    private int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}

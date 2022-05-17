package ro.fasttrackit.curs2.ex1;

public enum Gravity {

    MERCURY(0.3),
    VENUS(0.9),
    MOON(0.1),
    MARS(0.3),
    JUPITER(2.5),
    SATURN(1),
    URANUS(0.8),
    NEPTUNE(1.1),
    PLUTO(0),
    IO(0.18),
    EUROPA(0.13),
    GANYMEDE(0.14),
    CALLISTO(0.12),
    SUN(27),
    WHITE_DWARF(1300000);

    private final double gravityDifference;

    Gravity(double gravityDifference) {
        this.gravityDifference = gravityDifference;
    }

    public double getGravityDifference(double weight) {
        double weightOnTerra;
        return weightOnTerra = gravityDifference * weight;
    }
}

package ro.fasttrackit.curs2.ex1;

public class Main {

    public static void main(String[] args) {

        double terraWeight = 10;

        for (Gravity gravity : Gravity.values()) {
            System.out.printf("The required weight on planet %s is %s%n", gravity.name(), gravity.getGravityDifference(terraWeight));
        }
    }
}

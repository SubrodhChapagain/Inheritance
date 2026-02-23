package week11.Workshop;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Hill-Friendly", landArea);
    }

    @Override
    public double calculateYield() {
        return getLandArea() * 2.8;
    }

    @Override
    public double calculateWaterRequirement() {
        return getLandArea() * 500;
    }

    @Override
    public double calculateTransportCost() {
        return getLandArea() * 1500;
    }

    @Override
    public String getTransportMethod() {
        return "Mule / Small Vehicle";
    }
}
    
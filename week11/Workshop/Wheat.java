package week11.Workshop;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return getLandArea() * 3.2;
    }

    @Override
    public double calculateWaterRequirement() {
        return getLandArea() * 800;
    }

    @Override
    public double calculateTransportCost() {
        return getLandArea() * 2000;
    }

    @Override
    public String getTransportMethod() {
        return "Mini Truck";
    }
}
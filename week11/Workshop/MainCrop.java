package week11.Workshop;


/**
 * Write a description of class CropManagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainCrop {
    
    public static void main(String[] args) {

        Crop[] crops = {
            new Rice(2.0),
            new Wheat(1.5),
            new Maize(1.0)
        };

        for (Crop c : crops) {
            c.displayCropInfo();
            System.out.println("Yield: " + c.calculateYield());
            System.out.println("Water Needed: " + c.calculateWaterRequirement());

            Transportable t = (Transportable) c;
            System.out.println("Transport Cost: " + t.calculateTransportCost());
            System.out.println("Transport Method: " + t.getTransportMethod());
        }
    }
}
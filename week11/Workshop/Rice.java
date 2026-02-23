package week11.Workshop;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop
{
    
    public Rice(String cropName, String season, double landArea, int water, int yeild)
    {
        super(cropName, season, landArea, water, yeild);
    }
    
    @Override
    public double calculateYield()
    {
        return getyeildinkg() * super.getLandArea();
    }
    
    @Override
    public double calculateWaterRequirement()
    {
        return getwaterrequirement() * super.getLandArea();
    }
    
    
    
}
package week11.Workshop;



public abstract class Crop
{
    private String cropName;
    private String Season;
    private double landArea;
    private int water_requirement;
    private int yeild_in_kg;
    
    public Crop(String cropName, String season, double landArea, int water, int yeild)
    {
        this.cropName = cropName;
        this.Season = season;
        this.landArea = landArea;
        this.water_requirement = water;
        this.yeild_in_kg = yeild;
    }
    
    abstract double calculateYield();
    abstract double calculateWaterRequirement();
    
    public void displayCropInfo()
    {
        System.out.println("CropNAME :"+ this.cropName);
        System.out.println("season :"+ this.Season);
        System.out.println("landarea :"+ this.landArea);
    }
    
    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        this.Season = season;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }    
    
    public void setYeildinkg( int newyeild)
    {
        this.yeild_in_kg = newyeild;
    
    }
    public double getyeildinkg()
    {
        return yeild_in_kg;
    }
    
    
    
}
package week8.Workshop;

public class Electricitybill
{
    private String consumername;
    private double unitsconsumed;
    
    public Electricitybill( String consumer, double units)
    {
        this.consumername = consumer;
        this.unitsconsumed = units;
    
    }
    
     double calculatebill()

       {
       if(unitsconsumed <= 100)
      {
        double cost = unitsconsumed*5;
        return cost;

      }
      
      else
      {
          double cost =(unitsconsumed-100)*8+500;
          return cost;
        
      }
      
      } 
    
}


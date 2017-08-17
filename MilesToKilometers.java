/*
________________________________________________________________
  @author: Christopher Butrick
  Date: 1/23/17
  Purpose: Converting Miles to Kilometers
----------------------------------------------------------------
  Member Data:  
  - double miles
  - double kilometers
---------------------------------------------------------------
  Methods:
  + setMiles(double currMiles)
  - calcKilometers()
  + double getKilometers()
_______________________________________________________________
*/

public class MilesToKilometers
   {
      // Example: private double stuff;
	  private double miles;
	  private double kilometers;
	   /*
      *  @param: currMiles current miles
      *  @return:none
      *  Purpose: set the current miles
      */
      public void setMiles(double currMiles)    
          {
            miles = currMiles;
          }
           /*
      *  @param:none
      *  @return:none
      *  Purpose: calculate kilometers
      */
      private void calcKilometers()    
          {
            kilometers = miles/1.60934;
          }
          
     /*
      *  @param:none
      *  @return:double which is kilometers
      *  Purpose: to return the number of kilometers given miles
      */
      public double getKilometers() 
          {
			calcKilometers();
            return kilometers;
          }
          
   }

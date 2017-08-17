/*
________________________________________________________________
  Class: LitersToQuarts
  Author: Michael Souther
  Date: 1/27/2015
  Purpose: convert liters to quarts
----------------------------------------------------------------
  Member Data:  
     -	double liters;
     -	double quarts;

---------------------------------------------------------------
  Methods:
     + setLiters(double currLiters);
     -	calcQuarts();
     + double getQuarts();

_______________________________________________________________
*/

public class LitersToQuarts
   {
     private double liters;
     private double quarts;
     
      /*
        @params: double currLiters
        @returns: none
        Purpose: to set the number of liters
      */
      public void setLiters(double currLiters)    
          {
			liters = currLiters;
          }
       
      /*
        @params: none
        @returns: none
        Purpose: Calculate quarts given liters
      */
      private void calcQuarts()    
          {
			quarts = liters * 1.05669;
          }

      /*
        @params: none
        @returns: double
        Purpose: to return the number of quarts
      */
      public double getQuarts()    
          {
            calcQuarts();
			return quarts;
          }          
   }

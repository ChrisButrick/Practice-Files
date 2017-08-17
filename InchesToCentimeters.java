
/*
________________________________________________________________
  @author: Christopher Butrick
  Date: 1/25/17
  Purpose: To convert inches to centimeters
----------------------------------------------------------------
  Member Data:  
		- double inches
		- double centimeters
---------------------------------------------------------------
  Methods:
	    + setInches(double currInches);
		- calcCentimeters();
		+ double getCentimeters();
_______________________________________________________________
*/

public class InchesToCentimeters
  {
    // Member Data
    private double inches;
	private double centimeters;
	  
    /*
    *  @param: double currInches
    *  @return: none
    *  Purpose: Set the number of inches
    */
    public void  setInches(double currInches)   
      {
        inches = currInches;
      }
  
    /*
    *  @param: none
    *  @return: none
    *  Purpose: Calculate centimeters from the given inches
    */
    private void  calcCentimeters()    
      {
        centimeters = inches * 2.54;
      }
		  
    /*
    *  @param: none
    *  @return: double which is centimeters
    *  Purpose: Get the number of centimeters after calculation
    */
    public double  getCentimeters()    
      {
        calcCentimeters();
        return centimeters;
      }    
   }

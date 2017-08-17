/*
******************************************************************
  Program Name: MilesToKilometersDriver.java
  Author: Christopher Butrick
  Date:01/23/17
  Assignment: Example 2
  Purpose: Calculate kilometers given miles
******************************************************************
*/
import java.util.Scanner;

public class MilesToKilometersDriver
   {
      public static void main(String[] args)
         {
			System.out.println("Please enter a number of miles.");
			Scanner keyboard = new Scanner (System.in);
			MilesToKilometers calc1;
			calc1 = new MilesToKilometers();
			double miles1 = keyboard.nextDouble();
			calc1.setMiles(miles1);
			double kilometers1 = 0.0;
			kilometers1 = calc1.getKilometers();
			System.out.println(miles1 + "miles = " + kilometers1 + "kilometers.");
         }
   }

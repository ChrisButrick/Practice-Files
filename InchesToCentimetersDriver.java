/*
******************************************************************
  Program Name: InchesToCentimetersDriver
  Author: Christopher Butrick
  Date:01/25/17
  Assignment: # 1
  Purpose: To convert given inches to centimeters
******************************************************************
*/
import java.util.Scanner;

public class InchesToCentimetersDriver
  {
    public static void main(String[] args)
      {
        Scanner keyboard = new Scanner(System.in);
		InchesToCentimeters solve1;
		solve1 = new InchesToCentimeters();
		System.out.print("Please enter a number of inches: ");
		double inches1 = keyboard.nextDouble();
		solve1.setInches(inches1);
		double centimeters1 = 0.0;
		centimeters1 = solve1.getCentimeters();
		System.out.println(inches1 + "inch(es) is equal to " + centimeters1 + " centimeters.");
     }
  }

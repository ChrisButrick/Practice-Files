/*
******************************************************************
  Program Name: LitersToQuartsDriver.java
  Author: Michael Souther
  Date: 1/27/2015
  Assignment: 
  Purpose: convert liters to quarts

  Input:  none
  Output: quarts
  Related files: LitersToQuarts.java

  Classes: LitersToQuarts

  History: 
******************************************************************
*/
import java.util.Scanner;

public class LitersToQuartsDriver
   {
      public static void main(String[] args)
         {
            double liters1;
			double quarts1;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Please enter a value of liters: ");
			liters1 = keyboard.nextDouble();
			LitersToQuarts conversion1 = new LitersToQuarts();
			conversion1.setLiters(liters1);
			quarts1 = conversion1.getQuarts();
			System.out.println(liters1 + " Liters is equal to " + quarts1 + " Quarts.");
         }
   }

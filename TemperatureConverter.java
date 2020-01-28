//Ryan Connolly
//01/28/20
//CS II Java Tempurature converter

import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String args[]){
        int repeat = 1;
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        while (repeat == 1){
            System.out.println("Please enter a temperature: ");
            int tempStart = input.nextInt();
            System.out.print("If you would like to convert this temp to celsius input 1, if you would like to change it to frenheit, input 0"); 
            int check = input.nextInt();
            if (check == 1){
                int newTemp = ((tempStart - 32) * 5/9);
                System.out.print("Your tempurature converted to Farenheit is " + newTemp);
            }
            else{
                int newTemp = ((9/5 * tempStart) + 32);
                System.out.print("Your tempurature converted to Farenheit is " + newTemp + " ");
            }
            System.out.print(" ");
            System.out.print("If you would like to run again input 1, If not input 0");
            repeat = input.nextInt();
            
        }
    }
}


 /*Ryan Connolly
 *01/23/20
 *CS2 Java assignment 1
*/
import java.util.*;

public class CopyOfGuessingGame {

    public static void main(String args[]){

        int rand; //random
        String playAgain;
        int guessInt;
        int max = 10;
        int min = 1;
        int count = 0;
        int randomNum = (int)(Math.random() * ((min - max)+1)) + min;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Please guess a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        while (count<3){
            count += 1;
            int number = input.nextInt();
            System.out.println("You enetered " + number);
            if (number != randomNum) {
                System.out.println("this number is not the random number");
            } else {
                System.out.println("this number is the random number");
                if (true){break;}
            }
        }
    }
}

package excercises;

import java.util.Scanner;

public class Mpg {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float miles = input.nextFloat();
        System.out.println("How many gallons of gas have you used?");
        float gas = input.nextFloat();
        float mpg = miles / gas;
        System.out.println("Your car gets " + mpg + " miles per gallon");
    }
}

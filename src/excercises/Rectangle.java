package excercises;
import java.util.Scanner;

public class Rectangle {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("What is the rectangle's length?");
        int length = input.nextInt();
        System.out.println("What is the rectangle's width?");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}

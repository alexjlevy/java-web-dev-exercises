package excercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        // Sum even numbers
        Integer sum = 0;
        for (Integer num : nums){
            if (num % 2 == 0){
                sum += num;
            }
        }
//        System.out.println(sum);
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("hellooo");
        words.add("hell");
        words.add("heel");
        words.add("h");
        words.add("he");
        words.add("heeheehee");
        words.add("hee");
        words.add("heil");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length please: ");
        int length = input.nextInt();
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}

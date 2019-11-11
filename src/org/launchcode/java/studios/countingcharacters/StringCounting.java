package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCounting {

    public static void main (String[] args){

        HashMap<Character, Integer> counts = new HashMap<>();
        // Default String:
         String notUsed = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        // String input:
        Scanner input = new Scanner(System.in);
        System.out.println("Write a string!");
        // Case insensitive:
        String s = input.nextLine().toLowerCase();
        char[] chars = s.toCharArray();
        for (char character : chars){
            if (Character.isLetter(character)){
                if (!counts.containsKey(character)){
                    counts.put(character, 1);
                } else {
                    counts.put(character, counts.get(character) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> letter : counts.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}

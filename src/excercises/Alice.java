package excercises;

import java.util.Scanner;

public class Alice {

    public static void main (String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term:");
        String text = input.nextLine().toLowerCase();
        Boolean result = alice.toLowerCase().contains(text);
        System.out.println(result);
        Integer index = alice.toLowerCase().indexOf(text);
        Integer length = text.length();
        String[] split = alice.split(text);
        System.out.println("Index: " + index + " Length: " + length);
        System.out.println(split);
        System.out.println(alice.substring(0,index-1)+alice.substring(index+length,alice.length()));
    }
}




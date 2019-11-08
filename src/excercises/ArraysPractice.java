package excercises;
import java.util.Arrays;

public class ArraysPractice {

    public static void main (String[] args){

        int[] nums = {1,1,2,3,5,8};
        for (int i : nums){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        String words =  "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArr = words.split("\\. ");
        System.out.println(Arrays.toString(wordsArr));
        for (String w : wordsArr){
            System.out.println(w);
        }
    }
}

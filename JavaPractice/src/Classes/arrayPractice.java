package Classes;

import java.util.Arrays;

public class arrayPractice {

    public void simpleArray(String[] words) {
        //for each structure

        // Print the words one per line
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();

        //Print words sorted in alphabetical order
        Arrays.sort(words);
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println();
        //Print unique words alphabetical
        Object[] words_unique = Arrays.stream(words).distinct().toArray();
        for (Object o : words_unique) {
            System.out.println(o);
        }

        System.out.println();
        //Print unique words lengthÒ
        for (Object o : words_unique) {
            System.out.println(o.toString().length());
        }

    }
}
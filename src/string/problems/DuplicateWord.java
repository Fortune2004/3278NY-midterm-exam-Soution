package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] words = st.split(" ");
        int dpw = 1;

        for (int i = 0; i < words.length; i++) {


            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    dpw = dpw + 1;
                    words[j] = "0";
                }
                if (words[i] != "0")
                    System.out.println(words[i] + "--" + dpw);
            }
        }


    }
}


package string.problems;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        //Unit test for DuplicateWord
        try {
            Set<String> set = new HashSet<>();
            set.add("failure");
            set.add("of");
            String test = "Success consists of going from failure to failure without loss of enthusiasm";
            Assert.assertEquals(DuplicateWord.duplicateWords(test), set);
            System.out.println("Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Test Failed!!!.");
        }


        //Unit test for LargestWord
        try {
            String a = "Bangladesh is very beautiful country";
            Assert.assertEquals(DetermineLargestWord.largestWord(a), "Bangladesh");
            System.out.println("Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Test Failed!!!.");
        }


        try {//Unit test for anagram
            Assert.assertEquals(Anagram.isAnagram("ARMY", "MARY"), true);
            System.out.println("Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Test Failed!!!!");
        }

        try {//Unit test for palindrome
            String test = "Civic";
            boolean expected = false;
            Assert.assertEquals(Palindrome.isPalindrome(test), expected);
            System.out.println("Test passed.");
        } catch (AssertionError as) {
            System.out.println("Test failed.");
        }
    }
}

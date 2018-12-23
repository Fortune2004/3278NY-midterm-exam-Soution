package string.problems;

public class Palindrome {

        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */



            public static void checkPalindrome(String s)
            {
                // reverse the given String
                String reverse = new StringBuffer(s).reverse().toString();

                // check whether the string is palindrome or not
                if (s.equals(reverse))
                    System.out.println("Yes");

                else
                    System.out.println("No");
            }

            public static void main (String[] args)
               throws java.lang.Exception
            {
                checkPalindrome("dad");
                checkPalindrome("mom");
            }
        }





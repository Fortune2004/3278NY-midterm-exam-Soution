package math.problems;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        //Find out 50 Fibonacci number using java

        int fibo[] = new int[40];
        for (int i = 0; i<40; i++){
            if (i < 2) {
                fibo[i] = 1;
            }else{
                fibo[i]=fibo[i=1] + fibo [i-1] ;
            }
        }
        System.out.println(Arrays.toString(fibo));
    }

}




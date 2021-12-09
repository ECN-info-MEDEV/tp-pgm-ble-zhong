/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author  nb
 */
public class Utils {

    private Utils() { }


    public static String concatWords(String[] words) {
         String[] w = null;
         if (Arrays.equals(words, w)){
            return "";
         }
         else{
                  StringBuilder buf = new StringBuilder();
              for (String word : words) {
                  buf.append(word);
              }
              return buf.toString();
         }
        
    }

    public static String computeFactorial(int number) 
                                               throws IllegalArgumentException {
        if (number < 1) {
            throw new IllegalArgumentException("zero or negative parameter (" + number + ')');
        }

        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial.toString();
    
    }

}

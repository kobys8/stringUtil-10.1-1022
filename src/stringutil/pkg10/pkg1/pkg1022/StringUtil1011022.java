/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringutil.pkg10.pkg1.pkg1022;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
import java.util.regex.*;
public class StringUtil1011022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter a string for reversal: ");
//        String reversal = in.nextLine();
//        System.out.print(stringMethods.reverseIt(reversal));
        System.out.print("\nPlease enter a string for palindrome check: ");
        String palindrome = in.nextLine();
        System.out.print(stringMethods.palindromeCheck(palindrome));
//        System.out.print("\nPlease enter a string for Pig Latin testing: ");
//        String pigLatinWordBefore = in.nextLine();
//        System.out.print(stringMethods.pigLatinReturns(pigLatinWordBefore));
    }
}

class stringMethods {
    private static String vowelPattern = "([AEIOUaeiou])";
    public static String reverseIt(String str) {
        String str1 = new String();
        for(int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        return str1;
    }
    public static boolean palindromeCheck(String str) {
        String temp = str.replaceAll("[^A-Za-z0-9]", "");
        String str1 = new String();
        for(int i = temp.length()-1; i >= 0; i--) {
            str1 += temp.charAt(i);
        }
        System.out.print(temp + " : " + str1 + "\n");
        return (temp.equalsIgnoreCase(str1));
    }
    public static String pigLatinReturns(String englishWord) {
        String igLatinPayEnding = "ay";
        String pigLatinWord;
        String start = "";
        String end = "";
        int iVal = 0;
        if(englishWord.substring(0,1).matches(vowelPattern)) {
            pigLatinWord = englishWord + "yay";
            return pigLatinWord;
        }
        else {
            for(int i = 0; i <= englishWord.length(); i++) {
                if(englishWord.substring(i, i + 1).matches(vowelPattern)) {
                    end += englishWord.substring(i);
                    iVal = i;
                    break;
                }
                else {
                    start += englishWord.substring(i, i + 1);
                }
            }
            if(end.equals(end.toLowerCase())) {
                pigLatinWord = end + start + "ay";
                return pigLatinWord;
            }
            else {
                String temp = start.substring(0,1).toLowerCase();
                temp += start.substring(1);
                pigLatinWord = end + temp + "ay";
                return pigLatinWord;
            }
        }
    }
}

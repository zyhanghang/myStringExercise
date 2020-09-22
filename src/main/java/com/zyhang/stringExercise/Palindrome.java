package com.zyhang.stringExercise;

/**
 * @author zyhang
 * @create 2020-09-16 9:49 AM
 */
public class Palindrome {

    public Palindrome() {
    }

    public String deleteSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            //we only focus on letter, ignore special chars
            if (!Character.isLetter(c)) continue;
            sb.append(c);
        }
        return sb.toString();
    }

    public String reverse(String str) {
        //pureStr is the string without spaces and special chars
        String pureStr = deleteSpaces(str);
        StringBuilder sb = new StringBuilder();
        for (int i = pureStr.length()-1; i >= 0; i--) {
            //we only focus on alphabetical letter
            if (!Character.isLetter(pureStr.charAt(i))) continue;
            sb.append(pureStr.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String str) {
        String pureStr = deleteSpaces(str);
        String reversedStr = reverse(str);
        // compare two strings in the same case
        return reversedStr.toLowerCase().equals(pureStr.toLowerCase());
    }
}

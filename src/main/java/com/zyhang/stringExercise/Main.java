package com.zyhang.stringExercise;

/**
 * @author zyhang
 * @create 2020-09-16 9:48 AM
 */
public class Main {
    public static void main(String[] args) {
        // 1. test Vowels
        Vowels vowels = new Vowels();
        String str1 = "Hello, world";
        int cnt = vowels.countVowels(str1);
        System.out.println("the string is: " + "\"" + str1 + "\"");
        System.out.println("vowels in this string is: " + cnt);
        System.out.println("=======================");
        System.out.println();

        // 2. test Palindrome
        Palindrome palindrome = new Palindrome();
        String str2 = "Was it a car or a cat I saw";
        System.out.println("the string is: " + "\"" + str2 + "\"");
        System.out.println("reversed string is: " + palindrome.reverse(str2));
        System.out.println("is this string palindrome? " + palindrome.isPalindrome(str2));
        System.out.println("=======================");
        System.out.println();

        // 3. test Words
        Words words = new Words();
        String str3 = "my first name is hang, my last name is zhang, what is your name?";
        System.out.println("the string is: " + "\"" + str3 + "\"");
        words.countWords(str3);
        System.out.println("=======================");
        System.out.println();

        // 4. test Consonants
        Consonants consonants = new Consonants();
        String str4 = "hello, I enjoy coding";
        System.out.println("the string is: " + "\"" + str4 + "\"");
        consonants.countAndReplaceConsonants(str4);
        System.out.println("=======================");
        System.out.println();

        // 5. test LastLetterCount
        LastLetterCount lastLetterCount = new LastLetterCount();
        String str5 = "This is why we have words that end with y";
        System.out.println("the string is: " + "\"" + str5 + "\"");
        lastLetterCount.countAndSwitch(str5);
        System.out.println("=======================");
        System.out.println();
    }
}
